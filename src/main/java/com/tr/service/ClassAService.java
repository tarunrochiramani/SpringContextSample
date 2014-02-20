/*
 * Project Horizon
 * (c) 2013-2014 VMware, Inc. All rights reserved.
 * VMware Confidential.
 */
package com.tr.service;

import com.tr.entity.ClassA;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassAService {
    private static Logger logger = Logger.getLogger(ClassAService.class);

    @Autowired
    private ClassA classA;

    public String printout() {
        String str = "ClassAService " + classA;
        logger.info(str);
        return str;
    }
}
