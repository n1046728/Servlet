# test01
## MyCounter1
1. Anotation setting url-pattern 
2. web.xml setting url-pattern
3. Setting 1&&2 will use web.xml if u set metadata-complete='true' in web.xml
4. Setting <load-on-startup>tag and set value >0(default -1) in web.xml. This Servlet will loaded when server startup.
5. URL Mapping 
   * http://主機:port/<Servlet Context Path>/XXX.html    ->明確對應
   * http://主機:port/<Servlet Context Path>/XXX.html/*  ->前置路徑對應
   * http://主機:port/<Servlet Context Path>/*.html      ->延伸檔名對應 

