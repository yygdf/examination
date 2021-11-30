package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.InternalInfo;
import cn.ksling.examination.entity.InternalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InternalInfoMapper {
    long countByExample(InternalInfoExample example);

    int deleteByExample(InternalInfoExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(InternalInfo record);

    int insertSelective(InternalInfo record);

    List<InternalInfo> selectByExample(InternalInfoExample example);

    InternalInfo selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") InternalInfo record, @Param("example") InternalInfoExample example);

    int updateByExample(@Param("record") InternalInfo record, @Param("example") InternalInfoExample example);

    int updateByPrimaryKeySelective(InternalInfo record);

    int updateByPrimaryKey(InternalInfo record);
}