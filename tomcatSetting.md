tomcat
============
file path
------------
```
conf---|
       |--web.xml(方便tomcat直接測試使用default servlet)
       |--server.xml(port number setting)
       |--tomcat-user.xml(管理介面使用者帳號設定 ref webapps\manager\WEB-INF\jsp\401.jsp)
       |--context.xml(DB setting , servlet重載入設定)
webapp-|
       |--MyWebApp01-|
                     |--META-INFO
                     |--WEB-INFO-|
                                 |-class
                                 |-lib
                                 |-web.xml 
註：
web.xml
  1.url pattern anotation
  2.url對應會以web.xml為主,anotation設定會被蓋掉
  3.load-onstartup 會在server啟動時載入servlet  method init
  4.init parameter
other
  eclipse 檔案路徑與 部屬路徑不同，eclipse預設 reloadable為true
  https://tomcat.apache.org/tomcat-8.0-doc/config/context.html 
  https://tomcat.apache.org/tomcat-9.0-doc/index.html
```
