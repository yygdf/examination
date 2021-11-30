package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.ResultInfo;
import cn.ksling.examination.entity.ResultInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultInfoMapper {
    long countByExample(ResultInfoExample example);

    int deleteByExample(ResultInfoExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(ResultInfo record);

    int insertSelective(ResultInfo record);

    List<ResultInfo> selectByExample(ResultInfoExample example);

    ResultInfo selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") ResultInfo record, @Param("example") ResultInfoExample example);

    int updateByExample(@Param("record") ResultInfo record, @Param("example") ResultInfoExample example);

    int updateByPrimaryKeySelective(ResultInfo record);

    int updateByPrimaryKey(ResultInfo record);
}