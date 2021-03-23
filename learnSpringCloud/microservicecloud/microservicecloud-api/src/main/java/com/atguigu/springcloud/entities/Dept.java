
package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")//用于抑制编译器产生警告信息。
@NoArgsConstructor//生成无参构造方法
@AllArgsConstructor//生成全参构造方法
@Data//生成get()/set()/equals()/hashCode()/toString()等方法
@Accessors(chain=true)//控制getter和setter方法的形式。此规则是链式，推荐使用。
public class Dept implements Serializable //必须序列化
{
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(1L).setDname("技术部").setDb_source("db1");
    }
}




