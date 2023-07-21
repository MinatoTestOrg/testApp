package com.minatodattebayo.testapp.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.minatodattebayo.testapp.base.service.TablenwBaseService;
import com.minatodattebayo.testapp.model.Tablenw;
import com.minatodattebayo.testapp.service.TablenwPerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("Tablenw")
public class TablenwService extends TablenwBaseService<Tablenw> implements ITablenwService<Tablenw>{

		@Autowired
		private  TablenwPerimeterImpl  tablenwPerimeterImpl;

		public TablenwService(ChangelogService changelogService) {
		super(Tablenw.class);	
		setChangelogService(changelogService); 
		
	}
	
	
	protected IPerimeterManager<Tablenw> getPerimeterManager() {
		return tablenwPerimeterImpl;
	}
}