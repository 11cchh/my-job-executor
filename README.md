# my-job-executor
执行器项目

本地启动:
VM options 参数需要添加 -Dspring.profiles.active=多环境参数

jar包启动:
nohup java -jar job-admin.jar --spring.profiles.active=多环境参数 > admin.log 2>&1 &
nohup java -jar job-executor.jar --spring.profiles.active=多环境参数 > executor.log 2>&1 &