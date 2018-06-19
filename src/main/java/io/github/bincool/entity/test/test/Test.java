/**
 * Filename: Test.java
 * Package: io.github.bincool.entity.test.test
 * Copyright: Wchy-bingV All Rights Reserved.QQ:891946049.
 * Description: Test.java
 * Author: wchy.
 * Date: 2018/6/19 13:03.
 * Content: 新增.
 * Version: V1.0.
 */
package io.github.bincool.entity.test.test;

import com.google.gson.Gson;

import java.io.Serializable;
/**
 * <p>
 * Description: Test实体bean.
 * </p>
 * <p>
 * 详细描述：测试类实体bean.
 * </p>
 * Author: wchy.
 * Since: 2018/03/09 17:42:01.
 */
public class Test implements Serializable
{

    /**
     * 自动增长的键值.
     */
    private String id;

    /**
     * String测试.
     */
    private String stringTest;

    /**
     * Integer测试.
     */
    private Integer integerTest;

    /**
     * Double测试.
     */
    private Double doubleTest;
    /**
     * Text测试.
     */
    private String textTest;

    /**
     * Boolean测试.
     */
    private Boolean booleanTest;

    /**
     * 创建时间.
     */
    private String createTime;

    /**
     * 更新时间.
     */
    private String updateTime;

    /**
     * 扩展字段1.
     */
    private String extendColumn1;

    /**
     * 扩展字段2.
     */
    private String extendColumn2;

    /**
     * 扩展字段3.
     */
    private String extendColumn3;

    /**
     * 获取自动增长的键值.
     * @return
     *   键值.
     */
    public String getId()
    {
        return id;
    }

    /**
     * 设置自动增长的键值.
     * @param id
     *   键值.
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * 获取stringTest.
     * @return
     *    String测试.
     */
    public String getStringTest()
    {
        return stringTest;
    }

    /**
     * 设置stringTest.
     * @param stringTest
     *   String测试.
     */
    public void setStringTest(String stringTest)
    {
        this.stringTest = stringTest;
    }

    /**
     * 获取integerTest.
     * @return
     *    Integer测试.
     */
    public Integer getIntegerTest()
    {
        return integerTest;
    }

    /**
     * 设置integerTest.
     * @param integerTest
     *   Integer测试.
     */
    public void setIntegerTest(Integer integerTest)
    {
        this.integerTest = integerTest;
    }

    /**
     * 获取doubleTest.
     * @return
     *    Double测试.
     */
    public Double getDoubleTest()
    {
        return doubleTest;
    }

    /**
     * 设置doubleTest.
     * @param doubleTest
     *   Double测试.
     */
    public void setDoubleTest(Double doubleTest)
    {
        this.doubleTest = doubleTest;
    }

    /**
     * 获取textTest.
     * @return
     *    Text测试.
     */
    public String getTextTest()
    {
        return textTest;
    }

    /**
     * 设置textTest.
     * @param textTest
     *   Text测试.
     */
    public void setTextTest(String textTest)
    {
        this.textTest = textTest;
    }

    /**
     * 获取booleanTest.
     * @return
     *    Boolean测试.
     */
    public Boolean getBooleanTest()
    {
        return booleanTest;
    }

    /**
     * 设置booleanTest.
     * @param booleanTest
     *   Boolean测试.
     */
    public void setBooleanTest(Boolean booleanTest)
    {
        this.booleanTest = booleanTest;
    }

    /**
     * 获取createTime.
     * @return
     * 		创建时间.
     */
    public String getCreateTime()
    {
        return createTime;
    }

    /**
     * 设置创建时间.
     * @param createTime
     * 		创建时间.
     */
    public void setCreateTime(String createTime)
    {
        this.createTime = createTime;
    }

    /**
     * 获取updateTime.
     * @return
     * 		更新时间.
     */
    public String getUpdateTime()
    {
        return updateTime;
    }

    /**
     * 设置updateTime.
     * @param updateTime
     * 		更新时间.
     */
    public void setUpdateTime(String updateTime)
    {
        this.updateTime = updateTime;
    }

    /**
     * 获取extendColumn1.
     * @return
     * 		扩展字段1.
     */
    public String getExtendColumn1()
    {
        return extendColumn1;
    }

    /**
     * 设置extendColumn1.
     * @param extendColumn1
     * 		扩展字段1.
     */
    public void setExtendColumn1(String extendColumn1)
    {
        this.extendColumn1 = extendColumn1;
    }

    /**
     * 获取extendColumn2.
     * @return
     * 		扩展字段2.
     */
    public String getExtendColumn2()
    {
        return extendColumn2;
    }

    /**
     * 设置extendColumn2.
     * @param extendColumn2
     * 		扩展字段2.
     */
    public void setExtendColumn2(String extendColumn2)
    {
        this.extendColumn2 = extendColumn2;
    }

    /**
     * 获取extendColumn3.
     * @return
     * 		扩展字段3.
     */
    public String getExtendColumn3()
    {
        return extendColumn3;
    }

    /**
     * 设置extendColumn3.
     * @param extendColumn3
     * 		扩展字段3.
     */
    public void setExtendColumn3(String extendColumn3)
    {
        this.extendColumn3 = extendColumn3;
    }

    @Override
    public String toString()
    {
        return new Gson().toJson(this);
    }

}
