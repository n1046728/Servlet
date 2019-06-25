# test01
## MyCounter1
1. Anotation setting url-pattern 
2. web.xml setting url-pattern
3. Setting 1&&2 will use web.xml if u set metadata-complete='true' in web.xml
4. Setting <load-on-startup>tag and set value >0(default -1) in web.xml. This Servlet will loaded when server startup.
## MyCounter2
   URL Mapping 
   * http://主機:port/<Servlet Context Path>/XXX.html    ->明確對應
   * http://主機:port/<Servlet Context Path>/XXX.html/*  ->前置路徑對應
   * http://主機:port/<Servlet Context Path>/*.html      ->延伸檔名對應 
## MyCounter3 
   initParam
## MyCounter4
   Sychronization test open two ie to test ,it will happen get the same count
   Solution:
   1. synchronized public void doGet().... not efficent
   2. synchronized(this){count++}.... handle critical section
   3. synchronized(this){ int local_count =++count}.... declare local variable 
   4. if program not necessary persist variable,u can use local variable to avoid race condition
## MyCounter5
   destroy method may let u save data to db or file that can helpful to use it next time (init method).
## Background Thread
   * ex.股票即時回應系統、排程器
   * init()啟動、doGet()處理回應結果、destroy()結束
   * 注意背景執行訊由destroy()負責停止，否則會執行到JVM停止為止，甚至Servlet Reloading時不但不會停止，還會重新產生背景執行緒
