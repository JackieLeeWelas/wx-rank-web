package cn.jackielee.biz.ranklist.book.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by lxb on 2019/4/27.
 */
public class DDHotSaleBookTop100Data {
    public static final StringBuffer DangDangHotSaleBookTop100DataStr = new StringBuffer().append("[\n" +
            "    {\n" +
            "        \"author\": \"余华\",\n" +
            "        \"date\": \"2012-08-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/7/27/25137790-1_l_2.jpg\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"title\": \"活着\",\n" +
            "        \"url\": \"http://product.dangdang.com/25137790.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"周国平\",\n" +
            "        \"date\": \"2017-02-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/28/30/24198400-1_l_4.jpg\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"title\": \"我喜欢生命本来的样子(周国平经典散文作品集)\",\n" +
            "        \"url\": \"http://product.dangdang.com/24198400.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"乔安娜柯尔　著 布鲁斯迪根 图　施芳　译\",\n" +
            "        \"date\": \"2014-04-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/61/3/23444350-1_l_4.jpg\",\n" +
            "        \"press\": \"贵州人民出版社\",\n" +
            "        \"title\": \"神奇校车・桥梁书版\",\n" +
            "        \"url\": \"http://product.dangdang.com/23444350.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"郑利强 段虹(绘) 步印童书 出品\",\n" +
            "        \"date\": \"2016-06-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/42/6/23967348-1_l_17.jpg\",\n" +
            "        \"press\": \"新世界出版社\",\n" +
            "        \"title\": \"我的第一本地理启蒙书\",\n" +
            "        \"url\": \"http://product.dangdang.com/23967348.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（日）太宰治　著，杨伟　译\",\n" +
            "        \"date\": \"2015-08-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/56/4/23761145-1_l_2.jpg\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"title\": \"人间失格\",\n" +
            "        \"url\": \"http://product.dangdang.com/23761145.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（荷）丹姆  著，漆仰平，爱桐  译\",\n" +
            "        \"date\": \"2007-11-01\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/31/4/20039611-1_l_3.jpg\",\n" +
            "        \"press\": \"贵州人民出版社\",\n" +
            "        \"title\": \"小熊和最好的爸爸\",\n" +
            "        \"url\": \"http://product.dangdang.com/20039611.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"戴维・伽特森\",\n" +
            "        \"date\": \"2017-06-18\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/11/18/25093640-1_l_8.jpg\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"title\": \"雪落香杉树 (福克纳奖得主，全球畅销500万册)\",\n" +
            "        \"url\": \"http://product.dangdang.com/25093640.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"张嘉骅\",\n" +
            "        \"date\": \"2015-09-01\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/80/1/23778791-1_l_4.jpg\",\n" +
            "        \"press\": \"青岛出版社\",\n" +
            "        \"title\": \"少年读史记\",\n" +
            "        \"url\": \"http://product.dangdang.com/23778791.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"(美)乔安娜柯尔 著 ,(美)布鲁斯・迪根 图\",\n" +
            "        \"date\": \"2018-05-10\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/82/19/25252408-1_l_19.jpg\",\n" +
            "        \"press\": \"贵州人民出版社\",\n" +
            "        \"title\": \"神奇校车・图画书版\",\n" +
            "        \"url\": \"http://product.dangdang.com/25252408.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"大冰 著,博集天卷 出品\",\n" +
            "        \"date\": \"2018-06-11\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/93/17/25288851-1_l_30.jpg\",\n" +
            "        \"press\": \"湖南文艺出版社\",\n" +
            "        \"title\": \"你坏\",\n" +
            "        \"url\": \"http://product.dangdang.com/25288851.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"(日)东野圭吾 著，新经典 出品\",\n" +
            "        \"date\": \"2014-05-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/92/3/23464478-1_l_7.jpg\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"title\": \"东野圭吾：解忧杂货店\",\n" +
            "        \"url\": \"http://product.dangdang.com/23464478.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"沈复 著 ， 张佳玮 译，果麦文化 出品\",\n" +
            "        \"date\": \"2015-08-01\",\n" +
            "        \"pic\": \"http://img3m7.ddimg.cn/52/5/23751637-1_l_32.jpg\",\n" +
            "        \"press\": \"天津人民出版社\",\n" +
            "        \"title\": \"浮生六记\",\n" +
            "        \"url\": \"http://product.dangdang.com/23751637.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 简・尼尔森\",\n" +
            "        \"date\": \"2016-07-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/64/6/23990140-1_l_7.jpg\",\n" +
            "        \"press\": \"北京联合出版公司\",\n" +
            "        \"title\": \"《正面管教》修订版\",\n" +
            "        \"url\": \"http://product.dangdang.com/23990140.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"陈卫平著 步印童书 出品\",\n" +
            "        \"date\": \"2014-04-01\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/76/35/23427436-1_l_4.jpg\",\n" +
            "        \"press\": \"新世界出版社\",\n" +
            "        \"title\": \"写给儿童的中国历史\",\n" +
            "        \"url\": \"http://product.dangdang.com/23427436.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"毛姆 著，徐淳刚 译，大星文化 出品，作家榜经典文库，高更 绘\",\n" +
            "        \"date\": \"2017-01-10\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/66/15/24175371-1_l_85.jpg\",\n" +
            "        \"press\": \"浙江文艺出版社\",\n" +
            "        \"title\": \"月亮与六便士\",\n" +
            "        \"url\": \"http://product.dangdang.com/24175371.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英]克莱儿・麦克福尔，白马时光 出品\",\n" +
            "        \"date\": \"2015-06-01\",\n" +
            "        \"pic\": \"http://img3m7.ddimg.cn/86/32/23694647-1_l_8.jpg\",\n" +
            "        \"press\": \"百花洲文艺出版社\",\n" +
            "        \"title\": \"摆渡人\",\n" +
            "        \"url\": \"http://product.dangdang.com/23694647.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"加西亚・马尔克斯 著，新经典 出品\",\n" +
            "        \"date\": \"2017-08-01\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/83/20/25138856-1_l_2.jpg\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"title\": \"马尔克斯：百年孤独\",\n" +
            "        \"url\": \"http://product.dangdang.com/25138856.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美]卡勒德・胡赛尼（Khaled Hosseini） 著，李继宏 译\",\n" +
            "        \"date\": \"2006-05-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/26/14/25238195-1_l_3.jpg\",\n" +
            "        \"press\": \"上海人民出版社\",\n" +
            "        \"title\": \"追风筝的人\",\n" +
            "        \"url\": \"http://product.dangdang.com/25238195.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"佐佐木圭一 著 程亮 译 时代华语 出品\",\n" +
            "        \"date\": \"2016-09-01\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/58/23/24026269-1_l_11.jpg\",\n" +
            "        \"press\": \"北京联合出版公司\",\n" +
            "        \"title\": \"所谓情商高，就是会说话\",\n" +
            "        \"url\": \"http://product.dangdang.com/24026269.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"李思圆 著，文通天下 出品\",\n" +
            "        \"date\": \"2017-12-20\",\n" +
            "        \"pic\": \"http://img3m4.ddimg.cn/58/12/25209814-1_l_2.jpg\",\n" +
            "        \"press\": \"山东文艺出版社\",\n" +
            "        \"title\": \"生活需要仪式感 \",\n" +
            "        \"url\": \"http://product.dangdang.com/25209814.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日]东野圭吾 著，新经典 出品\",\n" +
            "        \"date\": \"2017-08-09\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/62/32/25119332-1_l_9.jpg\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"title\": \"东野圭吾：白夜行\",\n" +
            "        \"url\": \"http://product.dangdang.com/25119332.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"(法)安托万・德・圣埃克苏佩里 著，李继宏 译，果麦文化 出品\",\n" +
            "        \"date\": \"2013-01-01\",\n" +
            "        \"pic\": \"http://img3m3.ddimg.cn/81/7/23055003-1_l_28.jpg\",\n" +
            "        \"press\": \"天津人民出版社\",\n" +
            "        \"title\": \"小王子\",\n" +
            "        \"url\": \"http://product.dangdang.com/23055003.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘慈欣\",\n" +
            "        \"date\": \"2010-11-01\",\n" +
            "        \"pic\": \"http://img3m4.ddimg.cn/32/35/23579654-1_l_3.jpg\",\n" +
            "        \"press\": \"重庆出版社\",\n" +
            "        \"title\": \"三体：全三册 刘慈欣代表作，亚洲首部“雨果奖”获奖作品！\",\n" +
            "        \"url\": \"http://product.dangdang.com/23579654.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"钱钟书　著\",\n" +
            "        \"date\": \"1991-02-01\",\n" +
            "        \"pic\": \"http://img3m4.ddimg.cn/32/28/22819334-1_l_3.jpg\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"title\": \"围城\",\n" +
            "        \"url\": \"http://product.dangdang.com/22819334.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"黄仁宇\",\n" +
            "        \"date\": \"2006-06-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/98/7/23445575-1_l_5.jpg\",\n" +
            "        \"press\": \"生活.读书.新知三联书店\",\n" +
            "        \"title\": \"万历十五年 一本好书 腾讯视频栏目推荐\",\n" +
            "        \"url\": \"http://product.dangdang.com/23445575.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）加・泽文 Gabrielle Zevin 著；孙仲旭、李玉瑶 译；读客文化 出品\",\n" +
            "        \"date\": \"2015-05-08\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/74/1/23685329-1_l_28.jpg\",\n" +
            "        \"press\": \"江苏文艺出版社\",\n" +
            "        \"title\": \"岛上书店\",\n" +
            "        \"url\": \"http://product.dangdang.com/23685329.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"贾平凹 著 时代华语 出品\",\n" +
            "        \"date\": \"2016-05-01\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/51/7/23964981-1_l_5.jpg\",\n" +
            "        \"press\": \"长江文艺出版社\",\n" +
            "        \"title\": \"自在独行     贾平凹的独行世界\",\n" +
            "        \"url\": \"http://product.dangdang.com/23964981.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"姜自霞\",\n" +
            "        \"date\": \"2017-05-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/97/1/25081450-1_l_7.jpg\",\n" +
            "        \"press\": \"浙江少年儿童出版社\",\n" +
            "        \"title\": \"魔法拼音国\",\n" +
            "        \"url\": \"http://product.dangdang.com/25081450.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"张嘉佳 著,博集天卷 出品\",\n" +
            "        \"date\": \"2018-07-01\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/77/23/25295369-1_l_12.jpg\",\n" +
            "        \"press\": \"湖南文艺出版社\",\n" +
            "        \"title\": \"云边有个小卖部\",\n" +
            "        \"url\": \"http://product.dangdang.com/25295369.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"路遥 著，新经典 出品\",\n" +
            "        \"date\": \"2017-06-01\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/41/25/25090502-1_l_5.jpg\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"title\": \"平凡的世界：全三册\",\n" +
            "        \"url\": \"http://product.dangdang.com/25090502.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"海明威 罗曼・罗兰 塞尔玛・拉格洛夫 等，张荣梅 策划，小当当童书馆 出品\",\n" +
            "        \"date\": \"2017-04-01\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/37/13/25062481-1_l_2.jpg\",\n" +
            "        \"press\": \"辽宁少年儿童出版社\",\n" +
            "        \"title\": \"诺奖少年版\",\n" +
            "        \"url\": \"http://product.dangdang.com/25062481.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"(日)山下英子\",\n" +
            "        \"date\": \"2013-07-01\",\n" +
            "        \"pic\": \"http://img3m3.ddimg.cn/68/20/23271503-1_l_7.jpg\",\n" +
            "        \"press\": \"广西科学技术出版社\",\n" +
            "        \"title\": \"断舍离\",\n" +
            "        \"url\": \"http://product.dangdang.com/23271503.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"杨绛\",\n" +
            "        \"date\": \"2003-07-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/9/27/22880790-1_l_2.jpg\",\n" +
            "        \"press\": \"生活.读书.新知三联书店\",\n" +
            "        \"title\": \"我们仨\",\n" +
            "        \"url\": \"http://product.dangdang.com/22880790.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"老杨的猫头鹰\",\n" +
            "        \"date\": \"2017-11-11\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/88/17/25180441-1_l_17.jpg\",\n" +
            "        \"press\": \"现代出版社\",\n" +
            "        \"title\": \"好看的皮囊千篇一律，有趣的灵魂万里挑一\",\n" +
            "        \"url\": \"http://product.dangdang.com/25180441.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）玛兹丽施　著，安燕玲　译\",\n" +
            "        \"date\": \"2016-09-01\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/17/7/24044642-1_l_16.jpg\",\n" +
            "        \"press\": \"中央编译出版社\",\n" +
            "        \"title\": \"如何说孩子才会听 怎么听孩子才肯说\",\n" +
            "        \"url\": \"http://product.dangdang.com/24044642.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王小波 著，新经典 出品\",\n" +
            "        \"date\": \"2017-04-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/35/24/24516890-1_l_3.jpg\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"title\": \"一只特立独行的猪\",\n" +
            "        \"url\": \"http://product.dangdang.com/24516890.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"(美）莱曼・弗兰克・鲍姆，（德）格林兄弟，（丹）安徒生等著，张荣梅 策划，小当当童书馆 出品\",\n" +
            "        \"date\": \"2016-09-15\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/94/24/24030562-1_l_14.jpg\",\n" +
            "        \"press\": \"北京联合出版公司\",\n" +
            "        \"title\": \"百年童话绘本・典藏版\",\n" +
            "        \"url\": \"http://product.dangdang.com/24030562.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"杨绛\",\n" +
            "        \"date\": \"2018-06-01\",\n" +
            "        \"pic\": \"http://img3m4.ddimg.cn/49/19/25284154-1_l_3.jpg\",\n" +
            "        \"press\": \"生活.读书.新知三联书店\",\n" +
            "        \"title\": \"我们仨\",\n" +
            "        \"url\": \"http://product.dangdang.com/25284154.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"著 （日）莳田晋至，译 吴佳芬，绘 （日）长谷川知子\",\n" +
            "        \"date\": \"2017-02-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/64/16/24194575-1_l_3.jpg\",\n" +
            "        \"press\": \"青岛出版社\",\n" +
            "        \"title\": \"在教室说错了没关系\",\n" +
            "        \"url\": \"http://product.dangdang.com/24194575.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"高春香，邵敏 著，许明振，李婧 绘\",\n" +
            "        \"date\": \"2015-09-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/20/15/23808035-1_l_2.jpg\",\n" +
            "        \"press\": \"海豚出版社\",\n" +
            "        \"title\": \"这就是二十四节气\",\n" +
            "        \"url\": \"http://product.dangdang.com/23808035.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"慕颜歌  著，文通天下  出品\",\n" +
            "        \"date\": \"2016-09-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/8/24/24015725-1_l_11.jpg\",\n" +
            "        \"press\": \"古吴轩出版社\",\n" +
            "        \"title\": \"你的善良必须有点锋芒\",\n" +
            "        \"url\": \"http://product.dangdang.com/24015725.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"余华\",\n" +
            "        \"date\": \"2017-09-12\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/15/26/25160766-1_l_3.jpg\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"title\": \"许三观卖血记\",\n" +
            "        \"url\": \"http://product.dangdang.com/25160766.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"陈磊（笔名：二混子） 著；读客文化 出品\",\n" +
            "        \"date\": \"2018-04-20\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/34/33/25252459-1_l_19.jpg\",\n" +
            "        \"press\": \"江苏凤凰文艺出版社\",\n" +
            "        \"title\": \"半小时漫画世界史\",\n" +
            "        \"url\": \"http://product.dangdang.com/25252459.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"高铭 著，磨铁图书 出品\",\n" +
            "        \"date\": \"2018-05-01\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/96/32/25285092-1_l_4.jpg\",\n" +
            "        \"press\": \"北京联合出版有限公司\",\n" +
            "        \"title\": \"天才在左 疯子在右(2018全新完整版)\",\n" +
            "        \"url\": \"http://product.dangdang.com/25285092.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日]稻盛和夫 著，曹岫云 译\",\n" +
            "        \"date\": \"2016-03-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/7/28/23932960-1_l_16.jpg\",\n" +
            "        \"press\": \"中国大百科全书出版社\",\n" +
            "        \"title\": \"阿米巴经营――畅销十周年纪念版，当当全国独家\",\n" +
            "        \"url\": \"http://product.dangdang.com/23932960.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"东野圭吾 著，刘子倩 译，新经典 出品\",\n" +
            "        \"date\": \"2014-06-01\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/25/12/23490646-1_l_1.jpg\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"title\": \"东野圭吾：嫌疑人X的献身\",\n" +
            "        \"url\": \"http://product.dangdang.com/23490646.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"曹文轩   著\",\n" +
            "        \"date\": \"2013-09-01\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/83/1/23323691-1_l_4.jpg\",\n" +
            "        \"press\": \"天天出版社有限责任公司\",\n" +
            "        \"title\": \"曹文轩文集典藏版\",\n" +
            "        \"url\": \"http://product.dangdang.com/23323691.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"史蒂芬・霍金\",\n" +
            "        \"date\": \"2014-06-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/69/27/463785-1_l_1.jpg\",\n" +
            "        \"press\": \"湖南科技出版社\",\n" +
            "        \"title\": \"时间简史\",\n" +
            "        \"url\": \"http://product.dangdang.com/463785.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"〔英〕安东尼・布朗\",\n" +
            "        \"date\": \"2014-05-01\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/34/20/23483032-1_l_9.jpg\",\n" +
            "        \"press\": \"\",\n" +
            "        \"title\": \"我爸爸+我妈妈\",\n" +
            "        \"url\": \"http://product.dangdang.com/23483032.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"陈卫平、陈雨岚等 步印童书 出品\",\n" +
            "        \"date\": \"2016-09-01\",\n" +
            "        \"pic\": \"http://img3m3.ddimg.cn/15/4/24044343-1_l_6.jpg\",\n" +
            "        \"press\": \"新世界出版社\",\n" +
            "        \"title\": \"写给儿童的中国地理\",\n" +
            "        \"url\": \"http://product.dangdang.com/24044343.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"马西米利亚诺・ 威尔吉利奥，白马时光 出品\",\n" +
            "        \"date\": \"2018-05-01\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/92/8/25268159-1_l_6.jpg\",\n" +
            "        \"press\": \"百花洲文艺出版社\",\n" +
            "        \"title\": \"那不勒斯的萤火\",\n" +
            "        \"url\": \"http://product.dangdang.com/25268159.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[瑞典]弗雷德里克・巴克曼，译者 孟汇一，果麦文化 出品\",\n" +
            "        \"date\": \"2017-05-01\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/77/0/25072421-1_l_11.jpg\",\n" +
            "        \"press\": \"天津人民出版社\",\n" +
            "        \"title\": \"外婆的道歉信\",\n" +
            "        \"url\": \"http://product.dangdang.com/25072421.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（法）克利斯提昂 约里波瓦著郑迪蔚译 ,（法）克利斯提昂 艾利施绘\",\n" +
            "        \"date\": \"2013-06-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/55/35/23257828-1_l_5.jpg\",\n" +
            "        \"press\": \"２１世纪出版社\",\n" +
            "        \"title\": \"不一样的卡梅拉手绘本\",\n" +
            "        \"url\": \"http://product.dangdang.com/23257828.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"(英) 盖温・肯尼迪 (Gavin Kennedy)\",\n" +
            "        \"date\": \"2018-04-06\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/64/22/25247638-1_l_1.jpg\",\n" +
            "        \"press\": \"民主与建设出版社\",\n" +
            "        \"title\": \"谈判：如何在博弈中获得更多(第四版)Everything is Negotiable\",\n" +
            "        \"url\": \"http://product.dangdang.com/25247638.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）克兰兹　著，薛亚男　译\",\n" +
            "        \"date\": \"2013-02-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/34/5/23174548-1_l_2.jpg\",\n" +
            "        \"press\": \"北京科学技术出版社\",\n" +
            "        \"title\": \"独一无二的你+勇敢做自己\",\n" +
            "        \"url\": \"http://product.dangdang.com/23174548.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"法] 阿梅莉・卡斯唐（法）纳塔莉・佩泰斯 著\",\n" +
            "        \"date\": \"2017-09-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/40/16/25165048-1_l_3.jpg\",\n" +
            "        \"press\": \"广西科学技术出版社\",\n" +
            "        \"title\": \"去旅行系列\",\n" +
            "        \"url\": \"http://product.dangdang.com/25165048.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）斯凯瑞  著，李晓评  译\",\n" +
            "        \"date\": \"2007-05-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/39/23/9284655-1_l_12.jpg\",\n" +
            "        \"press\": \"贵州人民出版社\",\n" +
            "        \"title\": \"斯凯瑞金色童书・第一辑\",\n" +
            "        \"url\": \"http://product.dangdang.com/9284655.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王国维　著\",\n" +
            "        \"date\": \"2015-06-01\",\n" +
            "        \"pic\": \"http://img3m7.ddimg.cn/84/13/23715237-1_l_2.jpg\",\n" +
            "        \"press\": \"北京联合出版公司\",\n" +
            "        \"title\": \"人间词话\",\n" +
            "        \"url\": \"http://product.dangdang.com/23715237.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美]卡勒德・胡赛尼（Khaled Hosseini） 著，李继宏 译\",\n" +
            "        \"date\": \"2006-05-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/35/10/23274638-1_l_19.jpg\",\n" +
            "        \"press\": \"上海人民出版社\",\n" +
            "        \"title\": \"追风筝的人\",\n" +
            "        \"url\": \"http://product.dangdang.com/23274638.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美]瑞・达利欧（Ray Dalio）\",\n" +
            "        \"date\": \"2018-01-01\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/21/7/25204629-1_l_10.jpg\",\n" +
            "        \"press\": \"中信出版社\",\n" +
            "        \"title\": \"原则 principles 雷・达里奥著 跨年演讲推荐图书 团购电话:40010...\",\n" +
            "        \"url\": \"http://product.dangdang.com/25204629.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[以色列] 尤瓦尔・赫拉利（Yuval Noah Harari）\",\n" +
            "        \"date\": \"2017-01-01\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/22/7/24186019-1_l_7.jpg\",\n" +
            "        \"press\": \"中信出版社\",\n" +
            "        \"title\": \"见识城邦・人类简史：从动物到上帝\",\n" +
            "        \"url\": \"http://product.dangdang.com/24186019.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）梭罗\",\n" +
            "        \"date\": \"2010-12-01\",\n" +
            "        \"pic\": \"http://img3m3.ddimg.cn/10/14/20971873-1_l_11.jpg\",\n" +
            "        \"press\": \"中国三峡出版社\",\n" +
            "        \"title\": \"瓦尔登湖(珍藏本) 朗读者朗读书目\",\n" +
            "        \"url\": \"http://product.dangdang.com/20971873.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"陈磊（笔名：二混子） 著；读客文化 出品\",\n" +
            "        \"date\": \"2018-05-31\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/81/1/25272999-1_l_9.jpg\",\n" +
            "        \"press\": \"海南出版社\",\n" +
            "        \"title\": \"半小时漫画中国史2\",\n" +
            "        \"url\": \"http://product.dangdang.com/25272999.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"三毛 著，新经典 出品\",\n" +
            "        \"date\": \"2017-04-01\",\n" +
            "        \"pic\": \"http://img3m4.ddimg.cn/91/33/24242914-1_l_3.jpg\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"title\": \"三毛全集02：撒哈拉的故事\",\n" +
            "        \"url\": \"http://product.dangdang.com/24242914.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"龙应台 著，理想国 出品\",\n" +
            "        \"date\": \"2014-01-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/60/0/23407125-1_l_1.jpg\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"title\": \"目送：龙应台“人生三书”之三\",\n" +
            "        \"url\": \"http://product.dangdang.com/23407125.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"林汉达　等著\",\n" +
            "        \"date\": \"2011-07-01\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/21/30/22478862-1_l_1.jpg\",\n" +
            "        \"press\": \"少年儿童出版社\",\n" +
            "        \"title\": \"上下五千年\",\n" +
            "        \"url\": \"http://product.dangdang.com/22478862.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）伍绮诗 著，孙璐 译；读客文化 出品\",\n" +
            "        \"date\": \"2016-09-01\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/1/27/23718322-1_l_13.jpg\",\n" +
            "        \"press\": \"江苏文艺出版社\",\n" +
            "        \"title\": \"无声告白\",\n" +
            "        \"url\": \"http://product.dangdang.com/23718322.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（日）黑柳彻子， 爱心树童书  出品\",\n" +
            "        \"date\": \"2018-05-01\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/66/10/25272786-1_l_3.jpg\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"title\": \"窗边的小豆豆(2018版)\",\n" +
            "        \"url\": \"http://product.dangdang.com/25272786.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"余华 著，新经典 出品\",\n" +
            "        \"date\": \"2017-06-01\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/93/8/25092039-1_l_3.jpg\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"title\": \"活着\",\n" +
            "        \"url\": \"http://product.dangdang.com/25092039.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）乔安娜・柯尔  文，（美）布鲁斯・迪根  图；\",\n" +
            "        \"date\": \"2016-07-13\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/8/12/24012161-1_l_6.jpg\",\n" +
            "        \"press\": \"贵州人民出版社\",\n" +
            "        \"title\": \"神奇校车・手工益智版\",\n" +
            "        \"url\": \"http://product.dangdang.com/24012161.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"孙幼军　著\",\n" +
            "        \"date\": \"2014-07-01\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/73/31/23504059-1_l_7.jpg\",\n" +
            "        \"press\": \"春风文艺出版社\",\n" +
            "        \"title\": \"小猪唏哩呼噜(注音版上、下)\",\n" +
            "        \"url\": \"http://product.dangdang.com/23504059.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘慈欣、[英]赫伯特・乔治・威尔斯、[英]玛丽・雪莱等 著，张荣梅 策划，小当当童书馆 出品\",\n" +
            "        \"date\": \"2018-04-02\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/46/31/25259302-1_l_11.jpg\",\n" +
            "        \"press\": \"浙江教育出版社\",\n" +
            "        \"title\": \"银火箭少年科幻系列 \",\n" +
            "        \"url\": \"http://product.dangdang.com/25259302.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"【美】卢森堡  著，  阮胤华  译\",\n" +
            "        \"date\": \"2016-01-01\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/44/26/23807861-1_l_1.jpg\",\n" +
            "        \"press\": \"华夏出版社\",\n" +
            "        \"title\": \"非暴力沟通\",\n" +
            "        \"url\": \"http://product.dangdang.com/23807861.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"培生集团，海豚传媒 出品\",\n" +
            "        \"date\": \"2017-11-01\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/68/27/25171016-1_l_22.jpg\",\n" +
            "        \"press\": \"湖北少儿出版社\",\n" +
            "        \"title\": \"培生幼儿英语：预备级\",\n" +
            "        \"url\": \"http://product.dangdang.com/25171016.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"郑渊洁　著\",\n" +
            "        \"date\": \"2015-12-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/97/8/23812468-1_l_1.jpg\",\n" +
            "        \"press\": \"浙江少年儿童出版社\",\n" +
            "        \"title\": \"郑渊洁四大名传\",\n" +
            "        \"url\": \"http://product.dangdang.com/23812468.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"丁香医生\",\n" +
            "        \"date\": \"2018-10-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/75/25/25351500-1_l_2.jpg\",\n" +
            "        \"press\": \"四川科技出版社\",\n" +
            "        \"title\": \"健康日历2019：丁香医生(敬请期待2020版丁香日历）(支持丁香医生...\",\n" +
            "        \"url\": \"http://product.dangdang.com/25351500.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"【美】米莎・布莱斯  译 陈灼    ，凤凰阿歇特\",\n" +
            "        \"date\": \"2017-08-08\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/55/0/25119226-1_l_13.jpg\",\n" +
            "        \"press\": \"江苏凤凰美术出版社\",\n" +
            "        \"title\": \"生命 : 万物不可思议的连接方式\",\n" +
            "        \"url\": \"http://product.dangdang.com/25119226.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"余华 著，新经典 出品\",\n" +
            "        \"date\": \"2013-06-01\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/40/5/23257021-1_l_1.jpg\",\n" +
            "        \"press\": \"新星出版社\",\n" +
            "        \"title\": \"第七天\",\n" +
            "        \"url\": \"http://product.dangdang.com/23257021.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"(法)马克・李维 著，博集天卷 出品\",\n" +
            "        \"date\": \"2012-07-01\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/50/30/22788959-1_l_3.jpg\",\n" +
            "        \"press\": \"湖南文艺出版社\",\n" +
            "        \"title\": \"偷影子的人\",\n" +
            "        \"url\": \"http://product.dangdang.com/22788959.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[爱尔兰] 山姆・麦克布雷尼 著，[英] 安妮塔・婕朗 绘，梅子涵 译\",\n" +
            "        \"date\": \"2018-01-01\",\n" +
            "        \"pic\": \"http://img3m0.ddimg.cn/72/6/25218540-1_l_3.jpg\",\n" +
            "        \"press\": \"明天出版社\",\n" +
            "        \"title\": \"信谊世界精选图画书・猜猜我有多爱你\",\n" +
            "        \"url\": \"http://product.dangdang.com/25218540.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"林语堂 著,博集天卷 出品\",\n" +
            "        \"date\": \"2018-01-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/40/0/25211578-1_l_3.jpg\",\n" +
            "        \"press\": \"湖南文艺出版社\",\n" +
            "        \"title\": \"苏东坡传\",\n" +
            "        \"url\": \"http://product.dangdang.com/25211578.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）达芙妮・斯金纳　著，（美）杰瑞・史麦斯　绘，袁颖　译\",\n" +
            "        \"date\": \"2013-04-01\",\n" +
            "        \"pic\": \"http://img3m4.ddimg.cn/58/9/23219914-1_l_1.jpg\",\n" +
            "        \"press\": \"新蕾出版社\",\n" +
            "        \"title\": \"数学帮帮忙\",\n" +
            "        \"url\": \"http://product.dangdang.com/23219914.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"(法) 古斯塔夫・勒庞 著，马晓佳 译\",\n" +
            "        \"date\": \"2018-04-06\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/25/29/25246609-1_l_1.jpg\",\n" +
            "        \"press\": \"民主与建设出版社\",\n" +
            "        \"title\": \"乌合之众 : 大众心理研究\",\n" +
            "        \"url\": \"http://product.dangdang.com/25246609.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"文：〔荷兰〕皮姆?范?赫斯特  图：〔荷兰〕妮可?塔斯马\",\n" +
            "        \"date\": \"2016-09-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/0/6/24144615-1_l_11.jpg\",\n" +
            "        \"press\": \"北京联合出版公司\",\n" +
            "        \"title\": \"我不敢说，我怕被骂\",\n" +
            "        \"url\": \"http://product.dangdang.com/24144615.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"文：〔德〕维尔纳霍尔茨瓦特（WernerHolzwarth）　著，方素珍　译\",\n" +
            "        \"date\": \"2007-04-01\",\n" +
            "        \"pic\": \"http://img3m4.ddimg.cn/62/1/23509394-1_l_9.jpg\",\n" +
            "        \"press\": \"河北教育出版社\",\n" +
            "        \"title\": \"是谁嗯嗯在我的头上\",\n" +
            "        \"url\": \"http://product.dangdang.com/23509394.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（澳）史蒂夫 比达尔夫　著，丰俊功，宋修华　译\",\n" +
            "        \"date\": \"2014-04-01\",\n" +
            "        \"pic\": \"http://img3m1.ddimg.cn/37/24/23457691-1_l_1.jpg\",\n" +
            "        \"press\": \"中信出版社\",\n" +
            "        \"title\": \"养育男孩\",\n" +
            "        \"url\": \"http://product.dangdang.com/23457691.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"北猫\",\n" +
            "        \"date\": \"2016-01-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/38/0/23878838-1_l_5.jpg\",\n" +
            "        \"press\": \"四川少儿出版社\",\n" +
            "        \"title\": \"米小圈脑筋急转弯\",\n" +
            "        \"url\": \"http://product.dangdang.com/23878838.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）凯利?麦格尼格尔 著，磨铁图书 出品\",\n" +
            "        \"date\": \"2017-10-31\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/74/7/25174289-1_l_4.jpg\",\n" +
            "        \"press\": \"文化发展出版社\",\n" +
            "        \"title\": \"自控力\",\n" +
            "        \"url\": \"http://product.dangdang.com/25174289.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"【英】康恩・伊古尔登，【英】哈尔・伊古尔登\",\n" +
            "        \"date\": \"2016-11-01\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/92/11/24104216-1_l_12.jpg\",\n" +
            "        \"press\": \"广西科学技术出版社\",\n" +
            "        \"title\": \"男孩的冒险书\",\n" +
            "        \"url\": \"http://product.dangdang.com/24104216.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）海伦・帕尔默　著\",\n" +
            "        \"date\": \"2016-07-01\",\n" +
            "        \"pic\": \"http://img3m3.ddimg.cn/5/1/23998793-1_l_4.jpg\",\n" +
            "        \"press\": \"北京联合出版公司\",\n" +
            "        \"title\": \"九型人格 : 职场高品质沟通的艺术\",\n" +
            "        \"url\": \"http://product.dangdang.com/23998793.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（韩）高苏珊娜  编著，（韩）金成荣  绘，李明淑  译\",\n" +
            "        \"date\": \"2014-07-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/84/7/9101748-1_l_4.jpg\",\n" +
            "        \"press\": \"北京科学技术出版社\",\n" +
            "        \"title\": \"法布尔昆虫记\",\n" +
            "        \"url\": \"http://product.dangdang.com/9101748.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"克里斯多福・孟 著，张德芬，余慧玲 译，博集天卷 出品\",\n" +
            "        \"date\": \"2015-04-01\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/8/24/23675066-1_l_1.jpg\",\n" +
            "        \"press\": \"湖南文艺出版社\",\n" +
            "        \"title\": \"亲密关系：通往灵魂的桥梁\",\n" +
            "        \"url\": \"http://product.dangdang.com/23675066.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（巴西）保罗・柯艾略 著，新经典 出品\",\n" +
            "        \"date\": \"2018-01-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/50/28/25172978-1_l_5.jpg\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"title\": \"牧羊少年奇幻之旅\",\n" +
            "        \"url\": \"http://product.dangdang.com/25172978.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"〔美〕芭芭拉库尼\",\n" +
            "        \"date\": \"2014-12-01\",\n" +
            "        \"pic\": \"http://img3m7.ddimg.cn/51/14/23633727-1_l_6.jpg\",\n" +
            "        \"press\": \"河北教育出版社\",\n" +
            "        \"title\": \"花婆婆\",\n" +
            "        \"url\": \"http://product.dangdang.com/23633727.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"说词解字辞书研究中心\",\n" +
            "        \"date\": \"2014-02-01\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/74/0/23435948-1_l_11.jpg\",\n" +
            "        \"press\": \"华语教学出版社\",\n" +
            "        \"title\": \"小学生必背古诗词75+80首 近15万多读者好评，不同印次随机发货。\",\n" +
            "        \"url\": \"http://product.dangdang.com/23435948.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"耿帅\",\n" +
            "        \"date\": \"2016-06-01\",\n" +
            "        \"pic\": \"http://img3m2.ddimg.cn/2/13/23926322-1_l_9.jpg\",\n" +
            "        \"press\": \"九州出版社\",\n" +
            "        \"title\": \"所有失去的都会以另一种方式归来 耿帅抖音同款\",\n" +
            "        \"url\": \"http://product.dangdang.com/23926322.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"乔斯坦・贾德\",\n" +
            "        \"date\": \"2017-09-19\",\n" +
            "        \"pic\": \"http://img3m9.ddimg.cn/41/0/25170989-1_l_5.jpg\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"title\": \"苏菲的世界\",\n" +
            "        \"url\": \"http://product.dangdang.com/25170989.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"张嘉骅\",\n" +
            "        \"date\": \"2017-10-20\",\n" +
            "        \"pic\": \"http://img3m8.ddimg.cn/78/26/25178748-1_l_3.jpg\",\n" +
            "        \"press\": \"青岛出版社\",\n" +
            "        \"title\": \"少年读西游记\",\n" +
            "        \"url\": \"http://product.dangdang.com/25178748.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"Highlights杂志社 编绘\",\n" +
            "        \"date\": \"2013-07-01\",\n" +
            "        \"pic\": \"http://img3m6.ddimg.cn/90/4/20948886-1_l_3.jpg\",\n" +
            "        \"press\": \"湖南少年儿童出版社\",\n" +
            "        \"title\": \"美国经典专注力培养大书 \",\n" +
            "        \"url\": \"http://product.dangdang.com/20948886.html\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"〔日〕东野圭吾 著，新经典 出品\",\n" +
            "        \"date\": \"2017-09-01\",\n" +
            "        \"pic\": \"http://img3m5.ddimg.cn/2/17/25154615-1_l_3.jpg\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"title\": \"放学后\",\n" +
            "        \"url\": \"http://product.dangdang.com/25154615.html\"\n" +
            "    }\n" +
            "]");
    public static List<JSONObject> DangDangHotSaleBookTop100Data = null;
    static {
        DangDangHotSaleBookTop100Data = JSON.parseObject(DangDangHotSaleBookTop100DataStr.toString(),List.class);
    }
}
