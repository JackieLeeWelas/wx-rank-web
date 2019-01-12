package cn.jackielee.biz.ranklist.movie.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by lxb on 2019/1/8.
 */
public class ChinaTicketTopMovieData {
    public static final String chinaTicketTopMovieDataStr = "[\n" +
            "    {\n" +
            "        \"MovieID\": \"641515\",\n" +
            "        \"title\": \"战狼2\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"567926\",\n" +
            "        \"ShowCount\": \"4158816\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"15943\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2017-07-27\",\n" +
            "        \"AvgPeople\": \"38\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/229733.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"655823\",\n" +
            "        \"title\": \"红海行动\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"365078\",\n" +
            "        \"ShowCount\": \"2815494\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"9291\",\n" +
            "        \"price\": \"39\",\n" +
            "        \"date\": \"2018-02-16\",\n" +
            "        \"AvgPeople\": \"33\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/240425.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"663419\",\n" +
            "        \"title\": \"唐人街探案2\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"339769\",\n" +
            "        \"ShowCount\": \"2275136\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"8766\",\n" +
            "        \"price\": \"39\",\n" +
            "        \"date\": \"2018-02-16\",\n" +
            "        \"AvgPeople\": \"39\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/234873.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"626153\",\n" +
            "        \"title\": \"美人鱼\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"339211\",\n" +
            "        \"ShowCount\": \"2120077\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"9243\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2016-02-08\",\n" +
            "        \"AvgPeople\": \"44\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/209007.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"676313\",\n" +
            "        \"title\": \"我不是药神\",\n" +
            "        \"type\": \"剧情\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"309713\",\n" +
            "        \"ShowCount\": \"3354213\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"8895\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2018-07-05\",\n" +
            "        \"AvgPeople\": \"27\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/242167.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"659757\",\n" +
            "        \"title\": \"速度与激情8\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"267096\",\n" +
            "        \"ShowCount\": \"2424825\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"7287\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2017-04-14\",\n" +
            "        \"AvgPeople\": \"30\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/224149.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"671983\",\n" +
            "        \"title\": \"西虹市首富\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"254719\",\n" +
            "        \"ShowCount\": \"2590731\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"7264\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2018-07-27\",\n" +
            "        \"AvgPeople\": \"28\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/253688.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"627896\",\n" +
            "        \"title\": \"捉妖记\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"中国香港/中国\",\n" +
            "        \"ticket\": \"244002\",\n" +
            "        \"ShowCount\": \"1576146\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"6563\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2015-07-16\",\n" +
            "        \"AvgPeople\": \"42\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/211794.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"629625\",\n" +
            "        \"title\": \"速度与激情7\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国/日本\",\n" +
            "        \"ticket\": \"242659\",\n" +
            "        \"ShowCount\": \"1479697\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"6244\",\n" +
            "        \"price\": \"39\",\n" +
            "        \"date\": \"2015-04-12\",\n" +
            "        \"AvgPeople\": \"42\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/196613.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"675789\",\n" +
            "        \"title\": \"复仇者联盟3：无限战争\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"239053\",\n" +
            "        \"ShowCount\": \"3232877\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"6250\",\n" +
            "        \"price\": \"38\",\n" +
            "        \"date\": \"2018-05-11\",\n" +
            "        \"AvgPeople\": \"19\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/217497.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"656875\",\n" +
            "        \"title\": \"捉妖记2\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国香港/中国\",\n" +
            "        \"ticket\": \"223707\",\n" +
            "        \"ShowCount\": \"1321688\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"5838\",\n" +
            "        \"price\": \"38\",\n" +
            "        \"date\": \"2018-02-16\",\n" +
            "        \"AvgPeople\": \"44\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/237182.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"661004\",\n" +
            "        \"title\": \"羞羞的铁拳\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"220175\",\n" +
            "        \"ShowCount\": \"2605624\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"6587\",\n" +
            "        \"price\": \"33\",\n" +
            "        \"date\": \"2017-09-30\",\n" +
            "        \"AvgPeople\": \"25\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/246526.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"612232\",\n" +
            "        \"title\": \"变形金刚4：绝迹重生\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国/中国\",\n" +
            "        \"ticket\": \"197752\",\n" +
            "        \"ShowCount\": \"957225\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"4741\",\n" +
            "        \"price\": \"42\",\n" +
            "        \"date\": \"2014-06-27\",\n" +
            "        \"AvgPeople\": \"50\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/157905.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"663359\",\n" +
            "        \"title\": \"前任3：再见前任\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"194027\",\n" +
            "        \"ShowCount\": \"1932972\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"5534\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2017-12-29\",\n" +
            "        \"AvgPeople\": \"29\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/230788.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"662209\",\n" +
            "        \"title\": \"毒液：致命守护者\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"186307\",\n" +
            "        \"ShowCount\": \"3071891\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"5244\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2018-11-09\",\n" +
            "        \"AvgPeople\": \"17\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/103937.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"629898\",\n" +
            "        \"title\": \"功夫瑜伽\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"印度/中国\",\n" +
            "        \"ticket\": \"175260\",\n" +
            "        \"ShowCount\": \"1377275\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"4590\",\n" +
            "        \"price\": \"38\",\n" +
            "        \"date\": \"2017-01-28\",\n" +
            "        \"AvgPeople\": \"33\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/217896.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"667168\",\n" +
            "        \"title\": \"侏罗纪世界2\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"169551\",\n" +
            "        \"ShowCount\": \"2484474\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"4749\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2018-06-15\",\n" +
            "        \"AvgPeople\": \"19\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/225759.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"614981\",\n" +
            "        \"title\": \"寻龙诀\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国香港/中国\",\n" +
            "        \"ticket\": \"168274\",\n" +
            "        \"ShowCount\": \"1155955\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"4647\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2015-12-18\",\n" +
            "        \"AvgPeople\": \"40\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/196282.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"619719\",\n" +
            "        \"title\": \"西游伏妖篇\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"中国香港/中国\",\n" +
            "        \"ticket\": \"165593\",\n" +
            "        \"ShowCount\": \"1172884\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"4229\",\n" +
            "        \"price\": \"39\",\n" +
            "        \"date\": \"2017-01-28\",\n" +
            "        \"AvgPeople\": \"36\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/208325.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"618038\",\n" +
            "        \"title\": \"港囧\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"161410\",\n" +
            "        \"ShowCount\": \"1223836\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"4912\",\n" +
            "        \"price\": \"33\",\n" +
            "        \"date\": \"2015-09-25\",\n" +
            "        \"AvgPeople\": \"40\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/208076.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"656946\",\n" +
            "        \"title\": \"变形金刚5：最后的骑士\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"155124\",\n" +
            "        \"ShowCount\": \"1842492\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"4199\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2017-06-23\",\n" +
            "        \"AvgPeople\": \"23\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/211901.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"643235\",\n" +
            "        \"title\": \"疯狂动物城\",\n" +
            "        \"type\": \"动画\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"153035\",\n" +
            "        \"ShowCount\": \"1580870\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"4548\",\n" +
            "        \"price\": \"34\",\n" +
            "        \"date\": \"2016-03-04\",\n" +
            "        \"AvgPeople\": \"29\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/205222.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"402117\",\n" +
            "        \"title\": \"魔兽\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"147230\",\n" +
            "        \"ShowCount\": \"1590152\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3971\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2016-06-08\",\n" +
            "        \"AvgPeople\": \"25\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/89952.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"631792\",\n" +
            "        \"title\": \"复仇者联盟2：奥创纪元\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"146439\",\n" +
            "        \"ShowCount\": \"1283082\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3659\",\n" +
            "        \"price\": \"40\",\n" +
            "        \"date\": \"2015-05-12\",\n" +
            "        \"AvgPeople\": \"29\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/173060.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"628183\",\n" +
            "        \"title\": \"夏洛特烦恼\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"144161\",\n" +
            "        \"ShowCount\": \"1325223\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"4476\",\n" +
            "        \"price\": \"32\",\n" +
            "        \"date\": \"2015-09-30\",\n" +
            "        \"AvgPeople\": \"34\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/218763.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"659453\",\n" +
            "        \"title\": \"芳华\",\n" +
            "        \"type\": \"战争\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"142194\",\n" +
            "        \"ShowCount\": \"1689768\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"4153\",\n" +
            "        \"price\": \"34\",\n" +
            "        \"date\": \"2017-12-15\",\n" +
            "        \"AvgPeople\": \"25\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/236404.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"348959\",\n" +
            "        \"title\": \"侏罗纪世界\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"142073\",\n" +
            "        \"ShowCount\": \"1133913\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3710\",\n" +
            "        \"price\": \"38\",\n" +
            "        \"date\": \"2015-06-10\",\n" +
            "        \"AvgPeople\": \"33\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/191813.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"657862\",\n" +
            "        \"title\": \"头号玩家\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"139666\",\n" +
            "        \"ShowCount\": \"2188490\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3836\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2018-03-30\",\n" +
            "        \"AvgPeople\": \"18\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/219107.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"663327\",\n" +
            "        \"title\": \"后来的我们\",\n" +
            "        \"type\": \"爱情\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"136152\",\n" +
            "        \"ShowCount\": \"1928383\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"4015\",\n" +
            "        \"price\": \"34\",\n" +
            "        \"date\": \"2018-04-28\",\n" +
            "        \"AvgPeople\": \"21\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/253823.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"677028\",\n" +
            "        \"title\": \"一出好戏\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"135132\",\n" +
            "        \"ShowCount\": \"1522327\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"3892\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2018-08-10\",\n" +
            "        \"AvgPeople\": \"26\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/241018.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"303851\",\n" +
            "        \"title\": \"阿凡达\",\n" +
            "        \"type\": \"科幻/动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"133986\",\n" +
            "        \"ShowCount\": \"374343\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2692\",\n" +
            "        \"price\": \"50\",\n" +
            "        \"date\": \"2010-01-04\",\n" +
            "        \"AvgPeople\": \"72\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/45997.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"659327\",\n" +
            "        \"title\": \"摔跤吧！爸爸\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"印度\",\n" +
            "        \"ticket\": \"129918\",\n" +
            "        \"ShowCount\": \"1947269\",\n" +
            "        \"typeid\": \"6\",\n" +
            "        \"AudienceCount\": \"4319\",\n" +
            "        \"price\": \"30\",\n" +
            "        \"date\": \"2017-05-05\",\n" +
            "        \"AvgPeople\": \"22\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/232932.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"678141\",\n" +
            "        \"title\": \"无双\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"127348\",\n" +
            "        \"ShowCount\": \"2452896\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"3580\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2018-09-30\",\n" +
            "        \"AvgPeople\": \"15\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/225752.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"610009\",\n" +
            "        \"title\": \"人再囧途之泰囧\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"127193\",\n" +
            "        \"ShowCount\": \"869426\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"3927\",\n" +
            "        \"price\": \"32\",\n" +
            "        \"date\": \"2012-12-12\",\n" +
            "        \"AvgPeople\": \"45\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/164046.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"589797\",\n" +
            "        \"title\": \"西游降魔篇\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"124699\",\n" +
            "        \"ShowCount\": \"764900\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"3105\",\n" +
            "        \"price\": \"40\",\n" +
            "        \"date\": \"2013-02-10\",\n" +
            "        \"AvgPeople\": \"41\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/138762.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"643612\",\n" +
            "        \"title\": \"美国队长3：英雄内战\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"124635\",\n" +
            "        \"ShowCount\": \"1420592\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3562\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2016-05-06\",\n" +
            "        \"AvgPeople\": \"25\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/209122.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"657756\",\n" +
            "        \"title\": \"碟中谍6：全面瓦解\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"124203\",\n" +
            "        \"ShowCount\": \"2273346\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3372\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2018-08-31\",\n" +
            "        \"AvgPeople\": \"15\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/226992.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"670102\",\n" +
            "        \"title\": \"寻梦环游记\",\n" +
            "        \"type\": \"动画\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"121186\",\n" +
            "        \"ShowCount\": \"2009973\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3590\",\n" +
            "        \"price\": \"34\",\n" +
            "        \"date\": \"2017-11-24\",\n" +
            "        \"AvgPeople\": \"18\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/227434.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"626346\",\n" +
            "        \"title\": \"西游记之孙悟空三打白骨精\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"120101\",\n" +
            "        \"ShowCount\": \"918633\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"3275\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2016-02-08\",\n" +
            "        \"AvgPeople\": \"36\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/209180.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"639445\",\n" +
            "        \"title\": \"湄公河行动\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国香港/中国\",\n" +
            "        \"ticket\": \"118613\",\n" +
            "        \"ShowCount\": \"1590177\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"3897\",\n" +
            "        \"price\": \"30\",\n" +
            "        \"date\": \"2016-09-30\",\n" +
            "        \"AvgPeople\": \"25\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/228345.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"659751\",\n" +
            "        \"title\": \"加勒比海盗5：死无对证\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"117991\",\n" +
            "        \"ShowCount\": \"1502700\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3294\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2017-05-26\",\n" +
            "        \"AvgPeople\": \"22\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/151657.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"595849\",\n" +
            "        \"title\": \"长城\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"美国/中国\",\n" +
            "        \"ticket\": \"117457\",\n" +
            "        \"ShowCount\": \"1567733\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"3341\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2016-12-16\",\n" +
            "        \"AvgPeople\": \"21\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/153307.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"618111\",\n" +
            "        \"title\": \"心花路放\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"116934\",\n" +
            "        \"ShowCount\": \"953002\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"3398\",\n" +
            "        \"price\": \"34\",\n" +
            "        \"date\": \"2014-09-30\",\n" +
            "        \"AvgPeople\": \"36\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/206162.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"629410\",\n" +
            "        \"title\": \"煎饼侠\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"116276\",\n" +
            "        \"ShowCount\": \"907826\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"3558\",\n" +
            "        \"price\": \"33\",\n" +
            "        \"date\": \"2015-07-17\",\n" +
            "        \"AvgPeople\": \"39\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/218762.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"657877\",\n" +
            "        \"title\": \"金刚：骷髅岛\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"116050\",\n" +
            "        \"ShowCount\": \"1613110\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3301\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2017-03-24\",\n" +
            "        \"AvgPeople\": \"20\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/226894.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"573814\",\n" +
            "        \"title\": \"极限特工：终极回归\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"112741\",\n" +
            "        \"ShowCount\": \"1374210\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3113\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2017-02-10\",\n" +
            "        \"AvgPeople\": \"23\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/125805.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"637759\",\n" +
            "        \"title\": \"澳门风云3\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"111818\",\n" +
            "        \"ShowCount\": \"873433\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"3137\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2016-02-08\",\n" +
            "        \"AvgPeople\": \"36\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/222326.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"623100\",\n" +
            "        \"title\": \"生化危机：终章\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国/德国\",\n" +
            "        \"ticket\": \"111182\",\n" +
            "        \"ShowCount\": \"1565225\",\n" +
            "        \"typeid\": \"6\",\n" +
            "        \"AudienceCount\": \"3205\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2017-02-24\",\n" +
            "        \"AvgPeople\": \"20\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/194595.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"589793\",\n" +
            "        \"title\": \"变形金刚3\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"107157\",\n" +
            "        \"ShowCount\": \"476536\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2564\",\n" +
            "        \"price\": \"42\",\n" +
            "        \"date\": \"2011-07-21\",\n" +
            "        \"AvgPeople\": \"54\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/105799.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"644333\",\n" +
            "        \"title\": \"巨齿鲨\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"104891\",\n" +
            "        \"ShowCount\": \"1238225\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"2737\",\n" +
            "        \"price\": \"38\",\n" +
            "        \"date\": \"2018-08-10\",\n" +
            "        \"AvgPeople\": \"22\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/225827.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"655798\",\n" +
            "        \"title\": \"乘风破浪\",\n" +
            "        \"type\": \"剧情\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"104853\",\n" +
            "        \"ShowCount\": \"1060817\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2887\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2017-01-28\",\n" +
            "        \"AvgPeople\": \"27\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/237054.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"589349\",\n" +
            "        \"title\": \"西游记之大闹天宫\",\n" +
            "        \"type\": \"魔幻\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"104550\",\n" +
            "        \"ShowCount\": \"629788\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"2494\",\n" +
            "        \"price\": \"42\",\n" +
            "        \"date\": \"2014-01-31\",\n" +
            "        \"AvgPeople\": \"40\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/126817.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"644666\",\n" +
            "        \"title\": \"神偷奶爸3\",\n" +
            "        \"type\": \"动画\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"103780\",\n" +
            "        \"ShowCount\": \"1498274\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"3047\",\n" +
            "        \"price\": \"34\",\n" +
            "        \"date\": \"2017-07-07\",\n" +
            "        \"AvgPeople\": \"20\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/208828.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"665526\",\n" +
            "        \"title\": \"海王\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"101085\",\n" +
            "        \"ShowCount\": \"1260760\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2765\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"AvgPeople\": \"22\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/132277.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"611818\",\n" +
            "        \"title\": \"盗墓笔记\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"100453\",\n" +
            "        \"ShowCount\": \"1039630\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2851\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2016-08-05\",\n" +
            "        \"AvgPeople\": \"27\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/203656.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"676242\",\n" +
            "        \"title\": \"狂暴巨兽\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"100395\",\n" +
            "        \"ShowCount\": \"2140895\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2883\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2018-04-13\",\n" +
            "        \"AvgPeople\": \"13\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/225925.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"639351\",\n" +
            "        \"title\": \"功夫熊猫3\",\n" +
            "        \"type\": \"动画\",\n" +
            "        \"country\": \"中国/美国\",\n" +
            "        \"ticket\": \"100200\",\n" +
            "        \"ShowCount\": \"1135099\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"2814\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2016-01-29\",\n" +
            "        \"AvgPeople\": \"25\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/177861.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"625797\",\n" +
            "        \"title\": \"奇幻森林\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"97939\",\n" +
            "        \"ShowCount\": \"1211390\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2920\",\n" +
            "        \"price\": \"34\",\n" +
            "        \"date\": \"2016-04-15\",\n" +
            "        \"AvgPeople\": \"24\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/207872.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"627594\",\n" +
            "        \"title\": \"澳门风云2\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国香港/中国\",\n" +
            "        \"ticket\": \"97486\",\n" +
            "        \"ShowCount\": \"681311\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"2485\",\n" +
            "        \"price\": \"39\",\n" +
            "        \"date\": \"2015-02-19\",\n" +
            "        \"AvgPeople\": \"36\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/212471.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"630887\",\n" +
            "        \"title\": \"西游记之大圣归来\",\n" +
            "        \"type\": \"动画\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"95652\",\n" +
            "        \"ShowCount\": \"802959\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2759\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2015-07-10\",\n" +
            "        \"AvgPeople\": \"34\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/209164.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"596420\",\n" +
            "        \"title\": \"泰坦尼克号3D\",\n" +
            "        \"type\": \"爱情\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"94621\",\n" +
            "        \"ShowCount\": \"391739\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2125\",\n" +
            "        \"price\": \"45\",\n" +
            "        \"date\": \"2012-04-10\",\n" +
            "        \"AvgPeople\": \"54\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/11925.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"617155\",\n" +
            "        \"title\": \"老炮儿\",\n" +
            "        \"type\": \"剧情\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"90280\",\n" +
            "        \"ShowCount\": \"759529\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2869\",\n" +
            "        \"price\": \"31\",\n" +
            "        \"date\": \"2015-12-24\",\n" +
            "        \"AvgPeople\": \"38\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/217699.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"676391\",\n" +
            "        \"title\": \"超时空同居\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"89988\",\n" +
            "        \"ShowCount\": \"2231244\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2721\",\n" +
            "        \"price\": \"33\",\n" +
            "        \"date\": \"2018-05-18\",\n" +
            "        \"AvgPeople\": \"12\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/250729.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"621641\",\n" +
            "        \"title\": \"绝地逃亡\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国/中国香港/中国\",\n" +
            "        \"ticket\": \"88950\",\n" +
            "        \"ShowCount\": \"1028333\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"2561\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2016-07-21\",\n" +
            "        \"AvgPeople\": \"25\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/199602.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"613812\",\n" +
            "        \"title\": \"智取威虎山\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"88351\",\n" +
            "        \"ShowCount\": \"771721\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"2153\",\n" +
            "        \"price\": \"41\",\n" +
            "        \"date\": \"2014-12-23\",\n" +
            "        \"AvgPeople\": \"28\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/152510.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"573367\",\n" +
            "        \"title\": \"十二生肖\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"88118\",\n" +
            "        \"ShowCount\": \"587304\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"2193\",\n" +
            "        \"price\": \"40\",\n" +
            "        \"date\": \"2012-12-20\",\n" +
            "        \"AvgPeople\": \"37\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/105646.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"636000\",\n" +
            "        \"title\": \"碟中谍5：神秘国度\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国/中国\",\n" +
            "        \"ticket\": \"86977\",\n" +
            "        \"ShowCount\": \"1016513\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2652\",\n" +
            "        \"price\": \"33\",\n" +
            "        \"date\": \"2015-09-08\",\n" +
            "        \"AvgPeople\": \"26\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/165359.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"676247\",\n" +
            "        \"title\": \"蚁人2：黄蜂女现身\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国/英国\",\n" +
            "        \"ticket\": \"82927\",\n" +
            "        \"ShowCount\": \"1512266\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2299\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2018-08-24\",\n" +
            "        \"AvgPeople\": \"15\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/228903.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"631832\",\n" +
            "        \"title\": \"星球大战：原力觉醒\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"82558\",\n" +
            "        \"ShowCount\": \"928527\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2217\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2016-01-09\",\n" +
            "        \"AvgPeople\": \"24\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/192895.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"638436\",\n" +
            "        \"title\": \"唐人街探案\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"82442\",\n" +
            "        \"ShowCount\": \"777695\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2597\",\n" +
            "        \"price\": \"32\",\n" +
            "        \"date\": \"2015-12-31\",\n" +
            "        \"AvgPeople\": \"33\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/220627.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"626806\",\n" +
            "        \"title\": \"从你的全世界路过\",\n" +
            "        \"type\": \"爱情\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"81423\",\n" +
            "        \"ShowCount\": \"1178702\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2608\",\n" +
            "        \"price\": \"31\",\n" +
            "        \"date\": \"2016-09-29\",\n" +
            "        \"AvgPeople\": \"22\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/219178.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"642020\",\n" +
            "        \"title\": \"X战警：天启\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"80292\",\n" +
            "        \"ShowCount\": \"1000376\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2330\",\n" +
            "        \"price\": \"34\",\n" +
            "        \"date\": \"2016-06-03\",\n" +
            "        \"AvgPeople\": \"23\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/208116.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"639261\",\n" +
            "        \"title\": \"北京遇上西雅图之不二情书\",\n" +
            "        \"type\": \"爱情\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"78680\",\n" +
            "        \"ShowCount\": \"965394\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"2347\",\n" +
            "        \"price\": \"34\",\n" +
            "        \"date\": \"2016-04-29\",\n" +
            "        \"AvgPeople\": \"24\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/2169322.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"657831\",\n" +
            "        \"title\": \"蜘蛛侠：英雄归来\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"77414\",\n" +
            "        \"ShowCount\": \"1413463\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2201\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2017-09-08\",\n" +
            "        \"AvgPeople\": \"16\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/208175.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"678587\",\n" +
            "        \"title\": \"无名之辈\",\n" +
            "        \"type\": \"剧情\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"77246\",\n" +
            "        \"ShowCount\": \"1832335\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2226\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2018-11-16\",\n" +
            "        \"AvgPeople\": \"12\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/250056.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"610219\",\n" +
            "        \"title\": \"叶问3\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"77031\",\n" +
            "        \"ShowCount\": \"863336\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"1983\",\n" +
            "        \"price\": \"39\",\n" +
            "        \"date\": \"2016-03-04\",\n" +
            "        \"AvgPeople\": \"23\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/164011.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"625819\",\n" +
            "        \"title\": \"霍比特人3：五军之战\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"美国/新西兰\",\n" +
            "        \"ticket\": \"76650\",\n" +
            "        \"ShowCount\": \"644277\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"1918\",\n" +
            "        \"price\": \"40\",\n" +
            "        \"date\": \"2015-01-23\",\n" +
            "        \"AvgPeople\": \"30\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/178510.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"637920\",\n" +
            "        \"title\": \"大闹天竺\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"75793\",\n" +
            "        \"ShowCount\": \"679475\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2130\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2017-01-28\",\n" +
            "        \"AvgPeople\": \"31\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/225095.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"346481\",\n" +
            "        \"title\": \"星际穿越\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国/英国\",\n" +
            "        \"ticket\": \"75533\",\n" +
            "        \"ShowCount\": \"612815\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2089\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2014-11-12\",\n" +
            "        \"AvgPeople\": \"34\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/51119.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"346818\",\n" +
            "        \"title\": \"钢铁侠3\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国/中国\",\n" +
            "        \"ticket\": \"75487\",\n" +
            "        \"ShowCount\": \"539168\",\n" +
            "        \"typeid\": \"6\",\n" +
            "        \"AudienceCount\": \"1800\",\n" +
            "        \"price\": \"42\",\n" +
            "        \"date\": \"2013-05-01\",\n" +
            "        \"AvgPeople\": \"33\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/91881.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"589946\",\n" +
            "        \"title\": \"无问西东\",\n" +
            "        \"type\": \"剧情\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"75430\",\n" +
            "        \"ShowCount\": \"1317649\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2399\",\n" +
            "        \"price\": \"31\",\n" +
            "        \"date\": \"2018-01-12\",\n" +
            "        \"AvgPeople\": \"18\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/154373.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"325408\",\n" +
            "        \"title\": \"奇异博士\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"75170\",\n" +
            "        \"ShowCount\": \"1194367\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2154\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2016-11-04\",\n" +
            "        \"AvgPeople\": \"18\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/108737.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"670328\",\n" +
            "        \"title\": \"神秘巨星\",\n" +
            "        \"type\": \"剧情\",\n" +
            "        \"country\": \"印度\",\n" +
            "        \"ticket\": \"74707\",\n" +
            "        \"ShowCount\": \"1439608\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2488\",\n" +
            "        \"price\": \"30\",\n" +
            "        \"date\": \"2018-01-19\",\n" +
            "        \"AvgPeople\": \"17\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/249736.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"626314\",\n" +
            "        \"title\": \"天将雄师\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"74418\",\n" +
            "        \"ShowCount\": \"482517\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"1830\",\n" +
            "        \"price\": \"41\",\n" +
            "        \"date\": \"2015-02-19\",\n" +
            "        \"AvgPeople\": \"38\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/210728.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"644134\",\n" +
            "        \"title\": \"雷神3：诸神黄昏\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"74303\",\n" +
            "        \"ShowCount\": \"1393471\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2094\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2017-11-03\",\n" +
            "        \"AvgPeople\": \"15\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/209123.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"659452\",\n" +
            "        \"title\": \"猩球崛起3：终极之战\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"73978\",\n" +
            "        \"ShowCount\": \"1332963\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2115\",\n" +
            "        \"price\": \"35\",\n" +
            "        \"date\": \"2017-09-15\",\n" +
            "        \"AvgPeople\": \"16\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/218546.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"656944\",\n" +
            "        \"title\": \"金刚狼3：殊死一战\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"73163\",\n" +
            "        \"ShowCount\": \"1424133\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"2259\",\n" +
            "        \"price\": \"32\",\n" +
            "        \"date\": \"2017-03-03\",\n" +
            "        \"AvgPeople\": \"16\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/209688.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"644530\",\n" +
            "        \"title\": \"西游记女儿国\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"72738\",\n" +
            "        \"ShowCount\": \"553709\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"1830\",\n" +
            "        \"price\": \"40\",\n" +
            "        \"date\": \"2018-02-16\",\n" +
            "        \"AvgPeople\": \"33\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/209205.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"631839\",\n" +
            "        \"title\": \"终结者：创世纪\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"72536\",\n" +
            "        \"ShowCount\": \"824365\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"1972\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2015-08-23\",\n" +
            "        \"AvgPeople\": \"24\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/106560.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"620389\",\n" +
            "        \"title\": \"X战警：逆转未来\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"72297\",\n" +
            "        \"ShowCount\": \"660559\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"1932\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2014-05-23\",\n" +
            "        \"AvgPeople\": \"29\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/154557.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"596973\",\n" +
            "        \"title\": \"致我们终将逝去的青春\",\n" +
            "        \"type\": \"爱情\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"71918\",\n" +
            "        \"ShowCount\": \"621073\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2247\",\n" +
            "        \"price\": \"32\",\n" +
            "        \"date\": \"2013-04-26\",\n" +
            "        \"AvgPeople\": \"36\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/157125.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"622647\",\n" +
            "        \"title\": \"美国队长2：冬日战士\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"71853\",\n" +
            "        \"ShowCount\": \"631971\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"1831\",\n" +
            "        \"price\": \"39\",\n" +
            "        \"date\": \"2014-04-04\",\n" +
            "        \"AvgPeople\": \"29\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/151951.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"610928\",\n" +
            "        \"title\": \"私人订制\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"71380\",\n" +
            "        \"ShowCount\": \"666556\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"2006\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2013-12-19\",\n" +
            "        \"AvgPeople\": \"30\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/164689.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"624046\",\n" +
            "        \"title\": \"猩球崛起2：黎明之战\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"70923\",\n" +
            "        \"ShowCount\": \"682539\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"1927\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2014-08-29\",\n" +
            "        \"AvgPeople\": \"28\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/169864.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"612432\",\n" +
            "        \"title\": \"狼图腾\",\n" +
            "        \"type\": \"剧情\",\n" +
            "        \"country\": \"中国/法国\",\n" +
            "        \"ticket\": \"70425\",\n" +
            "        \"ShowCount\": \"521788\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"1794\",\n" +
            "        \"price\": \"39\",\n" +
            "        \"date\": \"2015-02-19\",\n" +
            "        \"AvgPeople\": \"34\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/112443.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"589501\",\n" +
            "        \"title\": \"画皮2\",\n" +
            "        \"type\": \"爱情\",\n" +
            "        \"country\": \"中国/中国香港\",\n" +
            "        \"ticket\": \"70211\",\n" +
            "        \"ShowCount\": \"466402\",\n" +
            "        \"typeid\": \"2\",\n" +
            "        \"AudienceCount\": \"1711\",\n" +
            "        \"price\": \"41\",\n" +
            "        \"date\": \"2012-06-28\",\n" +
            "        \"AvgPeople\": \"37\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/133147.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"637972\",\n" +
            "        \"title\": \"铁道飞虎\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"69985\",\n" +
            "        \"ShowCount\": \"1042463\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"1907\",\n" +
            "        \"price\": \"37\",\n" +
            "        \"date\": \"2016-12-23\",\n" +
            "        \"AvgPeople\": \"18\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/225093.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"619293\",\n" +
            "        \"title\": \"爸爸去哪儿\",\n" +
            "        \"type\": \"剧情\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"69673\",\n" +
            "        \"ShowCount\": \"542739\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"2189\",\n" +
            "        \"price\": \"32\",\n" +
            "        \"date\": \"2014-01-31\",\n" +
            "        \"AvgPeople\": \"40\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/208207.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"629524\",\n" +
            "        \"title\": \"悟空传\",\n" +
            "        \"type\": \"奇幻\",\n" +
            "        \"country\": \"中国\",\n" +
            "        \"ticket\": \"69654\",\n" +
            "        \"ShowCount\": \"1122738\",\n" +
            "        \"typeid\": \"1\",\n" +
            "        \"AudienceCount\": \"1939\",\n" +
            "        \"price\": \"36\",\n" +
            "        \"date\": \"2017-07-13\",\n" +
            "        \"AvgPeople\": \"17\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/226435.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"MovieID\": \"616436\",\n" +
            "        \"title\": \"环太平洋\",\n" +
            "        \"type\": \"科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"ticket\": \"69475\",\n" +
            "        \"ShowCount\": \"451641\",\n" +
            "        \"typeid\": \"5\",\n" +
            "        \"AudienceCount\": \"1721\",\n" +
            "        \"price\": \"40\",\n" +
            "        \"date\": \"2013-07-31\",\n" +
            "        \"AvgPeople\": \"38\",\n" +
            "        \"pic\": \"http://www.cbooo.cn/moviepic/146649.jpg\"\n" +
            "    }\n" +
            "]";
    public static List<JSONObject> chinaTicketTopMovieData = null;
    static {
        chinaTicketTopMovieData = JSON.parseObject(chinaTicketTopMovieDataStr,List.class);
    }
}
