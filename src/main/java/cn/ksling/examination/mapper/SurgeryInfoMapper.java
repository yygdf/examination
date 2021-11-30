package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.SurgeryInfo;
import cn.ksling.examination.entity.SurgeryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurgeryInfoMapper {
    long countByExample(SurgeryInfoExample example);

    int deleteByExample(SurgeryInfoExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(SurgeryInfo record);

    int insertSelective(SurgeryInfo record);

    List<SurgeryInfo> selectByExample(SurgeryInfoExample example);

    SurgeryInfo selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") SurgeryInfo record, @Param("example") SurgeryInfoExample example);

    int updateByExample(@Param("record") SurgeryInfo record, @Param("example") SurgeryInfoExample example);

    int updateByPrimaryKeySelective(SurgeryInfo record);

    int updateByPrimaryKey(SurgeryInfo record);
}