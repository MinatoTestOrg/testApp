package com.minatodattebayo.testapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatodattebayo.testapp.base.controller.TablenwBaseController;
import com.minatodattebayo.testapp.service.ITablenwService;
import com.minatodattebayo.testapp.service.TablenwService;
import com.minatodattebayo.testapp.model.Tablenw;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/tablenws/", produces = "application/json")
public class TablenwController extends TablenwBaseController<ITablenwService<Tablenw>, Tablenw> {
	private static XLogger LOGGER = XLoggerFactory.getXLogger(TablenwController.class);
	public TablenwController(TablenwService tablenwService) {
		super(tablenwService);
	}
}
