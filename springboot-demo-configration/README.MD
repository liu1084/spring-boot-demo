#spring boot
1. 在controller通过configuration注入bean
2. 在configuration中读取properties文件，读取key／value
3. 配置dev-tools

#run

```shell
mvn clean install spring-boot:run
```

#用repackage打war包

1. 建立项目的子模块，先删除原有的src，添加springboot子模块
2. 修改父级的pom文件，package->pom，添加models，指向子模块的名字，添加repackage
3. 修改子模块的pom文件，package，可以为jar或者war并修改父模块
4. 切换到子模块下，打包即可