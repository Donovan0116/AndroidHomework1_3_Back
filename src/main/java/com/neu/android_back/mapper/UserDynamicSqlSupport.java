package com.neu.android_back.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6195543+08:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6195543+08:00", comments="Source field: user.ID")
    public static final SqlColumn<String> id = user.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6209769+08:00", comments="Source field: user.Name")
    public static final SqlColumn<String> name = user.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6209769+08:00", comments="Source field: user.password")
    public static final SqlColumn<String> password = user.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6209769+08:00", comments="Source field: user.age")
    public static final SqlColumn<Integer> age = user.age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6209769+08:00", comments="Source field: user.gender")
    public static final SqlColumn<String> gender = user.gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-13T11:24:28.6195543+08:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<String> id = column("ID", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("Name", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Integer> age = column("age", JDBCType.INTEGER);

        public final SqlColumn<String> gender = column("gender", JDBCType.VARCHAR);

        public User() {
            super("user");
        }
    }
}