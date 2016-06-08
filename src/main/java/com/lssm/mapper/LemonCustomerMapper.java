package com.lssm.mapper;

import com.lssm.model.LemonCustomer;
import com.lssm.model.LemonCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LemonCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    int countByExample(LemonCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    int deleteByExample(LemonCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    int insert(LemonCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    int insertSelective(LemonCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    List<LemonCustomer> selectByExample(LemonCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    LemonCustomer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    int updateByExampleSelective(@Param("record") LemonCustomer record, @Param("example") LemonCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    int updateByExample(@Param("record") LemonCustomer record, @Param("example") LemonCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    int updateByPrimaryKeySelective(LemonCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lemon_customer
     *
     * @mbggenerated Wed Jun 08 09:49:09 GMT+08:00 2016
     */
    int updateByPrimaryKey(LemonCustomer record);
}