package com.ihyht.alyxjs.kfzpt.portal;

//import com.ihyht.alyxjs.nbjcpt.component.generator.CodeGenerator;
import com.ihyht.alyxjs.nbjcpt.component.generator.CodeGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zxbking on 2019/5/6.
 */
public class CodeGeneratorTest {
        @Test
        public void run() throws Exception {
            //模型路径
            String base = "D:\\Codebase\\pxcs\\hyht-alyxjs-kfzpt\\module-service-portal\\src\\main\\java\\com\\ihyht\\alyxjs\\kfzpt\\service\\portal\\rds\\portal\\";
            String path = base+"model";
            String controllerPath = "D:\\Codebase\\pxcs\\hyht-alyxjs-kfzpt\\alyxjs-kfzpt-portal\\src\\main\\java\\com\\ihyht\\alyxjs\\kfzpt\\portal\\console";
            String daoPath = base;
            String packageController = "com.ihyht.alyxjs.kfzpt.portal.console";
            String dao = "com.ihyht.alyxjs.kfzpt.service.portal.rds.portal";
            String rooturi = "/rest";
            String abstractRestControllerUri = "com.ihyht.alyxjs.kfzpt.portal.base.AbstractRestController";
            String baseVoUri = "com.ihyht.alyxjs.nbjcpt.base.BaseVo";
            CodeGenerator.run(path,controllerPath,daoPath,packageController,dao,rooturi,abstractRestControllerUri,baseVoUri,true);
        }
}