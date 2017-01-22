package congye6.HotelBooking.blservice.client.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import congye6.HotelBooking.blservice.client.ClientBlService;
import congye6.HotelBooking.blservice.client.CreditBlService;
import congye6.HotelBooking.enumeration.CreditOperation;
import congye6.HotelBooking.mapper.client.ClientMapper;
import congye6.HotelBooking.mapper.client.CreditRecordMapper;
import congye6.HotelBooking.po.CreditRecordPO;
import congye6.HotelBooking.util.DateUtil;
import congye6.HotelBooking.vo.ClientVO;
import congye6.HotelBooking.vo.CreditRecordVO;
import congye6.HotelBooking.vo.ResultMessage;
@Service
public class CreditBl implements CreditBlService{

	@Autowired
	private CreditRecordMapper creditRecordMapper;
	
	@Autowired
	private ClientMapper clientMapper;
	
	@Autowired
	private ClientBlService clientBl;
	
	@Override
	public ResultMessage cancelOrder(int userId,int orderId, double money) {
		//修改的用户记录数，为0时表示出错
		int updateNum=clientMapper.minusCredit(userId, money/2);
		if(updateNum==0)
			return new ResultMessage(false, "信用记录更新失败");
		
		ClientVO clientInfo=clientBl.getClientInfo(userId);
		
		//保存使用记录
		CreditRecordPO record=new CreditRecordPO(userId, DateUtil.getToday(), orderId, 
				CreditOperation.ORDER_CANCEL.toString(), money/2, clientInfo.credit);
		creditRecordMapper.addCreditRecord(record);
		
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage exceptionOrder(int userId,int orderId, double money) {
		//修改的用户记录数，为0时表示出错
		int updateNum=clientMapper.minusCredit(userId, money);
		if(updateNum==0)
			return new ResultMessage(false, "扣除信用值失败");
		
		ClientVO clientInfo=clientBl.getClientInfo(userId);
		//保存使用记录
		CreditRecordPO record=new CreditRecordPO(userId, DateUtil.getToday(), orderId, 
				CreditOperation.ORDER_EXCEPTION.toString(), money, clientInfo.credit);
		creditRecordMapper.addCreditRecord(record);
		
		return new ResultMessage(true);
	}

	@Override
	public ResultMessage successOrder(int userId,int orderId, double money) {
		// 修改的用户记录数，为0时表示出错
		int updateNum = clientMapper.addCredit(userId, money);
		if (updateNum == 0)
			return new ResultMessage(false, "增加信用值失败");

		ClientVO clientInfo = clientBl.getClientInfo(userId);
		// 保存使用记录
		CreditRecordPO record = new CreditRecordPO(userId, DateUtil.getToday(), orderId,
				CreditOperation.ORDER_EXCUTE.toString(), money, clientInfo.credit);
		creditRecordMapper.addCreditRecord(record);

		return new ResultMessage(true);
	}

	@Override
	public ResultMessage recharge(int userId,double money) {
		//修改的用户记录数，为0时表示出错
		int updateNum=clientMapper.addCredit(userId, money*100);
		if(updateNum==0)
			return new ResultMessage(false, "扣除信用值失败");
		
		ClientVO clientInfo=clientBl.getClientInfo(userId);
		//保存使用记录
		CreditRecordPO record=new CreditRecordPO(userId, DateUtil.getToday(), 0, 
				CreditOperation.RECHARGE.toString(), money*100, clientInfo.credit);
		creditRecordMapper.addCreditRecord(record);
		
		return new ResultMessage(true);
	}

	@Override
	public List<CreditRecordVO> getCreditRecords(int userId) {
		List<CreditRecordPO> records=creditRecordMapper.getCreditRecords(userId);
		List<CreditRecordVO> results=new ArrayList<>();
		for(CreditRecordPO record:records){
			CreditRecordVO vo=new CreditRecordVO();
			BeanUtils.copyProperties(record, vo);
			vo.operation=CreditOperation.valueOf(record.getCreditOperation());
			results.add(vo);
		}
		return results;
	}

}
