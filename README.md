## Examination
### 1. 基本信息

~~~
A very simple freshman physical examination entry system.
Base on JAVA.
Caught by ks.
~~~

### 2. 技术栈

~~~
S
~~~

### 3. 工程目录结构

~~~ 
:.
├─src
│  └─main
│      ├─java
│      │  └─cn
│      │      └─ksling
│      │          └─examination
│      │              │  ExaminationApplication.java
│      │              │
│      │              ├─config
│      │              │      MvcConfig.java
│      │              │      ShiroConfig.java
│      │              │
│      │              ├─controller
│      │              │      AdminController.java
│      │              │      BookController.java
│      │              │      ChartController.java
│      │              │      EyeInfoController.java
│      │              │      FacialFeatureInfoController.java
│      │              │      GeneralInfoController.java
│      │              │      IndexController.java
│      │              │      InternalInfoController.java
│      │              │      LoginController.java
│      │              │      OperationController.java
│      │              │      ResultInfoController.java
│      │              │      SurgeryInfoController.java
│      │              │      ThemeController.java
│      │              │      UserController.java
│      │              │
│      │              ├─entity
│      │              │      Book.java
│      │              │      BookOrder.java
│      │              │      BookOrderVo.java
│      │              │      EyeInfo.java
│      │              │      FacialFeaturesInfo.java
│      │              │      GeneralInfo.java
│      │              │      InternalInfo.java
│      │              │      Msg.java
│      │              │      News.java
│      │              │      Permission.java
│      │              │      ResultInfo.java
│      │              │      SurgeryInfo.java
│      │              │      SysLog.java
│      │              │      Theme.java
│      │              │      User.java
│      │              │
│      │              ├─interceptor
│      │              │      LoginInterceptor.java
│      │              │
│      │              ├─mapper
│      │              │      BookMapper.java
│      │              │      BookMapper.xml
│      │              │      BookOrderMapper.java
│      │              │      BookOrderMapper.xml
│      │              │      EyeInfoMapper.java
│      │              │      EyeInfoMapper.xml
│      │              │      FacialFeaturesInfoMapper.java
│      │              │      FacialFeaturesInfoMapper.xml
│      │              │      GeneralInfoMapper.java
│      │              │      GeneralInfoMapper.xml
│      │              │      InternalInfoMapper.java
│      │              │      InternalInfoMapper.xml
│      │              │      NewsMapper.java
│      │              │      NewsMapper.xml
│      │              │      PermissionMapper.java
│      │              │      PermissionMapper.xml
│      │              │      ResultInfoMapper.java
│      │              │      ResultInfoMapper.xml
│      │              │      SurgeryInfoMapper.java
│      │              │      SurgeryInfoMapper.xml
│      │              │      SysLogMapper.java
│      │              │      SysLogMapper.xml
│      │              │      ThemeMapper.java
│      │              │      ThemeMapper.xml
│      │              │      UserMapper.java
│      │              │      UserMapper.xml
│      │              │
│      │              ├─realm
│      │              │      ShiroRealm.java
│      │              │
│      │              ├─service
│      │              │  │  BookOrderService.java
│      │              │  │  BookService.java
│      │              │  │  EyeInfoService.java
│      │              │  │  FacialFeaturesInfoService.java
│      │              │  │  GeneralInfoService.java
│      │              │  │  InternalInfoService.java
│      │              │  │  NewsService.java
│      │              │  │  PermissionService.java
│      │              │  │  ResultInfoService.java
│      │              │  │  SurgeryInfoService.java
│      │              │  │  SysLogService.java
│      │              │  │  ThemeService.java
│      │              │  │  UserService.java
│      │              │  │
│      │              │  └─impl
│      │              │          BookOrderServiceImpl.java
│      │              │          BookServiceImpl.java
│      │              │          EyeInfoServiceImpl.java
│      │              │          FacialFeaturesInfoServiceImpl.java
│      │              │          GeneralInfoServiceImpl.java
│      │              │          InternalInfoServiceImpl.java
│      │              │          NewsServiceImpl.java
│      │              │          PermissionServiceImpl.java
│      │              │          ResultInfoServiceImpl.java
│      │              │          SurgeryInfoServiceImpl.java
│      │              │          SysLogServiceImpl.java
│      │              │          ThemeServiceImpl.java
│      │              │          UserServiceImpl.java
│      │              │
│      │              └─utils
│      │                      FtpUtil.java
│      │
│      └─resources
│          │  application.yaml
│          │
│          └─templates
│              │  login.html
│              │  noPermission.html
│              │
│              ├─admin
│              │  │  index.html
│              │  │
│              │  ├─chart
│              │  │      degree.html
│              │  │      gender.html
│              │  │
│              │  ├─common
│              │  │      leftbar.html
│              │  │      topbar.html
│              │  │
│              │  ├─info
│              │  │      eyeInfo.html
│              │  │      facialFeaturesInfo.html
│              │  │      generalInfo.html
│              │  │      internalInfo.html
│              │  │      resultInfo.html
│              │  │      surgeryInfo.html
│              │  │
│              │  ├─operation
│              │  │      printWord.html
│              │  │      upload.html
│              │  │
│              │  ├─process
│              │  │      guide.html
│              │  │      order.html
│              │  │
│              │  └─user
│              │          editAdminPwd.html
│              │          editUserPwd.html
│              │          permission.html
│              │          userInfo.html
│              │
│              └─user
│                  │  index.html
│                  │
│                  ├─common
│                  │      leftbar.html
│                  │      topbar.html
│                  │
│                  ├─info
│                  │      editUserPwd.html
│                  │
│                  └─process
│                          guide.html
│                          order.html
│
└─
~~~

