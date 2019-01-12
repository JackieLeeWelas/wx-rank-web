package cn.jackielee.biz.ranklist.book.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by lxb on 2019/1/12.
 */
public class BookTop250Data {
    public static final StringBuilder bookTop250DataStr = new StringBuilder("[\n" +
            "    {\n" +
            "        \"author\": \"[美] 卡勒德·胡赛尼\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1727290.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1770782/\",\n" +
            "        \"date\": \"2006-5\",\n" +
            "        \"press\": \"上海人民出版社\",\n" +
            "        \"desc\": \"为你，千千万万遍\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"359334人评价\",\n" +
            "        \"title\": \"追风筝的人\",\n" +
            "        \"translator\": \"李继宏\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 东野圭吾\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s27264181.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/25862578/\",\n" +
            "        \"date\": \"2014-5\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"一碗精心熬制的东野牌鸡汤，拒绝很难\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"335077人评价\",\n" +
            "        \"title\": \"解忧杂货店\",\n" +
            "        \"translator\": \"李盈春\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[法] 圣埃克苏佩里\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1103152.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1084336/\",\n" +
            "        \"date\": \"2003-8\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"献给长成了大人的孩子们\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"280011人评价\",\n" +
            "        \"title\": \"小王子\",\n" +
            "        \"translator\": \"马振聘\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 东野圭吾\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4610502.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3259440/\",\n" +
            "        \"date\": \"2008-9\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"暗夜独行的残破灵魂，爱与恶本就难分难舍\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"246005人评价\",\n" +
            "        \"title\": \"白夜行\",\n" +
            "        \"translator\": \"刘姿君\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"钱锺书\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1070222.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1008145/\",\n" +
            "        \"date\": \"1991-2\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"对于“人艰不拆”四个字最彻底的违抗\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"219683人评价\",\n" +
            "        \"title\": \"围城\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘慈欣\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s2768378.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2567698/\",\n" +
            "        \"date\": \"2008-1\",\n" +
            "        \"press\": \"重庆出版社\",\n" +
            "        \"desc\": \"你我不过都是虫子\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"199104人评价\",\n" +
            "        \"title\": \"三体\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 东野圭吾\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3254244.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3211779/\",\n" +
            "        \"date\": \"2008-9\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"数学好是一种极致的浪漫\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"194489人评价\",\n" +
            "        \"title\": \"嫌疑人X的献身\",\n" +
            "        \"translator\": \"刘子倩\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 村上春树\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1228930.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1046265/\",\n" +
            "        \"date\": \"2001-2\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"村上之发轫，多少人的青春启蒙\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"211122人评价\",\n" +
            "        \"title\": \"挪威的森林\",\n" +
            "        \"translator\": \"林少华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"余华\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s23836852.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1082154/\",\n" +
            "        \"date\": \"1998-5\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"活着本身就是人生最大的意义\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"177067人评价\",\n" +
            "        \"title\": \"活着\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[哥伦比亚] 加西亚·马尔克斯\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6384944.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/6082808/\",\n" +
            "        \"date\": \"2011-6\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"尼采所谓的永劫复归，一场无始无终的梦魇\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"153843人评价\",\n" +
            "        \"title\": \"百年孤独\",\n" +
            "        \"translator\": \"范晔\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[清] 曹雪芹 著\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1070959.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1007305/\",\n" +
            "        \"date\": \"1996-12\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"谁解其中味？\",\n" +
            "        \"score\": \"9.6\",\n" +
            "        \"scoreNum\": \"146656人评价\",\n" +
            "        \"title\": \"红楼梦\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"柴静\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s24468373.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/20427187/\",\n" +
            "        \"date\": \"2013-1-1\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"在这里看见中国\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"149189人评价\",\n" +
            "        \"title\": \"看见\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[捷克] 米兰·昆德拉\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1091698.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1017143/\",\n" +
            "        \"date\": \"2003-7\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"朝向媚俗的一次伟大的进军\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"149168人评价\",\n" +
            "        \"title\": \"不能承受的生命之轻\",\n" +
            "        \"translator\": \"许钧\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 丹·布朗\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1513425.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1040771/\",\n" +
            "        \"date\": \"2004-2\",\n" +
            "        \"press\": \"上海人民出版社\",\n" +
            "        \"desc\": \"一切畅销的因素都有了\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"141356人评价\",\n" +
            "        \"title\": \"达·芬奇密码\",\n" +
            "        \"translator\": \"朱振武\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"路遥\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2335693.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1200840/\",\n" +
            "        \"date\": \"2005-1\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"中国当代城乡生活全景\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"124201人评价\",\n" +
            "        \"title\": \"平凡的世界（全三部）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘慈欣\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3078482.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3066477/\",\n" +
            "        \"date\": \"2008-5\",\n" +
            "        \"press\": \"重庆出版社\",\n" +
            "        \"desc\": \"无边的黑暗森林，比第一部更为恢弘壮丽\",\n" +
            "        \"score\": \"9.3\",\n" +
            "        \"scoreNum\": \"116453人评价\",\n" +
            "        \"title\": \"三体Ⅱ\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘慈欣\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s26012674.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/5363767/\",\n" +
            "        \"date\": \"2010-11\",\n" +
            "        \"press\": \"重庆出版社\",\n" +
            "        \"desc\": \"终章，何去何从\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"116379人评价\",\n" +
            "        \"title\": \"三体Ⅲ\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 夏洛蒂·勃朗特\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s5924326.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1141406/\",\n" +
            "        \"date\": \"2003-11\",\n" +
            "        \"press\": \"世界图书出版公司\",\n" +
            "        \"desc\": \"灰姑娘在十九世纪\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"119954人评价\",\n" +
            "        \"title\": \"简爱（英文全本）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"杨绛\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1015872.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1023045/\",\n" +
            "        \"date\": \"2003-7\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"平淡，坚忍，温情\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"106210人评价\",\n" +
            "        \"title\": \"我们仨\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"高铭\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s6340977.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4242172/\",\n" +
            "        \"date\": \"2010-2\",\n" +
            "        \"press\": \"武汉大学出版社\",\n" +
            "        \"desc\": \"简称“疯癫与文明”\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"115077人评价\",\n" +
            "        \"title\": \"天才在左 疯子在右\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] J. K. 罗琳\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1990480.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1041007/\",\n" +
            "        \"date\": \"2000-9\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"羽加迪姆勒维奥萨！\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"100261人评价\",\n" +
            "        \"title\": \"哈利·波特与魔法石\",\n" +
            "        \"translator\": \"苏农\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 奥斯丁\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4250062.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1083428/\",\n" +
            "        \"date\": \"1993-7\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"所有现代言情小说的母体\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"99873人评价\",\n" +
            "        \"title\": \"傲慢与偏见\",\n" +
            "        \"translator\": \"张玲\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"当年明月\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1872653.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1873231/\",\n" +
            "        \"date\": \"2006-9\",\n" +
            "        \"press\": \"中国友谊出版公司\",\n" +
            "        \"desc\": \"历史本就是一件件“事儿”拼成的\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"97722人评价\",\n" +
            "        \"title\": \"明朝那些事儿（壹）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘瑜\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4243447.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4238362/\",\n" +
            "        \"date\": \"2010-1\",\n" +
            "        \"press\": \"上海三联书店\",\n" +
            "        \"desc\": \"犀利又温柔，穿过胸口隐隐作痛\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"98751人评价\",\n" +
            "        \"title\": \"送你一颗子弹\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美国] 玛格丽特·米切尔\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1078958.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1068920/\",\n" +
            "        \"date\": \"2000-9\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"革命时期的爱情，随风而逝\",\n" +
            "        \"score\": \"9.3\",\n" +
            "        \"scoreNum\": \"90820人评价\",\n" +
            "        \"title\": \"飘\",\n" +
            "        \"translator\": \"李美华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"龙应台\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s3984108.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3995526/\",\n" +
            "        \"date\": \"2009-10\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"不必追\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"98555人评价\",\n" +
            "        \"title\": \"目送\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1077102.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1090043/\",\n" +
            "        \"date\": \"1997-3-1\",\n" +
            "        \"press\": \"花城出版社\",\n" +
            "        \"desc\": \"一段姻缘，需要一座城的倾覆来成全\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"99385人评价\",\n" +
            "        \"title\": \"倾城之恋\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 东野圭吾\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3814606.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3646172/\",\n" +
            "        \"date\": \"2009-6\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"无缘由的恨，冰冷彻骨\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"93288人评价\",\n" +
            "        \"title\": \"恶意\",\n" +
            "        \"translator\": \"娄美莲\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[哥伦比亚] 加西亚·马尔克斯\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s11284102.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/10594787/\",\n" +
            "        \"date\": \"2012-9-1\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"义无反顾地直达爱情的核心\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"87214人评价\",\n" +
            "        \"title\": \"霍乱时期的爱情\",\n" +
            "        \"translator\": \"杨玲\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[法] 玛格丽特·杜拉斯\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1444578.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1400705/\",\n" +
            "        \"date\": \"2005-7\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"我已经老了，你呢？\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"96524人评价\",\n" +
            "        \"title\": \"情人\",\n" +
            "        \"translator\": \"王道乾\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"沈从文\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1595557.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1057244/\",\n" +
            "        \"date\": \"2002-4\",\n" +
            "        \"press\": \"北岳文艺出版社\",\n" +
            "        \"desc\": \"如水一般的忧愁与怅惘\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"86524人评价\",\n" +
            "        \"title\": \"边城\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] J. K. 罗琳\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1074376.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1071241/\",\n" +
            "        \"date\": \"2000-9\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"小天狼星布莱克\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"82602人评价\",\n" +
            "        \"title\": \"哈利·波特与阿兹卡班的囚徒\",\n" +
            "        \"translator\": \"郑须弥\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"姜戎\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1466042.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1022060/\",\n" +
            "        \"date\": \"2004-4\",\n" +
            "        \"press\": \"长江文艺出版社\",\n" +
            "        \"desc\": \"我们都是 狼的传人？\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"89280人评价\",\n" +
            "        \"title\": \"狼图腾\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] J. K. 罗琳\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1072746.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1009257/\",\n" +
            "        \"date\": \"2001-5\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"整个系列的分水岭，暗色渐浓\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"79763人评价\",\n" +
            "        \"title\": \"哈利·波特与火焰杯\",\n" +
            "        \"translator\": \"马爱新\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"余华\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1074291.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1029791/\",\n" +
            "        \"date\": \"1998-9\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"余华的悲凉，都在那一碗炒猪肝里了\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"81984人评价\",\n" +
            "        \"title\": \"许三观卖血记\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] J. K. 罗琳\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1557672.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1039487/\",\n" +
            "        \"date\": \"2000-9\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"渐入佳境，魔法世界全貌初现\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"79845人评价\",\n" +
            "        \"title\": \"哈利·波特与密室\",\n" +
            "        \"translator\": \"马爱新\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"三毛\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3563113.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1361264/\",\n" +
            "        \"date\": \"1976\",\n" +
            "        \"press\": \"皇冠出版社\",\n" +
            "        \"desc\": \"关于漂泊的一切\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"78898人评价\",\n" +
            "        \"title\": \"撒哈拉的故事\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 村上春树\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4363464.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4742918/\",\n" +
            "        \"date\": \"2010-5\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"村上的野望，欢迎来到1Q84年\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"85895人评价\",\n" +
            "        \"title\": \"1Q84 BOOK 1\",\n" +
            "        \"translator\": \"施小炜\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"霍达\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1790771.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1082334/\",\n" +
            "        \"date\": \"1988-12-1\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"desc\": \"时代烙印鲜明的民族史诗\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"84978人评价\",\n" +
            "        \"title\": \"穆斯林的葬礼\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 黄仁宇\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1800355.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1041482/\",\n" +
            "        \"date\": \"1997-5\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"见微知著，历史观的颠覆\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"76991人评价\",\n" +
            "        \"title\": \"万历十五年\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"安妮宝贝\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1513548.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1529893/\",\n" +
            "        \"date\": \"2006-3\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"desc\": \"三个生命的交逢，灵魅清冷\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"80622人评价\",\n" +
            "        \"title\": \"莲花\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"南派三叔\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4442295.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1948901/\",\n" +
            "        \"date\": \"2007-1\",\n" +
            "        \"press\": \"中国友谊出版公司\",\n" +
            "        \"desc\": \"想象奇诡的大型RPG游戏\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"76122人评价\",\n" +
            "        \"title\": \"盗墓笔记\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"幾米\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1557610.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1066462/\",\n" +
            "        \"date\": \"2002-8\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"两条平行线相遇的可能\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"76043人评价\",\n" +
            "        \"title\": \"向左走·向右走\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 黑柳彻子 著\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1067911.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1007914/\",\n" +
            "        \"date\": \"2003-1\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"真正懂孩子的教育经\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"71273人评价\",\n" +
            "        \"title\": \"窗边的小豆豆\",\n" +
            "        \"translator\": \"赵玉皎\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] J. K. 罗琳\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1447381.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1432596/\",\n" +
            "        \"date\": \"2005-10\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"感情线纷乱的一部。再见邓布利多\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"69938人评价\",\n" +
            "        \"title\": \"哈利·波特与混血王子\",\n" +
            "        \"translator\": \"马爱农\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王小波\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1076372.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1089243/\",\n" +
            "        \"date\": \"1999-3\",\n" +
            "        \"press\": \"花城出版社\",\n" +
            "        \"desc\": \"能把性爱写得如此坦荡的，大概只有王二了\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"70165人评价\",\n" +
            "        \"title\": \"黄金时代\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（挪威）乔斯坦·贾德\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2153661.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1045818/\",\n" +
            "        \"date\": \"1999-04\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"desc\": \"最平易近人的哲学入门\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"70774人评价\",\n" +
            "        \"title\": \"苏菲的世界\",\n" +
            "        \"translator\": \"萧宝森\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"金庸\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s23632058.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1255625/\",\n" +
            "        \"date\": \"1994-5\",\n" +
            "        \"press\": \"三联书店\",\n" +
            "        \"desc\": \"“有情皆孽，无人不冤”\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"63953人评价\",\n" +
            "        \"title\": \"天龙八部\",\n" +
            "        \"translator\": \"有1996年11月北平第4次印刷本\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[明] 罗贯中\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1076932.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1019568/\",\n" +
            "        \"date\": \"1998-05\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"是非成败转头空\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"63011人评价\",\n" +
            "        \"title\": \"三国演义（全二册）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[巴西]保罗·柯艾略\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s3668327.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3608208/\",\n" +
            "        \"date\": \"2009-3-1\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"你自己就是最大的宝藏\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"68272人评价\",\n" +
            "        \"title\": \"牧羊少年奇幻之旅\",\n" +
            "        \"translator\": \"丁文林\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] J. K. 罗琳\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1822013.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1013129/\",\n" +
            "        \"date\": \"2003-9\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"暴脾气的哈利\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"66364人评价\",\n" +
            "        \"title\": \"哈利·波特与凤凰社\",\n" +
            "        \"translator\": \"马爱农\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"今何在\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s9026255.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1003000/\",\n" +
            "        \"date\": \"2001-4\",\n" +
            "        \"press\": \"光明日报出版社\",\n" +
            "        \"desc\": \"猴子还是那个猴子，世界早已不是原来的世界\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"70060人评价\",\n" +
            "        \"title\": \"悟空传\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"海明威\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1050021.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1064275/\",\n" +
            "        \"date\": \"1999-10\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"正是悲壮赋予生活以意义\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"66989人评价\",\n" +
            "        \"title\": \"老人与海\",\n" +
            "        \"translator\": \"吴劳\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[以色列]尤瓦尔·赫拉利\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s27814883.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/25985021/\",\n" +
            "        \"date\": \"2014-11\",\n" +
            "        \"press\": \"中信出版社\",\n" +
            "        \"desc\": \"跟着人类一同走过十万年\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"60492人评价\",\n" +
            "        \"title\": \"人类简史\",\n" +
            "        \"translator\": \"林俊宏\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 乔治·奥威尔\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4371408.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4820710/\",\n" +
            "        \"date\": \"2010-4-1\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"desc\": \"栗树荫下，我出卖你，你出卖我\",\n" +
            "        \"score\": \"9.3\",\n" +
            "        \"scoreNum\": \"58996人评价\",\n" +
            "        \"title\": \"1984\",\n" +
            "        \"translator\": \"刘绍铭\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"太宰治\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6100756.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4011670/\",\n" +
            "        \"date\": \"2009年9月\",\n" +
            "        \"press\": \"吉林出版集团有限责任公司\",\n" +
            "        \"desc\": \"令人无从怜悯的绝望\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"67323人评价\",\n" +
            "        \"title\": \"人间失格\",\n" +
            "        \"translator\": \"许时嘉\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 村上春树\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1094940.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1059419/\",\n" +
            "        \"date\": \"2003-4\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"背负诅咒的少年，平行世界中的奥德赛\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"67891人评价\",\n" +
            "        \"title\": \"海边的卡夫卡\",\n" +
            "        \"translator\": \"林少华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 卡勒德·胡赛尼\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2651394.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2143732/\",\n" +
            "        \"date\": \"2007-9\",\n" +
            "        \"press\": \"上海人民出版社\",\n" +
            "        \"desc\": \"唯有希望与爱可以驱散阴霾\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"61835人评价\",\n" +
            "        \"title\": \"灿烂千阳\",\n" +
            "        \"translator\": \"李继宏\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（英）勃朗特\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1095383.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1119522/\",\n" +
            "        \"date\": \"1999-01-01\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"近乎暴虐的爱与恨，中文译名后无来者\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"65325人评价\",\n" +
            "        \"title\": \"呼啸山庄\",\n" +
            "        \"translator\": \"张扬\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"龙应台\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s3993878.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3369793/\",\n" +
            "        \"date\": \"2008-12\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"龙应台母子对话，两代人的思想碰撞\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"62780人评价\",\n" +
            "        \"title\": \"亲爱的安德烈\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"余华\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1427312.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1401425/\",\n" +
            "        \"date\": \"2005-8\",\n" +
            "        \"press\": \"上海文艺出版社\",\n" +
            "        \"desc\": \"历史苦难中的个人灾变\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"63740人评价\",\n" +
            "        \"title\": \"兄弟（上）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"大仲马\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3248016.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1085860/\",\n" +
            "        \"date\": \"1991-12-1\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"完美的复仇，金庸用法语写作应该就是这样\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"58727人评价\",\n" +
            "        \"title\": \"基督山伯爵\",\n" +
            "        \"translator\": \"周克希\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] M·斯科特·派克\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2144391.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1775691/\",\n" +
            "        \"date\": \"2007-1\",\n" +
            "        \"press\": \"吉林文史出版社\",\n" +
            "        \"desc\": \"成熟的心智通向更完善的自我\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"62319人评价\",\n" +
            "        \"title\": \"少有人走的路\",\n" +
            "        \"translator\": \"于海生\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 伍绮诗\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s28109182.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/26382433/\",\n" +
            "        \"date\": \"2015-7\",\n" +
            "        \"press\": \"江苏凤凰文艺出版社\",\n" +
            "        \"desc\": \"莉迪亚死了，可他们还不知道\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"63405人评价\",\n" +
            "        \"title\": \"无声告白\",\n" +
            "        \"translator\": \"孙璐\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"金庸\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2157335.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1002299/\",\n" +
            "        \"date\": \"1994-5\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"武侠的壳，政治斗争的核\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"56817人评价\",\n" +
            "        \"title\": \"笑傲江湖（全四册）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 阿·柯南道尔\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1229240.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1040211/\",\n" +
            "        \"date\": \"1981-8\",\n" +
            "        \"press\": \"群众出版社\",\n" +
            "        \"desc\": \"侦探小说鼻祖\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"53577人评价\",\n" +
            "        \"title\": \"福尔摩斯探案全集（上中下）\",\n" +
            "        \"translator\": \"丁钟华 等\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘瑜\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4146437.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3813669/\",\n" +
            "        \"date\": \"2009-6\",\n" +
            "        \"press\": \"上海三联书店\",\n" +
            "        \"desc\": \"公民养成手册\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"58012人评价\",\n" +
            "        \"title\": \"民主的细节\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"小仲马\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1008927.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1013380/\",\n" +
            "        \"date\": \"1997-3\",\n" +
            "        \"press\": \"外国文学出版社\",\n" +
            "        \"desc\": \"妓女应当拥有爱情吗？\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"58808人评价\",\n" +
            "        \"title\": \"茶花女\",\n" +
            "        \"translator\": \"王振孙\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"陈忠实\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s9137567.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1085799/\",\n" +
            "        \"date\": \"1997-12\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"中国乡村史诗\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"54376人评价\",\n" +
            "        \"title\": \"白鹿原\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"张德芬\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3403254.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2340100/\",\n" +
            "        \"date\": \"2008-1\",\n" +
            "        \"press\": \"华夏出版社\",\n" +
            "        \"desc\": \"都市灵修速成\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"58751人评价\",\n" +
            "        \"title\": \"遇见未知的自己\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[奥] 斯台芬·茨威格\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s2611329.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2154960/\",\n" +
            "        \"date\": \"2007-7\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"暗恋的极致\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"54714人评价\",\n" +
            "        \"title\": \"一个陌生女人的来信\",\n" +
            "        \"translator\": \"张玉书\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 岩井俊二\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1127135.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1080370/\",\n" +
            "        \"date\": \"2004-7\",\n" +
            "        \"press\": \"天津人民出版社\",\n" +
            "        \"desc\": \"一场误会中的两段爱情，东方式的含蓄隐忍\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"54327人评价\",\n" +
            "        \"title\": \"情书\",\n" +
            "        \"translator\": \"穆晓芳\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王小波\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1447349.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1054685/\",\n" +
            "        \"date\": \"1997-10\",\n" +
            "        \"press\": \"中国青年出版社\",\n" +
            "        \"desc\": \"沉默是沉默者的通行证\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"51521人评价\",\n" +
            "        \"title\": \"沉默的大多数\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"金庸\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s26018916.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1255624/\",\n" +
            "        \"date\": \"1994-5\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"至情至性，情大于武\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"51224人评价\",\n" +
            "        \"title\": \"神雕侠侣\",\n" +
            "        \"translator\": \"有1996年11月北平第4次印本\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[法] 阿尔贝·加缪\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4468484.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4908885/\",\n" +
            "        \"date\": \"2010-9\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"人生在世，永远也不该演戏作假\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"48685人评价\",\n" +
            "        \"title\": \"局外人\",\n" +
            "        \"translator\": \"柳鸣九\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 笛福\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1242786.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1016003/\",\n" +
            "        \"date\": \"2002-1\",\n" +
            "        \"press\": \"广西民族出版社\",\n" +
            "        \"desc\": \"最早的荒野求生\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"54917人评价\",\n" +
            "        \"title\": \"鲁滨逊漂流记\",\n" +
            "        \"translator\": \"马静\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 阿加莎·克里斯蒂\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1765799.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1827374/\",\n" +
            "        \"date\": \"2006-5\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"谋杀诡计惊人，波洛的抉择耐人寻味\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"47633人评价\",\n" +
            "        \"title\": \"东方快车谋杀案\",\n" +
            "        \"translator\": \"陈尧光\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 村上春树\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3507580.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3369600/\",\n" +
            "        \"date\": \"2009-1\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"村上同志告诉我们，身体是革命的本钱\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"52747人评价\",\n" +
            "        \"title\": \"当我谈跑步时我谈些什么\",\n" +
            "        \"translator\": \"施小炜\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 斯蒂芬·金\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4007145.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1829226/\",\n" +
            "        \"date\": \"2006-7\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"希望让人自由，电影实在太有名\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"45754人评价\",\n" +
            "        \"title\": \"肖申克的救赎\",\n" +
            "        \"translator\": \"施寄青\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"吴念真\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6828981.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/6388661/\",\n" +
            "        \"date\": \"2011-9\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"平淡叙述下的惊心动魄\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"46279人评价\",\n" +
            "        \"title\": \"这些人，那些事\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[法]雨果\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4493741.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1024197/\",\n" +
            "        \"date\": \"1982-6\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"潜藏于残缺下的美与崇高\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"48945人评价\",\n" +
            "        \"title\": \"巴黎圣母院\",\n" +
            "        \"translator\": \"陈敬容\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（法）莫泊桑\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1469280.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1205370/\",\n" +
            "        \"date\": \"2007-6\",\n" +
            "        \"press\": \"北京燕山出版社\",\n" +
            "        \"desc\": \"资产阶级的道貌岸然\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"49945人评价\",\n" +
            "        \"title\": \"羊脂球\",\n" +
            "        \"translator\": \"柳鸣九\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"文：安东尼\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4219471.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4714734/\",\n" +
            "        \"date\": \"2010-3\",\n" +
            "        \"press\": \"长江文艺出版社\",\n" +
            "        \"desc\": \"只言片语的温暖\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"47157人评价\",\n" +
            "        \"title\": \"这些都是你给我的爱\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 阿加莎・克里斯蒂\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2962510.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3006581/\",\n" +
            "        \"date\": \"2008-3\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"童谣杀人案\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"44805人评价\",\n" +
            "        \"title\": \"无人生还\",\n" +
            "        \"translator\": \"祁阿红\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"菲茨杰拉德\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1005875.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1008988/\",\n" +
            "        \"date\": \"2004-06\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"梦，就像黛西家的那一缕绿光\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"47528人评价\",\n" +
            "        \"title\": \"了不起的盖茨比\",\n" +
            "        \"translator\": \"姚乃强\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"鲁迅\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4696893.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1449351/\",\n" +
            "        \"date\": \"1973年3月\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"新文学的第一声呐喊\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"43916人评价\",\n" +
            "        \"title\": \"呐喊\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王小波\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4661043.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3071717/\",\n" +
            "        \"date\": \"2008-5\",\n" +
            "        \"press\": \"上海锦绣文章出版社\",\n" +
            "        \"desc\": \"王小波与李银河的两地书\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"44409人评价\",\n" +
            "        \"title\": \"爱你就像爱生命\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 肯·福莱特\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s28668834.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/26698660/\",\n" +
            "        \"date\": \"2016-5-1\",\n" +
            "        \"press\": \"江苏凤凰文艺出版社\",\n" +
            "        \"desc\": \"五个家族，一场战争\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"43187人评价\",\n" +
            "        \"title\": \"巨人的陨落\",\n" +
            "        \"translator\": \"于大卫\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"亦舒\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s5813979.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2022979/\",\n" +
            "        \"date\": \"2007-2\",\n" +
            "        \"press\": \"新世界出版社\",\n" +
            "        \"desc\": \"爱情才是终极的奢侈品\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"48968人评价\",\n" +
            "        \"title\": \"喜宝\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"张爱玲\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3695882.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1014278/\",\n" +
            "        \"date\": \"1996-06\",\n" +
            "        \"press\": \"花城出版社\",\n" +
            "        \"desc\": \"蚊子血还是饭黏子？\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"46373人评价\",\n" +
            "        \"title\": \"红玫瑰与白玫瑰\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（法）勒庞\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1988393.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1012611/\",\n" +
            "        \"date\": \"2011-5-1\",\n" +
            "        \"press\": \"中央编译出版社\",\n" +
            "        \"desc\": \"群氓心理剖析\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"47165人评价\",\n" +
            "        \"title\": \"乌合之众\",\n" +
            "        \"translator\": \"冯克利\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 乔治·奥威尔\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2347590.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2035179/\",\n" +
            "        \"date\": \"2007-3\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"太阳底下并无新事\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"41425人评价\",\n" +
            "        \"title\": \"动物农场\",\n" +
            "        \"translator\": \"荣如德\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"安东尼\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2998096.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3014576/\",\n" +
            "        \"date\": \"2008-3\",\n" +
            "        \"press\": \"长江文艺出版社\",\n" +
            "        \"desc\": \"真正的片段式写作\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"45729人评价\",\n" +
            "        \"title\": \"陪安东尼度过漫长岁月\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"唐七公子\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4599550.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/5916880/\",\n" +
            "        \"date\": \"2011-1\",\n" +
            "        \"press\": \"现代出版社\",\n" +
            "        \"desc\": \"现实不如梦中的圆满\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"44282人评价\",\n" +
            "        \"title\": \"华胥引（全二册）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"老舍\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1146040.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1043815/\",\n" +
            "        \"date\": \"2000-3-1\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"如骆驼喘息般深刻的绝望\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"45079人评价\",\n" +
            "        \"title\": \"骆驼祥子\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"天下霸唱\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6048082.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1882933/\",\n" +
            "        \"date\": \"2006\",\n" +
            "        \"press\": \"安徽文艺出版社\",\n" +
            "        \"desc\": \"盗墓祖师名不虚传\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"44929人评价\",\n" +
            "        \"title\": \"鬼吹灯之精绝古城\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（丹麦）安徒生\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1034062.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1046209/\",\n" +
            "        \"date\": \"1997-08\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"远不是童话那么简单\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"39922人评价\",\n" +
            "        \"title\": \"安徒生童话故事集\",\n" +
            "        \"translator\": \"叶君健\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"张爱玲\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s2838737.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1963684/\",\n" +
            "        \"date\": \"2006-12\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"desc\": \"世钧，我们回不去了\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"42084人评价\",\n" +
            "        \"title\": \"半生缘\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"幾米\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1672971.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1056733/\",\n" +
            "        \"date\": \"2002-2\",\n" +
            "        \"press\": \"辽宁教育出版社\",\n" +
            "        \"desc\": \"黑暗世界中的点滴亮光\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"41291人评价\",\n" +
            "        \"title\": \"地下铁\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"林奕含\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s29651121.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/27614904/\",\n" +
            "        \"date\": \"2018-1\",\n" +
            "        \"press\": \"北京联合出版公司\",\n" +
            "        \"desc\": \"以血书写的文学\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"37236人评价\",\n" +
            "        \"title\": \"房思琪的初恋乐园\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"金庸\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2157336.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1044547/\",\n" +
            "        \"date\": \"1999-04\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"侠之大者，为国为民\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"37258人评价\",\n" +
            "        \"title\": \"射雕英雄传（全四册）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 莫提默·J. 艾德勒\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1670978.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1013208/\",\n" +
            "        \"date\": \"2004-1\",\n" +
            "        \"press\": \"商务印书馆\",\n" +
            "        \"desc\": \"读书的方法论\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"39080人评价\",\n" +
            "        \"title\": \"如何阅读一本书\",\n" +
            "        \"translator\": \"郝明义\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"幾米\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1385508.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1358873/\",\n" +
            "        \"date\": \"2000-2-1\",\n" +
            "        \"press\": \"格林\",\n" +
            "        \"desc\": \"月明星稀的晚上，看不见的，看见了\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"37307人评价\",\n" +
            "        \"title\": \"月亮忘記了\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"【英】蕾秋·乔伊斯\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s26936721.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/24934182/\",\n" +
            "        \"date\": \"2013-9-1\",\n" +
            "        \"press\": \"北京联合出版公司\",\n" +
            "        \"desc\": \"关于爱和信念的旅行\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"39759人评价\",\n" +
            "        \"title\": \"一个人的朝圣\",\n" +
            "        \"translator\": \"黄妙瑜\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"江南\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1068707.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1020459/\",\n" +
            "        \"date\": \"2004-1\",\n" +
            "        \"press\": \"华文出版社\",\n" +
            "        \"desc\": \"象牙塔里的金庸群侠\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"37910人评价\",\n" +
            "        \"title\": \"此间的少年\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"蒋勋\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4075572.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4124727/\",\n" +
            "        \"date\": \"2009-10-1\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"作为一种美学的孤独\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"39667人评价\",\n" +
            "        \"title\": \"孤独六讲\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"鲁迅\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1074811.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1088065/\",\n" +
            "        \"date\": \"2003-7\",\n" +
            "        \"press\": \"上海书店出版社\",\n" +
            "        \"desc\": \"哀其不幸，怒其不争\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"36268人评价\",\n" +
            "        \"title\": \"阿Q正传\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"桐华\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1681146.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1812439/\",\n" +
            "        \"date\": \"2006-6\",\n" +
            "        \"press\": \"民族出版社\",\n" +
            "        \"desc\": \"现世太苦，不如穿越回去从头来过\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"37853人评价\",\n" +
            "        \"title\": \"步步惊心\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"高木直子\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s7059163.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1346815/\",\n" +
            "        \"date\": \"2004-12-1\",\n" +
            "        \"press\": \"大田\",\n" +
            "        \"desc\": \"独居生活之乐\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"36342人评价\",\n" +
            "        \"title\": \"一個人住第5年\",\n" +
            "        \"translator\": \"洪俞君\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英]毛姆\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2347562.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2035162/\",\n" +
            "        \"date\": \"2007-3\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"一把刀的锋刃不容易越过；因此智者说得救之道是困难的\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"33662人评价\",\n" +
            "        \"title\": \"刀锋\",\n" +
            "        \"translator\": \"周煦良\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王小波\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1670642.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1767945/\",\n" +
            "        \"date\": \"2006-4\",\n" +
            "        \"press\": \"北方文艺出版社\",\n" +
            "        \"desc\": \"生活就是个缓慢受锤的过程，至少还可以特立独行\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"34795人评价\",\n" +
            "        \"title\": \"一只特立独行的猪\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"梁文道\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3588323.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3344676/\",\n" +
            "        \"date\": \"2009-1\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"献给这个常识稀缺的时代\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"37242人评价\",\n" +
            "        \"title\": \"常识\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"龙应台\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4124434.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4207781/\",\n" +
            "        \"date\": \"2009-12-1\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"我们现在怎样做母亲\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"34260人评价\",\n" +
            "        \"title\": \"孩子你慢慢来\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 彼得·海斯勒\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4575849.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/5414391/\",\n" +
            "        \"date\": \"2011-1\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"中国在路上，非虚构写作所能达到的高度\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"33150人评价\",\n" +
            "        \"title\": \"寻路中国\",\n" +
            "        \"translator\": \"李雪顺\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[澳] 考琳·麦卡洛\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2781615.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1086249/\",\n" +
            "        \"date\": \"1998-7\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"澳洲乱世情\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"34325人评价\",\n" +
            "        \"title\": \"荆棘鸟\",\n" +
            "        \"translator\": \"曾胡\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"三毛\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2393243.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2070844/\",\n" +
            "        \"date\": \"2007-6\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"desc\": \"哀而不伤\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"33934人评价\",\n" +
            "        \"title\": \"梦里花落知多少\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 奥德丽·尼芬格\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2375756.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2056749/\",\n" +
            "        \"date\": \"2007-4\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"在时间的缝隙中穿行，然后相遇\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"36628人评价\",\n" +
            "        \"title\": \"时间旅行者的妻子\",\n" +
            "        \"translator\": \"夏金\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"三毛\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1020454.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1029111/\",\n" +
            "        \"date\": \"2003-6\",\n" +
            "        \"press\": \"哈尔滨出版社\",\n" +
            "        \"desc\": \"沙漠中寻常的生与死\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"32520人评价\",\n" +
            "        \"title\": \"哭泣的骆驼\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"林海音 文\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s2654869.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1254588/\",\n" +
            "        \"date\": \"2003-7\",\n" +
            "        \"press\": \"中国青年出版社\",\n" +
            "        \"desc\": \"长亭外，古道边，芳草碧连天\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"32436人评价\",\n" +
            "        \"title\": \"城南旧事\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"格林兄弟\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1134341.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1043008/\",\n" +
            "        \"date\": \"1994-11\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"许多隐晦\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"32281人评价\",\n" +
            "        \"title\": \"格林童话全集\",\n" +
            "        \"translator\": \"魏以新\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"八月长安\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4293097.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4166819/\",\n" +
            "        \"date\": \"2009-12\",\n" +
            "        \"press\": \"新世界出版社\",\n" +
            "        \"desc\": \"原作名切题\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"32346人评价\",\n" +
            "        \"title\": \"你好，旧时光（上 下）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 欧·亨利\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1137441.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1051193/\",\n" +
            "        \"date\": \"2003-7\",\n" +
            "        \"press\": \"上海社会科学院出版社\",\n" +
            "        \"desc\": \"日常的奇迹\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"33325人评价\",\n" +
            "        \"title\": \"麦琪的礼物\",\n" +
            "        \"translator\": \"张经浩\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"阿来\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s9140762.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1080309/\",\n" +
            "        \"date\": \"1998-3-1\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"一个傻子的土司家族传奇\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"33983人评价\",\n" +
            "        \"title\": \"尘埃落定\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"乔一\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s28342099.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/26414020/\",\n" +
            "        \"date\": \"2015-5-1\",\n" +
            "        \"press\": \"湖南少年儿童出版社\",\n" +
            "        \"desc\": \"一想到能和你共度余生，我就对余生充满期待\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"33811人评价\",\n" +
            "        \"title\": \"我不喜欢这世界，我只喜欢你\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"桐华\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4130990.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4231381/\",\n" +
            "        \"date\": \"2010-01\",\n" +
            "        \"press\": \"江苏文艺出版社\",\n" +
            "        \"desc\": \"所有你曾热爱却正在遗忘的人和事\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"32639人评价\",\n" +
            "        \"title\": \"那些回不去的年少时光\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"鲍鲸鲸\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6980516.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4238754/\",\n" +
            "        \"date\": \"2010-1\",\n" +
            "        \"press\": \"中信出版社\",\n" +
            "        \"desc\": \"失恋是一种病，痊愈之后百毒不侵\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"35118人评价\",\n" +
            "        \"title\": \"失恋33天\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"张爱玲\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2976745.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3017857/\",\n" +
            "        \"date\": \"2005-6\",\n" +
            "        \"press\": \"哈尔滨出版社\",\n" +
            "        \"desc\": \"曹七巧就像希克厉，一个扭曲的英雄\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"32969人评价\",\n" +
            "        \"title\": \"金锁记\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"尾田荣一郎\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1492518.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1474773/\",\n" +
            "        \"date\": \"2007-11\",\n" +
            "        \"press\": \"浙江人民美术出版社\",\n" +
            "        \"desc\": \"热血，梦想，希望\",\n" +
            "        \"score\": \"9.5\",\n" +
            "        \"scoreNum\": \"28340人评价\",\n" +
            "        \"title\": \"海贼王\",\n" +
            "        \"translator\": \"董科\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）鲁思・本尼迪克特\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1074166.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1022238/\",\n" +
            "        \"date\": \"1990-6\",\n" +
            "        \"press\": \"商务印书馆\",\n" +
            "        \"desc\": \"复杂矛盾的日本民族\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"33706人评价\",\n" +
            "        \"title\": \"菊与刀\",\n" +
            "        \"translator\": \"吕万和\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"林达\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1768916.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1027191/\",\n" +
            "        \"date\": \"1997-5\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"窥见美国社会的一扇窗\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"29862人评价\",\n" +
            "        \"title\": \"历史深处的忧虑\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[法] 雨果\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1148102.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1205054/\",\n" +
            "        \"date\": \"1992-6\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"现实主义与浪漫主义的至高杰作\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"29928人评价\",\n" +
            "        \"title\": \"悲惨世界（上中下）\",\n" +
            "        \"translator\": \"李丹\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘慈欣\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s26040205.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1192090/\",\n" +
            "        \"date\": \"2005-6\",\n" +
            "        \"press\": \"四川科学技术出版社\",\n" +
            "        \"desc\": \"量子之外，没有真相\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"30911人评价\",\n" +
            "        \"title\": \"球状闪电\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"金庸\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3134040.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1212893/\",\n" +
            "        \"date\": \"2008-3\",\n" +
            "        \"press\": \"广州出版社 花城出版社\",\n" +
            "        \"desc\": \"武侠的解构，流氓的狂欢\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"30326人评价\",\n" +
            "        \"title\": \"鹿鼎记（全五册）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 沃尔特·艾萨克森\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6974202.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/6798611/\",\n" +
            "        \"date\": \"2011-10-24\",\n" +
            "        \"press\": \"中信出版社\",\n" +
            "        \"desc\": \"完美主义者的最高形态\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"30631人评价\",\n" +
            "        \"title\": \"史蒂夫·乔布斯传\",\n" +
            "        \"translator\": \"管延圻\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王安忆\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3018752.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1082349/\",\n" +
            "        \"date\": \"2003-8\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"现代上海史诗\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"32430人评价\",\n" +
            "        \"title\": \"长恨歌\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"笛安\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4397380.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4874131/\",\n" +
            "        \"date\": \"2010-7-1\",\n" +
            "        \"press\": \"长江文艺出版社\",\n" +
            "        \"desc\": \"自毁而偏执的东霓\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"32536人评价\",\n" +
            "        \"title\": \"东霓\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"七堇年\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1994710.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1963310/\",\n" +
            "        \"date\": \"2007-1\",\n" +
            "        \"press\": \"长江文艺出版社\",\n" +
            "        \"desc\": \"两代人的成长与救赎\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"32058人评价\",\n" +
            "        \"title\": \"大地之灯\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"约翰·赫斯特（John Hirst）\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4542951.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/5366248/\",\n" +
            "        \"date\": \"2011-11-25\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"欧洲，为什么老是抢第一？\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"31792人评价\",\n" +
            "        \"title\": \"你一定爱读的极简欧洲史\",\n" +
            "        \"translator\": \"席玉苹\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 海莲·汉芙\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1326174.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1316648/\",\n" +
            "        \"date\": \"2005-05-01\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"文艺青年的爱情地标\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"31397人评价\",\n" +
            "        \"title\": \"查令十字街84号\",\n" +
            "        \"translator\": \"陈建铭\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[印] 罗宾德拉纳德·泰戈尔\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1044902.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1058661/\",\n" +
            "        \"date\": \"2004-6\",\n" +
            "        \"press\": \"哈尔滨出版社\",\n" +
            "        \"desc\": \"淡泊，超脱\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"28667人评价\",\n" +
            "        \"title\": \"飞鸟集\",\n" +
            "        \"translator\": \"徐翰林\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[德] 帕·聚斯金德\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1556748.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1292416/\",\n" +
            "        \"date\": \"2005-5\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"恋味癖谋杀案\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"29314人评价\",\n" +
            "        \"title\": \"香水\",\n" +
            "        \"translator\": \"李清华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[意大利]伊塔洛·卡尔维诺\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1804710.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1863930/\",\n" +
            "        \"date\": \"2006-8\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"每一座城市都只在想象中耸立，又在描述中坍圮\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"28333人评价\",\n" +
            "        \"title\": \"看不见的城市\",\n" +
            "        \"translator\": \"张宓\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（美）罗伯特・T・清崎\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1429010.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1033778/\",\n" +
            "        \"date\": \"2000-09\",\n" +
            "        \"press\": \"世界图书出版公司\",\n" +
            "        \"desc\": \"人穷穷观念，人富钱生钱\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"29967人评价\",\n" +
            "        \"title\": \"富爸爸，穷爸爸\",\n" +
            "        \"translator\": \"杨君，杨明\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 哈珀·李\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s23128183.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/6781808/\",\n" +
            "        \"date\": \"2012-9\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"有一种东西不能遵循从众原则，那就是——人的良心\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"26834人评价\",\n" +
            "        \"title\": \"杀死一只知更鸟\",\n" +
            "        \"translator\": \"高红梅\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 乔治·奥威尔\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1089916.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1082387/\",\n" +
            "        \"date\": \"2003-4\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"一个预言和一个寓言，令人窒息的政治恐怖\",\n" +
            "        \"score\": \"9.3\",\n" +
            "        \"scoreNum\": \"26540人评价\",\n" +
            "        \"title\": \"一九八四·动物农场\",\n" +
            "        \"translator\": \"董乐山\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"安东尼\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4512594.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/5327697/\",\n" +
            "        \"date\": \"2010-10\",\n" +
            "        \"press\": \"长江文艺出版社\",\n" +
            "        \"desc\": \"定做一个刻着“不过如此”的章，盖在封面上\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"29824人评价\",\n" +
            "        \"title\": \"橙\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"鲁迅\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2875823.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1449352/\",\n" +
            "        \"date\": \"1972年4月\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"鲁迅的旧事重提\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"28438人评价\",\n" +
            "        \"title\": \"朝花夕拾\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 川端康成\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1056010.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1005521/\",\n" +
            "        \"date\": \"2002-2\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"静美又残酷，无限柔软的川端\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"30311人评价\",\n" +
            "        \"title\": \"伊豆的舞女\",\n" +
            "        \"translator\": \"叶渭渠\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"金庸\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1829709.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1070851/\",\n" +
            "        \"date\": \"1999-04\",\n" +
            "        \"press\": \"三联书店\",\n" +
            "        \"desc\": \"不识张郎是张郎\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"28532人评价\",\n" +
            "        \"title\": \"倚天屠龙记(共四册)\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"钱穆\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1319205.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1003479/\",\n" +
            "        \"date\": \"2001\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"一部简明的“中国政治制度史”\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"26229人评价\",\n" +
            "        \"title\": \"中国历代政治得失\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 罗伯特·西奥迪尼\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1657785.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1786387/\",\n" +
            "        \"date\": \"2006-5\",\n" +
            "        \"press\": \"中国人民大学出版社\",\n" +
            "        \"desc\": \"营销防骗指南\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"27949人评价\",\n" +
            "        \"title\": \"影响力\",\n" +
            "        \"translator\": \"陈叙\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"九夜茴\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2892553.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2567919/\",\n" +
            "        \"date\": \"2008-1\",\n" +
            "        \"press\": \"东方出版社\",\n" +
            "        \"desc\": \"不悔梦归处 只恨太匆匆\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"29274人评价\",\n" +
            "        \"title\": \"匆匆那年（上下）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 彼得·海斯勒\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s7019913.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/7060185/\",\n" +
            "        \"date\": \"2012-1\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"外国人的寻路中国\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"26618人评价\",\n" +
            "        \"title\": \"江城\",\n" +
            "        \"translator\": \"李雪顺\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 村上春树\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1801057.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1291809/\",\n" +
            "        \"date\": \"2002-12\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"交叉平行蒙太奇\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"28229人评价\",\n" +
            "        \"title\": \"世界尽头与冷酷仙境\",\n" +
            "        \"translator\": \"林少华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"李笑来\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3778613.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3609132/\",\n" +
            "        \"date\": \"2009-6\",\n" +
            "        \"press\": \"电子工业出版社\",\n" +
            "        \"desc\": \"反成功学的成功学\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"28347人评价\",\n" +
            "        \"title\": \"把时间当作朋友\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"章诒和\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1108667.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1059336/\",\n" +
            "        \"date\": \"2004-1\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"知识分子的命运浮沉\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"27583人评价\",\n" +
            "        \"title\": \"往事并不如烟\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 乔治·R. R. 马丁\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1358984.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1336330/\",\n" +
            "        \"date\": \"2005-5\",\n" +
            "        \"press\": \"重庆出版社\",\n" +
            "        \"desc\": \"凛冬将至。无比宏大的世界观\",\n" +
            "        \"score\": \"9.3\",\n" +
            "        \"scoreNum\": \"25135人评价\",\n" +
            "        \"title\": \"冰与火之歌（卷一）\",\n" +
            "        \"translator\": \"谭光磊\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"斯丹达尔\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1988674.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1007433/\",\n" +
            "        \"date\": \"1993-7-1\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"阴谋与爱情\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"29016人评价\",\n" +
            "        \"title\": \"红与黑\",\n" +
            "        \"translator\": \"张冠尧\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 史蒂芬·霍金\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1914861.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1034282/\",\n" +
            "        \"date\": \"2010-4\",\n" +
            "        \"press\": \"湖南科学技术出版社\",\n" +
            "        \"desc\": \"霍金与上帝的战争\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"26449人评价\",\n" +
            "        \"title\": \"时间简史\",\n" +
            "        \"translator\": \"许明贤\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"沧月\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s3007857.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1919201/\",\n" +
            "        \"date\": \"2006-10\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"desc\": \"抵不过时间\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"27127人评价\",\n" +
            "        \"title\": \"七夜雪\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"九把刀\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1982025.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1958227/\",\n" +
            "        \"date\": \"2007-1\",\n" +
            "        \"press\": \"花山文艺出版社\",\n" +
            "        \"desc\": \"那些年错过的大雨\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"28231人评价\",\n" +
            "        \"title\": \"那些年，我们一起追的女孩\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[明] 施耐庵\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1147854.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1008357/\",\n" +
            "        \"date\": \"1997-1\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"风风火火闯九州\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"26864人评价\",\n" +
            "        \"title\": \"水浒传（全二册）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 乙一\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s2756239.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2297697/\",\n" +
            "        \"date\": \"2007-10\",\n" +
            "        \"press\": \"当代世界出版社\",\n" +
            "        \"desc\": \"噩梦中的一丝温度\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"26600人评价\",\n" +
            "        \"title\": \"ZOO\",\n" +
            "        \"translator\": \"李颖秋\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"hans\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3721175.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3554154/\",\n" +
            "        \"date\": \"2009-1\",\n" +
            "        \"press\": \"上海锦绣文章出版社\",\n" +
            "        \"desc\": \"治愈\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"25097人评价\",\n" +
            "        \"title\": \"阿狸·梦之城堡\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"安妮宝贝\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3237601.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1063190/\",\n" +
            "        \"date\": \"2002-8\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"desc\": \"你们不会彼此遗忘。只会彼此消失\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"28504人评价\",\n" +
            "        \"title\": \"蔷薇岛屿\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"严歌苓\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6987353.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/6880158/\",\n" +
            "        \"date\": \"2011-10\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"desc\": \"翻手为苍凉，覆手为繁华\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"25496人评价\",\n" +
            "        \"title\": \"陆犯焉识\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 丹.布朗\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1914485.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1228110/\",\n" +
            "        \"date\": \"2005-2\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"科学与宗教的大乱斗\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"27630人评价\",\n" +
            "        \"title\": \"天使与魔鬼\",\n" +
            "        \"translator\": \"朱振武\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"八月长安\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s26720726.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/24754316/\",\n" +
            "        \"date\": \"2013-8-5\",\n" +
            "        \"press\": \"湖南文艺出版社\",\n" +
            "        \"desc\": \"耿耿余淮\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"24906人评价\",\n" +
            "        \"title\": \"最好的我们\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"曹禺\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s23579217.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1013416/\",\n" +
            "        \"date\": \"1999-05\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"人的心都靠不住，我并不是说人坏，我就是恨人性太弱，太容易变了\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"26493人评价\",\n" +
            "        \"title\": \"雷雨\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 梭罗\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1999119.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1865089/\",\n" +
            "        \"date\": \"2006-8\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"另一种生活\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"26708人评价\",\n" +
            "        \"title\": \"瓦尔登湖\",\n" +
            "        \"translator\": \"徐迟\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"吴承恩\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1627374.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1029553/\",\n" +
            "        \"date\": \"2004-8\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"取经之路就在脚下\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"25257人评价\",\n" +
            "        \"title\": \"西游记（全二册）\",\n" +
            "        \"translator\": \"黄肃秋 注释\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 伊恩·麦克尤恩\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3979661.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4011440/\",\n" +
            "        \"date\": \"2010-2\",\n" +
            "        \"press\": \"南京大学出版社\",\n" +
            "        \"desc\": \"别被封面骗了\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"27723人评价\",\n" +
            "        \"title\": \"最初的爱情 最后的仪式\",\n" +
            "        \"translator\": \"潘帕\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[法国] 儒尔·凡尔纳\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1817666.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1085470/\",\n" +
            "        \"date\": \"2002-9\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"你听说过鹦鹉螺号吗？\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"26130人评价\",\n" +
            "        \"title\": \"海底两万里\",\n" +
            "        \"translator\": \"沈国华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 村上春树\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2333463.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1015452/\",\n" +
            "        \"date\": \"2001-8\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"灾星下出生的恋人们\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"26532人评价\",\n" +
            "        \"title\": \"国境以南 太阳以西\",\n" +
            "        \"translator\": \"林少华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美]  凯利·麦格尼格尔\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s10685385.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/10786473/\",\n" +
            "        \"date\": \"2012-8\",\n" +
            "        \"press\": \"文化发展出版社(原印刷工业出版社)\",\n" +
            "        \"desc\": \"要么瘦，要么死\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"26398人评价\",\n" +
            "        \"title\": \"自控力\",\n" +
            "        \"translator\": \"王岑卉\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美]莉兹•克里莫\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s28369176.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/26602392/\",\n" +
            "        \"date\": \"天津人民出版社\",\n" +
            "        \"press\": \"雅众文化\",\n" +
            "        \"desc\": \"呆萌可爱的动物段子手\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"24849人评价\",\n" +
            "        \"title\": \"你今天真好看\",\n" +
            "        \"translator\": \"周高逸\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"鲁迅\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1426308.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1398395/\",\n" +
            "        \"date\": \"2006-3\",\n" +
            "        \"press\": \"京华出版社\",\n" +
            "        \"desc\": \"中国现代文学史上第一篇真正的现代白话小说\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"24676人评价\",\n" +
            "        \"title\": \"狂人日记\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] E.B.怀特\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1120437.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1036274/\",\n" +
            "        \"date\": \"2004-5\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"猪与蜘蛛\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"24903人评价\",\n" +
            "        \"title\": \"夏洛的网\",\n" +
            "        \"translator\": \"任溶溶\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"李海鹏\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4397779.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4872671/\",\n" +
            "        \"date\": \"2010-6\",\n" +
            "        \"press\": \"文化艺术出版社\",\n" +
            "        \"desc\": \"嬉笑怒骂的常识分子\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"25924人评价\",\n" +
            "        \"title\": \"佛祖在一号线\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[捷克] 米兰·昆德拉\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1069535.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1013225/\",\n" +
            "        \"date\": \"2004-5\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"此处的生活唯有残酷\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"25490人评价\",\n" +
            "        \"title\": \"生活在别处\",\n" +
            "        \"translator\": \"袁筱一\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[奥] 卡夫卡\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s26042134.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1213546/\",\n" +
            "        \"date\": \"2003-4\",\n" +
            "        \"press\": \"浙江文艺出版社\",\n" +
            "        \"desc\": \"格里高里清早醒来发现自己变成了甲虫\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"25113人评价\",\n" +
            "        \"title\": \"变形记\",\n" +
            "        \"translator\": \"叶廷芳\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"林语堂\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1395779.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1391191/\",\n" +
            "        \"date\": \"2005-7\",\n" +
            "        \"press\": \"陕西师范大学出版社\",\n" +
            "        \"desc\": \"林语堂的《红楼梦》\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"24649人评价\",\n" +
            "        \"title\": \"京华烟云\",\n" +
            "        \"translator\": \"张振玉\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 卡森·麦卡勒斯\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1436379.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1424741/\",\n" +
            "        \"date\": \"2005-8\",\n" +
            "        \"press\": \"上海三联书店\",\n" +
            "        \"desc\": \"镇上有两个哑巴，他们总是在一起。\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"24454人评价\",\n" +
            "        \"title\": \"心是孤独的猎手\",\n" +
            "        \"translator\": \"陈笑黎\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 村上春树\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s27094300.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/25733470/\",\n" +
            "        \"date\": \"2013-10-1\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"并不是一切都消失在了时间的长河里\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"24937人评价\",\n" +
            "        \"title\": \"没有色彩的多崎作和他的巡礼之年\",\n" +
            "        \"translator\": \"施小炜\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 原研哉\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2165932.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1941558/\",\n" +
            "        \"date\": \"2006-11\",\n" +
            "        \"press\": \"山东人民出版社\",\n" +
            "        \"desc\": \"日常生活的无限可能性\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"23896人评价\",\n" +
            "        \"title\": \"设计中的设计\",\n" +
            "        \"translator\": \"朱锷\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"萧红\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1167060.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1060852/\",\n" +
            "        \"date\": \"2005-01\",\n" +
            "        \"press\": \"百花文艺出版社\",\n" +
            "        \"desc\": \"萧红的童年往事\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"23207人评价\",\n" +
            "        \"title\": \"呼兰河传\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"梁文道\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s3705488.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3642673/\",\n" +
            "        \"date\": \"2010-10\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"梁文道的私密日记\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"25634人评价\",\n" +
            "        \"title\": \"我执\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[澳] 马克斯·苏萨克\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2686452.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2180619/\",\n" +
            "        \"date\": \"2007-8\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"不能说偷，是窃，窃你懂吗\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"25085人评价\",\n" +
            "        \"title\": \"偷书贼\",\n" +
            "        \"translator\": \"孙张静\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 戴尔·卡耐基\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s27266511.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1056295/\",\n" +
            "        \"date\": \"2008-1\",\n" +
            "        \"press\": \"中国发展出版社\",\n" +
            "        \"desc\": \"西方世界最持久的人文畅销书\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"24088人评价\",\n" +
            "        \"title\": \"人性的弱点全集\",\n" +
            "        \"translator\": \"袁玲\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"木心 讲述\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s24611679.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/20440644/\",\n" +
            "        \"date\": \"2013-1-10\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"木心留给世界的礼物\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"21739人评价\",\n" +
            "        \"title\": \"文学回忆录（全2册）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"史铁生\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1151479.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1209899/\",\n" +
            "        \"date\": \"2002-5\",\n" +
            "        \"press\": \"春风文艺出版社\",\n" +
            "        \"desc\": \"这是你的罪孽与福祉\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"22119人评价\",\n" +
            "        \"title\": \"我与地坛\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"吴晓波\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s10431840.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1970428/\",\n" +
            "        \"date\": \"2007-1\",\n" +
            "        \"press\": \"中信出版社 浙江人民出版社\",\n" +
            "        \"desc\": \"这是一个最好的时代，也是一个最坏的时代\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"22587人评价\",\n" +
            "        \"title\": \"激荡三十年（上）\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘震云\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s6916838.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3633461/\",\n" +
            "        \"date\": \"2009-3\",\n" +
            "        \"press\": \"长江文艺出版社\",\n" +
            "        \"desc\": \"一句胜过千年\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"22793人评价\",\n" +
            "        \"title\": \"一句顶一万句\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"路遥\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3847911.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3803820/\",\n" +
            "        \"date\": \"2009-5\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"desc\": \"如果你是高加林，你要如何选择？\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"23366人评价\",\n" +
            "        \"title\": \"人生\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"（清）沈复\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2280094.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1088581/\",\n" +
            "        \"date\": \"1\",\n" +
            "        \"press\": \"1999\",\n" +
            "        \"desc\": \"布衣菜饭可乐终身\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"22495人评价\",\n" +
            "        \"title\": \"浮生六记\",\n" +
            "        \"translator\": \"人民文学出版社\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 阿加莎·克里斯蒂\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1683067.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1818347/\",\n" +
            "        \"date\": \"2006-5\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"阿婆代表作之一\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"22343人评价\",\n" +
            "        \"title\": \"尼罗河上的惨案\",\n" +
            "        \"translator\": \"宫英海\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"江南\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1520169.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1321017/\",\n" +
            "        \"date\": \"2005-6\",\n" +
            "        \"press\": \"新世界出版社\",\n" +
            "        \"desc\": \"乱世的英雄史诗\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"21379人评价\",\n" +
            "        \"title\": \"九州·缥缈录\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王小波\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1016763.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1014578/\",\n" +
            "        \"date\": \"1997\",\n" +
            "        \"press\": \"文化艺术出版社\",\n" +
            "        \"desc\": \"活过，爱过，写过\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"20422人评价\",\n" +
            "        \"title\": \"我的精神家园\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 岛田庄司\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s3801839.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3187737/\",\n" +
            "        \"date\": \"2008-9\",\n" +
            "        \"press\": \"新星出版社\",\n" +
            "        \"desc\": \"一桩占星术连续杀人案件\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"21913人评价\",\n" +
            "        \"title\": \"占星术杀人魔法\",\n" +
            "        \"translator\": \"王鹏帆\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"苏童\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6478105.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1025753/\",\n" +
            "        \"date\": \"2004-8\",\n" +
            "        \"press\": \"上海文艺出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"22499人评价\",\n" +
            "        \"title\": \"妻妾成群\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"吴军\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6807265.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/6709783/\",\n" +
            "        \"date\": \"2011-8\",\n" +
            "        \"press\": \"电子工业出版社\",\n" +
            "        \"desc\": \"了解IT领域的入门读物\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"19929人评价\",\n" +
            "        \"title\": \"浪潮之巅\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"龙应台\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1469589.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1426971/\",\n" +
            "        \"date\": \"2005-8\",\n" +
            "        \"press\": \"文汇出版社\",\n" +
            "        \"desc\": \"中国人你为什么不生气？\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"20703人评价\",\n" +
            "        \"title\": \"野火集\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 村上春树\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1231290.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1020670/\",\n" +
            "        \"date\": \"2002-6\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"深入村上春树的心灵腹地\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"21886人评价\",\n" +
            "        \"title\": \"舞！舞！舞！\",\n" +
            "        \"translator\": \"林少华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[法] 莫泊桑\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1240228.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1258498/\",\n" +
            "        \"date\": \"2005-2\",\n" +
            "        \"press\": \"河北教育出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"21421人评价\",\n" +
            "        \"title\": \"项链\",\n" +
            "        \"translator\": \"顾加琛 等\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[以色列] 尤瓦尔·赫拉利\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s29287103.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/26943161/\",\n" +
            "        \"date\": \"2017-1\",\n" +
            "        \"press\": \"中信出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"20876人评价\",\n" +
            "        \"title\": \"未来简史\",\n" +
            "        \"translator\": \"林俊宏\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 史蒂芬·柯维\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1067863.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1048007/\",\n" +
            "        \"date\": \"2011-6\",\n" +
            "        \"press\": \"中国青年出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"scoreNum\": \"21263人评价\",\n" +
            "        \"title\": \"高效能人士的七个习惯（精华版）\",\n" +
            "        \"translator\": \"高新勇\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"海子\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1067491.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1011754/\",\n" +
            "        \"date\": \"1999-04\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"19559人评价\",\n" +
            "        \"title\": \"海子的诗\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美]马里奥·普佐\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s2832939.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1092335/\",\n" +
            "        \"date\": \"1997-8\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"19145人评价\",\n" +
            "        \"title\": \"教父\",\n" +
            "        \"translator\": \"周汉林\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 尼尔·波兹曼\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6776106.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1062193/\",\n" +
            "        \"date\": \"2011-6\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"20335人评价\",\n" +
            "        \"title\": \"娱乐至死\",\n" +
            "        \"translator\": \"章艳\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[德] 埃·奥·卜劳恩 绘\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1094608.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1002898/\",\n" +
            "        \"date\": \"2003-4\",\n" +
            "        \"press\": \"中国工人出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"18694人评价\",\n" +
            "        \"title\": \"父与子全集\",\n" +
            "        \"translator\": \"杨莹\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 威廉·萨默塞特·毛姆\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s29634528.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/26954760/\",\n" +
            "        \"date\": \"2017-1-1\",\n" +
            "        \"press\": \"浙江文艺出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"20505人评价\",\n" +
            "        \"title\": \"月亮与六便士\",\n" +
            "        \"translator\": \"徐淳刚\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 约翰·威廉斯\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s28332051.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/26425831/\",\n" +
            "        \"date\": \"上海人民出版社\",\n" +
            "        \"press\": \"世纪文景\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"19193人评价\",\n" +
            "        \"title\": \"斯通纳\",\n" +
            "        \"translator\": \"杨向荣\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"严歌苓\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s29418322.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/27010212/\",\n" +
            "        \"date\": \"2017-4\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"20902人评价\",\n" +
            "        \"title\": \"芳华\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王朔\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s9853099.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1143694/\",\n" +
            "        \"date\": \"2004-2\",\n" +
            "        \"press\": \"中国电影出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"20577人评价\",\n" +
            "        \"title\": \"动物凶猛\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"刘瑜\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s26846213.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/20463108/\",\n" +
            "        \"date\": \"2013-1\",\n" +
            "        \"press\": \"浙江大学出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"20304人评价\",\n" +
            "        \"title\": \"观念的水位\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 阿加莎·克里斯蒂\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1772249.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1807516/\",\n" +
            "        \"date\": \"2006-5\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"18644人评价\",\n" +
            "        \"title\": \"罗杰疑案\",\n" +
            "        \"translator\": \"张江云\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王国维\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s9130587.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1203426/\",\n" +
            "        \"date\": \"1998-12-01\",\n" +
            "        \"press\": \"上海古籍出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"18574人评价\",\n" +
            "        \"title\": \"人间词话\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"夏达\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4158947.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4188697/\",\n" +
            "        \"date\": \"2009-12\",\n" +
            "        \"press\": \"新世纪出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"18232人评价\",\n" +
            "        \"title\": \"子不语1\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"齐邦媛\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4494379.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/4842446/\",\n" +
            "        \"date\": \"2010-10\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"19132人评价\",\n" +
            "        \"title\": \"巨流河\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"张爱玲\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1077099.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1082162/\",\n" +
            "        \"date\": \"1997-3\",\n" +
            "        \"press\": \"花城出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"19990人评价\",\n" +
            "        \"title\": \"第一炉香\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"严歌苓\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4045138.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3012517/\",\n" +
            "        \"date\": \"2008-4\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"19453人评价\",\n" +
            "        \"title\": \"小姨多鹤\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"黄仁宇\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2523433.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1015699/\",\n" +
            "        \"date\": \"2007-2\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"20216人评价\",\n" +
            "        \"title\": \"中国大历史\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 村上春树\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1029647.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1031740/\",\n" +
            "        \"date\": \"2001-8\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"20391人评价\",\n" +
            "        \"title\": \"寻羊冒险记\",\n" +
            "        \"translator\": \"林少华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"杨显惠\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3455551.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3239549/\",\n" +
            "        \"date\": \"2008-09\",\n" +
            "        \"press\": \"花城出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"scoreNum\": \"17641人评价\",\n" +
            "        \"title\": \"夹边沟记事\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 艾·弗洛姆\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2990934.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3026879/\",\n" +
            "        \"date\": \"2008-4\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"18580人评价\",\n" +
            "        \"title\": \"爱的艺术\",\n" +
            "        \"translator\": \"李健鸣\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"林达\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3186863.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1001885/\",\n" +
            "        \"date\": \"2002-5\",\n" +
            "        \"press\": \"生活·读书·新知三联书店\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"19202人评价\",\n" +
            "        \"title\": \"带一本书去巴黎\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日]芥川龙之介\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s3435158.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3136271/\",\n" +
            "        \"date\": \"2008-7\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"19077人评价\",\n" +
            "        \"title\": \"罗生门\",\n" +
            "        \"translator\": \"林少华\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] W.萨默塞特·毛姆\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s9038826.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/10560798/\",\n" +
            "        \"date\": \"2012-5\",\n" +
            "        \"press\": \"重庆出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"18744人评价\",\n" +
            "        \"title\": \"面纱\",\n" +
            "        \"translator\": \"阮景林\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"纳训\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s1070937.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1035848/\",\n" +
            "        \"date\": \"2003-01\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"18843人评价\",\n" +
            "        \"title\": \"一千零一夜\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"白先勇\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4526465.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/5337248/\",\n" +
            "        \"date\": \"2010-10\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"scoreNum\": \"17793人评价\",\n" +
            "        \"title\": \"台北人\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"陈丹青\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1311084.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1003284/\",\n" +
            "        \"date\": \"2005-1\",\n" +
            "        \"press\": \"广西师范大学出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"19690人评价\",\n" +
            "        \"title\": \"退步集\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"三毛\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s2563279.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2136140/\",\n" +
            "        \"date\": \"2007-7\",\n" +
            "        \"press\": \"北京十月文艺出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"scoreNum\": \"18316人评价\",\n" +
            "        \"title\": \"雨季不再来\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"桐华\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s2742719.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2283084/\",\n" +
            "        \"date\": \"2007-9\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"19547人评价\",\n" +
            "        \"title\": \"云中歌1\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"三毛\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1099483.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1036490/\",\n" +
            "        \"date\": \"2003-08\",\n" +
            "        \"press\": \"哈尔滨出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"17865人评价\",\n" +
            "        \"title\": \"万水千山走遍\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"匪我思存\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s4596329.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1886385/\",\n" +
            "        \"date\": \"2006-9\",\n" +
            "        \"press\": \"新世界出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"19380人评价\",\n" +
            "        \"title\": \"来不及说我爱你\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王小波\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1072540.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1082150/\",\n" +
            "        \"date\": \"1997-5\",\n" +
            "        \"press\": \"花城出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"18792人评价\",\n" +
            "        \"title\": \"白银时代\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 米奇·阿尔博姆\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s29237651.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2194123/\",\n" +
            "        \"date\": \"2007-7\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"18539人评价\",\n" +
            "        \"title\": \"相约星期二\",\n" +
            "        \"translator\": \"吴洪\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英] 莎士比亚\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/subject/m/public/s27009357.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1006197/\",\n" +
            "        \"date\": \"2001-1\",\n" +
            "        \"press\": \"人民文学出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"18470人评价\",\n" +
            "        \"title\": \"哈姆莱特\",\n" +
            "        \"translator\": \"朱生豪\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"湊佳苗\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3931802.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3920130/\",\n" +
            "        \"date\": \"2009年8月31日\",\n" +
            "        \"press\": \"時報文化\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"17828人评价\",\n" +
            "        \"title\": \"告白\",\n" +
            "        \"translator\": \"丁世佳\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"韩寒\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3947864.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3860856/\",\n" +
            "        \"date\": \"2009-08-01\",\n" +
            "        \"press\": \"万卷出版公司\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"19196人评价\",\n" +
            "        \"title\": \"可爱的洪水猛兽\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"海宴\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s8994402.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2326571/\",\n" +
            "        \"date\": \"2007-12\",\n" +
            "        \"press\": \"朝华出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"scoreNum\": \"17482人评价\",\n" +
            "        \"title\": \"琅琊榜\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[美] 贾雷德·戴蒙德\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1738643.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1813841/\",\n" +
            "        \"date\": \"2006-4-1\",\n" +
            "        \"press\": \"上海世纪出版集团\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"17402人评价\",\n" +
            "        \"title\": \"枪炮、病菌与钢铁\",\n" +
            "        \"translator\": \"谢延光\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[英]狄更斯\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s1300531.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1203251/\",\n" +
            "        \"date\": \"1991-7\",\n" +
            "        \"press\": \"上海译文出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"18960人评价\",\n" +
            "        \"title\": \"雾都孤儿\",\n" +
            "        \"translator\": \"荣如德\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"王小波\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s26384792.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/1418686/\",\n" +
            "        \"date\": \"2005-1\",\n" +
            "        \"press\": \"江苏文艺出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"scoreNum\": \"17472人评价\",\n" +
            "        \"title\": \"红拂夜奔\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"流潋紫\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s2894734.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/2004407/\",\n" +
            "        \"date\": \"2007-2\",\n" +
            "        \"press\": \"花山文艺出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"18663人评价\",\n" +
            "        \"title\": \"后宫·甄嬛传Ⅰ\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[德] 本哈德·施林克\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s3628415.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3537590/\",\n" +
            "        \"date\": \"2009-2\",\n" +
            "        \"press\": \"译林出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"scoreNum\": \"17946人评价\",\n" +
            "        \"title\": \"朗读者\",\n" +
            "        \"translator\": \"钱定平\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 东野圭吾\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s6942170.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/6746289/\",\n" +
            "        \"date\": \"2011-9\",\n" +
            "        \"press\": \"南海出版公司\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"scoreNum\": \"17991人评价\",\n" +
            "        \"title\": \"新参者\",\n" +
            "        \"translator\": \"岳远坤\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"幾米\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s4150073.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/3665874/\",\n" +
            "        \"date\": \"2009-5-1\",\n" +
            "        \"press\": \"大塊文化\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"scoreNum\": \"16369人评价\",\n" +
            "        \"title\": \"星空\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"鲜橙\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s29490160.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/27084173/\",\n" +
            "        \"date\": \"2017-8-1\",\n" +
            "        \"press\": \"作家出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"scoreNum\": \"15177人评价\",\n" +
            "        \"title\": \"阿麦从军：全新修订版\",\n" +
            "        \"translator\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"author\": \"[日] 安倍夜郎\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/subject/m/public/s24569060.jpg\",\n" +
            "        \"url\": \"https://book.douban.com/subject/20470917/\",\n" +
            "        \"date\": \"2013-1\",\n" +
            "        \"press\": \"湖南文艺出版社\",\n" +
            "        \"desc\": \"\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"scoreNum\": \"15804人评价\",\n" +
            "        \"title\": \"深夜食堂 01\",\n" +
            "        \"translator\": \"陈颖\"\n" +
            "    }\n" +
            "]");
    public static List<JSONObject> bookTop250Data = null;
    static {
        bookTop250Data = JSON.parseObject(bookTop250DataStr.toString(),List.class);
    }
}
