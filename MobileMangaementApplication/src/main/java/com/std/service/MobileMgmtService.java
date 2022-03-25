package com.std.service;

import java.util.List;
import java.util.Optional;

import com.std.entity.Mobile;

public interface MobileMgmtService {
	
	Mobile addmobile(Mobile mobile);

	Mobile updatemobile(Mobile mobile);

	void deletemobile(int mobId);

	Optional<Mobile> getmobile(int mobId);

	Iterable<Mobile> getAllmobiles();

}
