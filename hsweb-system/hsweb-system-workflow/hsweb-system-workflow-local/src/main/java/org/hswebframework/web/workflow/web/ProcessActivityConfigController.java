package org.hswebframework.web.workflow.web;

import io.swagger.annotations.Api;
import org.hswebframework.web.authorization.annotation.Authorize;
import org.hswebframework.web.commons.entity.param.QueryParamEntity;
import org.hswebframework.web.controller.SimpleGenericEntityController;
import org.hswebframework.web.service.CrudService;
import org.hswebframework.web.workflow.dao.entity.ActivityConfigEntity;
import org.hswebframework.web.workflow.dao.entity.ProcessDefineConfigEntity;
import org.hswebframework.web.workflow.service.ActivityConfigService;
import org.hswebframework.web.workflow.service.ProcessDefineConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhao
 * @since 3.0.0-RC
 */
@RestController
@RequestMapping("/workflow/process/configuration/activity")
@Authorize(permission = "workflow-definition", description = "工作流-流程定义管理")
@Api(tags = "工作流-流程定义-环节配置")
public class ProcessActivityConfigController
        implements SimpleGenericEntityController<ActivityConfigEntity, String, QueryParamEntity> {
    @Autowired
    private ActivityConfigService service;

    @Override
    public CrudService<ActivityConfigEntity, String> getService() {
        return service;
    }


}
