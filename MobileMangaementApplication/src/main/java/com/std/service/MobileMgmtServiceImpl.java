package com.std.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.std.dao.MobileDao;
import com.std.entity.Mobile;

@Service
@Transactional
public class MobileMgmtServiceImpl implements MobileMgmtService {
	
	@Autowired
	MobileDao md;

	@Override
	public Mobile addmobile(Mobile mobile) {
		
		return md.save(mobile);
	}

	@Override
	public Mobile updatemobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return md.save(mobile);
	}

	@Override
	public void deletemobile(int mobId) {
		// TODO Auto-generated method stub
		
		md.deleteById(mobId);
	}

	@Override
	public Optional<Mobile> getmobile(int mobId) {
		// TODO Auto-generated method stub
		return md.findById(mobId);
	}

	@Override
	public Iterable<Mobile> getAllmobiles() {
		// TODO Auto-generated method stub
		return md.findAll();
	}
	
	
	

}
