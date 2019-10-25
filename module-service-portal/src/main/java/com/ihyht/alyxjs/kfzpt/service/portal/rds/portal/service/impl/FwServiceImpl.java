package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper.*;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.*;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.*;
import java.util.Map;


@Service
public class FwServiceImpl implements FwService {
    @Autowired
    private FwMapper fwMapper;

    @Override
    public boolean addFw(Fw fw) {
        int flag = fwMapper.insertSelective(fw);
        return flag==1;
    }

    @Override
    public Fw findById(String id) {
        Fw CeShi = fwMapper.selectByPrimaryKey(id);
        return CeShi;
    }

    @Override
    public boolean deleteFwById(String id) {
        int flag = fwMapper.deleteByPrimaryKey(id);
        return flag==1;
    }

    @Override
    public boolean updateFw(Fw fw) {
        int flag=0;
        if(fw!=null ){
            if(fw.getId()!=null ){
                flag = fwMapper.updateByPrimaryKeySelective(fw);
            }else {
                throw new RuntimeException("缺少标识");
            }
        }
        return flag==1;
    }

    @Override
    public PageInfo selectFwByExample(Fw fw, Integer pageNo, Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        FwExample example =new FwExample();
        FwExample.Criteria criteria = example.createCriteria();

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.convertValue(fw, Map.class);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if(StringUtils.isNotBlank(entry.getValue()+"")){
                if("id".equals(entry.getKey())){ criteria.andIdLike("%"+entry.getValue()+"%"); continue; }
				if("fwmc".equals(entry.getKey())){ criteria.andFwmcLike("%"+entry.getValue()+"%"); continue; }
				if("fwms".equals(entry.getKey())){ criteria.andFwmsLike("%"+entry.getValue()+"%"); continue; }
				if("fwflId".equals(entry.getKey())){ criteria.andFwflIdLike("%"+entry.getValue()+"%"); continue; }
				if("lrrq".equals(entry.getKey())){ criteria.andLrrqEqualTo(new Date((Long)entry.getValue())); continue; }
				if("xgrq".equals(entry.getKey())){ criteria.andXgrqEqualTo(new Date((Long)entry.getValue())); continue; }
				if("yxbz".equals(entry.getKey())){ criteria.andYxbzLike("%"+entry.getValue()+"%"); continue; }
				if("scbz".equals(entry.getKey())){ criteria.andScbzLike("%"+entry.getValue()+"%"); continue; }
				if("iconId".equals(entry.getKey())){ criteria.andIconIdLike("%"+entry.getValue()+"%"); continue; }
				if("url".equals(entry.getKey())){ criteria.andUrlLike("%"+entry.getValue()+"%"); continue; }
				if("xh".equals(entry.getKey())){ criteria.andXhEqualTo((java.lang.Long)entry.getValue()); continue; }
				if("apiUrl".equals(entry.getKey())){ criteria.andApiUrlLike("%"+entry.getValue()+"%"); continue; }
				if("pch".equals(entry.getKey())){ criteria.andPchLike("%"+entry.getValue()+"%"); continue; }

            }
        }

        example.setOrderByClause("id");
        List<Fw> list = fwMapper.selectByExample(example);
        PageInfo page=new PageInfo(list);
        return page;
    }

    @Override
    public List<Fw> selectAll(){
        FwExample example =new FwExample();
        List<Fw> list = fwMapper.selectByExample(example);
        return list;
    }
}
