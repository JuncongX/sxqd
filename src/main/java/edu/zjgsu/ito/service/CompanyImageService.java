package edu.zjgsu.ito.service;

import edu.zjgsu.ito.model.CompanyImage;
import edu.zjgsu.ito.model.CompanyImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyImageService {
    long countByExample(CompanyImageExample example);

    int deleteByExample(CompanyImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyImage record);

    int insertSelective(CompanyImage record);

    List<CompanyImage> selectByExample(CompanyImageExample example);

    CompanyImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyImage record, @Param("example") CompanyImageExample example);

    int updateByExample(@Param("record") CompanyImage record, @Param("example") CompanyImageExample example);

    int updateByPrimaryKeySelective(CompanyImage record);

    int updateByPrimaryKey(CompanyImage record);
}
