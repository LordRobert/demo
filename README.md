# demo
反向注入的demo项目

### 此项目结构：
1，models是模型层，最底层
2，web层中有controller类, adapter接口；controller中注入了adapter实现类
3，service是业务层，依赖web层，并实现了adapter接口

