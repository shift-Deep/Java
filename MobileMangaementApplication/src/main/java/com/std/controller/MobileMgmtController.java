package com.std.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.std.entity.Mobile;
import com.std.service.MobileMgmtServiceImpl;

@RestController
@RequestMapping("/MobileMgmtApplication")
public class MobileMgmtController {
	@Autowired
	MobileMgmtServiceImpl ms; //service layer object
	
	@PostMapping("/addMobile") //http://localhost:4524/MobileMgmtApplication/addMobile
	public Mobile addMobile(@RequestBody Mobile mobile) {
		
		return ms.addmobile(mobile);
	}
	
	@PutMapping("/updateMobile") //http://localhost:4524/MobileMgmtApplication/updateMobile
	public Mobile updateMobile(@RequestBody Mobile mobile) {
		
		return ms.updatemobile(mobile);
	}
	
	@DeleteMapping("/deleteMobile/{mobId}") //http://localhost:4524/MobileMgmtApplication/deleteMobile/mobId
	public void deletemobile(@PathVariable("mobId") int mobId) {
		ms.deletemobile(mobId);
	}
	
	@GetMapping("/getMobile/{mobId}") //http://localhost:4524/MobileMgmtApplication/getMobile/mobId
	public Optional<Mobile> getmobile(@PathVariable("mobId") int mobId) {
		return ms.getmobile(mobId);
	}
	
	@GetMapping("/getAllMobile") //http://localhost:4524/MobileMgmtApplication/getAllMobile
	public Iterable<Mobile> getAllmobiles(){
		return ms.getAllmobiles();
	}
	

}
