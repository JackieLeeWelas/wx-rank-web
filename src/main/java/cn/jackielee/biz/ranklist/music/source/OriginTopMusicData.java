package cn.jackielee.biz.ranklist.music.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by lxb on 2019/1/12.
 */
public class OriginTopMusicData {
    public static final String originTopMusicDataStr = "[\n" +
            "    {\n" +
            "        \"title\": \"嘿\",\n" +
            "        \"author\": \"张楚\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:22\",\n" +
            "        \"albumName\": \"嘿\",\n" +
            "        \"pic\": \"http://p1.music.126.net/q4TAOAxICgknspYHELJd5w==/109951163696898337.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"告白\",\n" +
            "        \"author\": \"王欣宇\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:09\",\n" +
            "        \"albumName\": \"告白\",\n" +
            "        \"pic\": \"http://p1.music.126.net/LJFLNLNzFjj9X_rfnsYZbg==/109951163689815304.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"得了吧张小姐\",\n" +
            "        \"author\": \"李想Evelyn\",\n" +
            "        \"date\": \"2018-11-30\",\n" +
            "        \"period\": \"03:17\",\n" +
            "        \"albumName\": \"得了吧张小姐\",\n" +
            "        \"pic\": \"http://p1.music.126.net/YKCD6-_p9Eg2GVTxfCallw==/109951163696215133.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"独特的人\",\n" +
            "        \"author\": \"徐海俏\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"05:09\",\n" +
            "        \"albumName\": \"独特的人\",\n" +
            "        \"pic\": \"http://p1.music.126.net/8wQUhG_u5KpKnZ9D4nmxRQ==/109951163693519774.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"没有人的沙漠\",\n" +
            "        \"author\": \"卫彬月\",\n" +
            "        \"date\": \"2018-11-29\",\n" +
            "        \"period\": \"04:04\",\n" +
            "        \"albumName\": \"没有人的沙漠\",\n" +
            "        \"pic\": \"http://p1.music.126.net/RaumFv9pqu-wKBagSsn1Qw==/109951163695755545.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"喜新恋旧\",\n" +
            "        \"author\": \"Jony J\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:22\",\n" +
            "        \"albumName\": \"喜新恋旧\",\n" +
            "        \"pic\": \"http://p2.music.126.net/78Nt_AEGTm7-Nk7EXTOiVg==/109951163678373297.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"放大\",\n" +
            "        \"author\": \"刘莱斯\",\n" +
            "        \"date\": \"2018-12-03\",\n" +
            "        \"period\": \"04:38\",\n" +
            "        \"albumName\": \"放大\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5zpTzKyxHNe1gIfAGxNJtA==/109951163703697363.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"迷失于你\",\n" +
            "        \"author\": \"Quinn葵因\",\n" +
            "        \"date\": \"2018-11-26\",\n" +
            "        \"period\": \"02:50\",\n" +
            "        \"albumName\": \"迷失于你\",\n" +
            "        \"pic\": \"http://p1.music.126.net/3TomWLxIHImZKM6kvgqKDA==/109951163689845030.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"正如遗忘\",\n" +
            "        \"author\": \"黄锶骐\",\n" +
            "        \"date\": \"2018-11-26\",\n" +
            "        \"period\": \"03:44\",\n" +
            "        \"albumName\": \"正如遗忘\",\n" +
            "        \"pic\": \"http://p1.music.126.net/1rF1Ob7nazR4N6yCsuBHZQ==/109951163689813693.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"江南废气\",\n" +
            "        \"author\": \"夏小虎,一三\",\n" +
            "        \"date\": \"2018-12-04\",\n" +
            "        \"period\": \"06:02\",\n" +
            "        \"albumName\": \"江南废气\",\n" +
            "        \"pic\": \"http://p1.music.126.net/s7HcurA70SBuz38l_AoABw==/109951163705846600.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"隐身药水\",\n" +
            "        \"author\": \"马雨阳,陈鸿宇\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:23\",\n" +
            "        \"albumName\": \"众乐纪肆·光怪陆离\",\n" +
            "        \"pic\": \"http://p1.music.126.net/qFyueAV216Ht0Pnbv_vLnQ==/109951163704973577.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"艺术家\",\n" +
            "        \"author\": \"徐秉龙\",\n" +
            "        \"date\": \"2018-11-16\",\n" +
            "        \"period\": \"03:58\",\n" +
            "        \"albumName\": \"艺术家\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nNIMT_h3fxn2zDvVlt_4Fg==/109951163667858142.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"远谣\",\n" +
            "        \"author\": \"大宽,尚东峰\",\n" +
            "        \"date\": \"2018-12-04\",\n" +
            "        \"period\": \"04:37\",\n" +
            "        \"albumName\": \"远谣\",\n" +
            "        \"pic\": \"http://p1.music.126.net/KONL-Egg2dsu8uKoESdLjQ==/109951163706308149.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"太阳出来的时候我在另一边\",\n" +
            "        \"author\": \"老板娘与酒客\",\n" +
            "        \"date\": \"2018-11-30\",\n" +
            "        \"period\": \"05:34\",\n" +
            "        \"albumName\": \"太阳出来的时候我在另一边\",\n" +
            "        \"pic\": \"http://p1.music.126.net/VopZgmRf7R14356hDdb0yg==/109951163695326598.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"A148\",\n" +
            "        \"author\": \"The Shanghai Restoration Project\",\n" +
            "        \"date\": \"2018-12-03\",\n" +
            "        \"period\": \"04:11\",\n" +
            "        \"albumName\": \"A148\",\n" +
            "        \"pic\": \"http://p1.music.126.net/TXLtPFIaR-wmJGfN8eAWEA==/109951163703948339.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"A swim in the love that you give me\",\n" +
            "        \"author\": \"窦靖童\",\n" +
            "        \"date\": \"2018-11-28\",\n" +
            "        \"period\": \"06:20\",\n" +
            "        \"albumName\": \"A swim in the love that you give me\",\n" +
            "        \"pic\": \"http://p1.music.126.net/396jbgX7S0p7Ie1aohVbPQ==/109951163687923187.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"ing ing\",\n" +
            "        \"author\": \"BigYear大年\",\n" +
            "        \"date\": \"2018-11-28\",\n" +
            "        \"period\": \"03:26\",\n" +
            "        \"albumName\": \"ing ing\",\n" +
            "        \"pic\": \"http://p1.music.126.net/zjK_gQizKGGphJe4-F9Pew==/109951163694411115.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我所谓的爱\",\n" +
            "        \"author\": \"邵夷贝\",\n" +
            "        \"date\": \"2018-11-28\",\n" +
            "        \"period\": \"03:58\",\n" +
            "        \"albumName\": \"我所谓的爱\",\n" +
            "        \"pic\": \"http://p1.music.126.net/syPIKR6nPbQHsXO9S1HOGw==/109951163691796282.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"从此我的每首歌里都有你的影子\",\n" +
            "        \"author\": \"烟把儿\",\n" +
            "        \"date\": \"2018-11-26\",\n" +
            "        \"period\": \"04:14\",\n" +
            "        \"albumName\": \"从此我的每首歌里都有你的影子\",\n" +
            "        \"pic\": \"http://p1.music.126.net/CggiZlw0-3H3YShancE94Q==/109951163690429651.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"写了好多事都是关于你 \",\n" +
            "        \"author\": \"Fine乐团\",\n" +
            "        \"date\": \"2018-11-26\",\n" +
            "        \"period\": \"04:46\",\n" +
            "        \"albumName\": \"写了好多事都是关于你\",\n" +
            "        \"pic\": \"http://p1.music.126.net/V505AUo8BE68YiO-pKlXJA==/109951163689299517.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Ti Amo\",\n" +
            "        \"author\": \"艾福杰尼\",\n" +
            "        \"date\": \"2018-12-05\",\n" +
            "        \"period\": \"04:05\",\n" +
            "        \"albumName\": \"楼兰\",\n" +
            "        \"pic\": \"http://p1.music.126.net/pTdy0AnxgSwTDK-lXeB3-g==/109951163678538781.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"出山\",\n" +
            "        \"author\": \"花粥,王胜男\",\n" +
            "        \"date\": \"2018-09-28\",\n" +
            "        \"period\": \"03:20\",\n" +
            "        \"albumName\": \"粥请客（王胜男）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/xUAfdMHdXhu3BmO4g8nOYA==/109951163573311341.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"说书人\",\n" +
            "        \"author\": \"暗杠,寅子\",\n" +
            "        \"date\": \"2018-08-24\",\n" +
            "        \"period\": \"02:59\",\n" +
            "        \"albumName\": \"说书人\",\n" +
            "        \"pic\": \"http://p1.music.126.net/X9-wFEy1DfWOx5R2iCXqIg==/109951163509761545.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"心事\",\n" +
            "        \"author\": \"徐秉龙\",\n" +
            "        \"date\": \"2018-07-21\",\n" +
            "        \"period\": \"03:44\",\n" +
            "        \"albumName\": \"零零\",\n" +
            "        \"pic\": \"http://p1.music.126.net/UsKpjjfYFBRz9FH_FyWL3w==/109951163414549268.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你还在忧愁什么呢\",\n" +
            "        \"author\": \"花粥,厘小白\",\n" +
            "        \"date\": \"2018-11-11\",\n" +
            "        \"period\": \"03:14\",\n" +
            "        \"albumName\": \"粥请客（厘小白）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/tG2WPESxhyIX3fBaSt3hbQ==/109951163658916193.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"My Man\",\n" +
            "        \"author\": \"Jony J\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"03:25\",\n" +
            "        \"albumName\": \"喜新恋旧\",\n" +
            "        \"pic\": \"http://p1.music.126.net/78Nt_AEGTm7-Nk7EXTOiVg==/109951163678373297.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"比你更爱我的人\",\n" +
            "        \"author\": \"陈壹千\",\n" +
            "        \"date\": \"2018-10-30\",\n" +
            "        \"period\": \"04:21\",\n" +
            "        \"albumName\": \"比你更爱我的人\",\n" +
            "        \"pic\": \"http://p1.music.126.net/sy41gb7mc5yyVfxUIReLlg==/109951163634446536.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"无名\",\n" +
            "        \"author\": \"陈鸿宇\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:04\",\n" +
            "        \"albumName\": \"众乐纪肆·光怪陆离\",\n" +
            "        \"pic\": \"http://p1.music.126.net/W9Cp50pi5AtCmYau6Q4YDw==/109951163704995261.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"活该\",\n" +
            "        \"author\": \"徐真真,花粥\",\n" +
            "        \"date\": \"2018-09-29\",\n" +
            "        \"period\": \"02:49\",\n" +
            "        \"albumName\": \"活该\",\n" +
            "        \"pic\": \"http://p1.music.126.net/w9eFcvd6oq6Xxk-00UYKHg==/109951163573482907.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"给妈妈\",\n" +
            "        \"author\": \"房东的猫\",\n" +
            "        \"date\": \"2018-09-23\",\n" +
            "        \"period\": \"04:22\",\n" +
            "        \"albumName\": \"给妈妈\",\n" +
            "        \"pic\": \"http://p1.music.126.net/kJ2jtxk8KV-kzeXXMH58mQ==/109951163560970830.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"一千个失聪听众\",\n" +
            "        \"author\": \"柳爽\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:04\",\n" +
            "        \"albumName\": \"众乐纪肆·光怪陆离\",\n" +
            "        \"pic\": \"http://p1.music.126.net/juSRZDcj9SgDBJBfrMKapw==/109951163705008872.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"盗将行\",\n" +
            "        \"author\": \"花粥,马雨阳\",\n" +
            "        \"date\": \"2018-06-19\",\n" +
            "        \"period\": \"03:18\",\n" +
            "        \"albumName\": \"粥请客（二）\",\n" +
            "        \"pic\": \"http://p2.music.126.net/-qHPT3rhxDlu5zQV9NcQ-A==/109951163555860423.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"至此\",\n" +
            "        \"author\": \"房东的猫\",\n" +
            "        \"date\": \"2018-11-02\",\n" +
            "        \"period\": \"04:01\",\n" +
            "        \"albumName\": \"至此\",\n" +
            "        \"pic\": \"http://p1.music.126.net/WS5-o20Rw8NSrFLHdfHs5w==/109951163641446987.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"很高兴认识你\",\n" +
            "        \"author\": \"C-BLOCK\",\n" +
            "        \"date\": \"2018-10-20\",\n" +
            "        \"period\": \"03:52\",\n" +
            "        \"albumName\": \"很高兴认识你\",\n" +
            "        \"pic\": \"http://p1.music.126.net/UU09arK_fRlyWVdh2znikA==/109951163610766464.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"这酒馆以后就我一个人来了\",\n" +
            "        \"author\": \"棱镜\",\n" +
            "        \"date\": \"2018-08-06\",\n" +
            "        \"period\": \"04:00\",\n" +
            "        \"albumName\": \"一次有预谋的初次相遇\",\n" +
            "        \"pic\": \"http://p1.music.126.net/RfUHXkanpxImcaGqFNWBeA==/109951163598901405.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Best Better Ever\",\n" +
            "        \"author\": \"陈粒\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:06\",\n" +
            "        \"albumName\": \"Best Better Ever\",\n" +
            "        \"pic\": \"http://p1.music.126.net/0T1Df0Ywk7s4W9xIhIp-aw==/109951163689764836.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我抬头一看满街都是单身的狗\",\n" +
            "        \"author\": \"花粥\",\n" +
            "        \"date\": \"2018-10-21\",\n" +
            "        \"period\": \"03:00\",\n" +
            "        \"albumName\": \"2018（注意保暖）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/fB6M_CgSRkeUzIEni6ENzw==/109951163615459621.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"SORROW\",\n" +
            "        \"author\": \"凯瑟喵\",\n" +
            "        \"date\": \"2018-12-01\",\n" +
            "        \"period\": \"03:16\",\n" +
            "        \"albumName\": \"SORROW\",\n" +
            "        \"pic\": \"http://p1.music.126.net/3P-DR3lVSHJEmV0yv8rltA==/109951163699836695.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"最美的期待\",\n" +
            "        \"author\": \"南征北战NZBZ\",\n" +
            "        \"date\": \"2018-06-29\",\n" +
            "        \"period\": \"03:57\",\n" +
            "        \"albumName\": \"最美的期待\",\n" +
            "        \"pic\": \"http://p1.music.126.net/fRZXMk6y-GD7v1gSryu-4A==/109951163381083877.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哗啦啦少年再见\",\n" +
            "        \"author\": \"焦迈奇\",\n" +
            "        \"date\": \"2018-11-08\",\n" +
            "        \"period\": \"03:51\",\n" +
            "        \"albumName\": \"哗啦啦少年再见\",\n" +
            "        \"pic\": \"http://p2.music.126.net/t5ZVimxZTKwHUyyyNGTk-g==/109951163651824924.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"都市寻情记\",\n" +
            "        \"author\": \"Yee\",\n" +
            "        \"date\": \"2018-10-30\",\n" +
            "        \"period\": \"02:42\",\n" +
            "        \"albumName\": \"Y\",\n" +
            "        \"pic\": \"http://p1.music.126.net/4_6WEE_4lgMIlzgoJCNBtQ==/109951163632970845.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"有人\",\n" +
            "        \"author\": \"赵钶\",\n" +
            "        \"date\": \"2018-08-03\",\n" +
            "        \"period\": \"04:14\",\n" +
            "        \"albumName\": \"有人\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Q14TNDAXb8DnXTl08wZD7Q==/109951163440240805.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"My 22\",\n" +
            "        \"author\": \"逆时针向,兔子ST\",\n" +
            "        \"date\": \"2018-12-04\",\n" +
            "        \"period\": \"03:14\",\n" +
            "        \"albumName\": \"My 22\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_ag6NQt55KIDeXi-atr71A==/109951163704313382.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"学到老爱到老\",\n" +
            "        \"author\": \"风小筝\",\n" +
            "        \"date\": \"2018-11-19\",\n" +
            "        \"period\": \"04:05\",\n" +
            "        \"albumName\": \"学到老爱到老\",\n" +
            "        \"pic\": \"http://p2.music.126.net/nbBVWVkp-sfOETKjkwyXNg==/109951163676439568.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"空\",\n" +
            "        \"author\": \"暗杠\",\n" +
            "        \"date\": \"2018-11-17\",\n" +
            "        \"period\": \"03:22\",\n" +
            "        \"albumName\": \"空\",\n" +
            "        \"pic\": \"http://p1.music.126.net/9mICxgRL1iNZqMwl5pYFsg==/109951163669730451.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"道理的道理\",\n" +
            "        \"author\": \"沈以诚\",\n" +
            "        \"date\": \"2018-10-16\",\n" +
            "        \"period\": \"04:16\",\n" +
            "        \"albumName\": \"道理的道理\",\n" +
            "        \"pic\": \"http://p1.music.126.net/9jpTVsOLNKifSeYSuYq6Rg==/109951163606230392.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"欠我个未来\",\n" +
            "        \"author\": \"平凡的艾岩\",\n" +
            "        \"date\": \"2018-10-21\",\n" +
            "        \"period\": \"04:30\",\n" +
            "        \"albumName\": \"欠我个未来\",\n" +
            "        \"pic\": \"http://p1.music.126.net/TfNdaxiZXyLGg_ezf4e9aA==/109951163645926048.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"沉默的誓言\",\n" +
            "        \"author\": \"南征北战NZBZ\",\n" +
            "        \"date\": \"2018-11-30\",\n" +
            "        \"period\": \"03:53\",\n" +
            "        \"albumName\": \"沉默的誓言\",\n" +
            "        \"pic\": \"http://p1.music.126.net/u2oj9qY11m5ZVnWvWLJoWg==/109951163695576106.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"寄不出去的情书\",\n" +
            "        \"author\": \"翁大涵\",\n" +
            "        \"date\": \"2018-10-30\",\n" +
            "        \"period\": \"05:13\",\n" +
            "        \"albumName\": \"寄不出去的情书\",\n" +
            "        \"pic\": \"http://p1.music.126.net/fywM5PaRIwD1sd43zY7Wtw==/109951163633529521.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"一生独一\",\n" +
            "        \"author\": \"卢焱\",\n" +
            "        \"date\": \"2018-06-12\",\n" +
            "        \"period\": \"04:09\",\n" +
            "        \"albumName\": \"一生独一\",\n" +
            "        \"pic\": \"http://p1.music.126.net/maCaAYM1GS5sl9SaBdgfTA==/109951163348574432.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"纯粹\",\n" +
            "        \"author\": \"徐海俏\",\n" +
            "        \"date\": \"2018-10-31\",\n" +
            "        \"period\": \"04:00\",\n" +
            "        \"albumName\": \"纯粹\",\n" +
            "        \"pic\": \"http://p1.music.126.net/NvLtgKdJO8OVSzrMzHzsVQ==/109951163635541730.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"云端少年\",\n" +
            "        \"author\": \"代鑫,戴尔基\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:40\",\n" +
            "        \"albumName\": \"众乐纪肆·光怪陆离\",\n" +
            "        \"pic\": \"http://p2.music.126.net/f9BRGoAEhzXHOQa3zNOsEQ==/109951163705022538.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"夜宴风波\",\n" +
            "        \"author\": \"音阙诗听,王梓钰\",\n" +
            "        \"date\": \"2018-09-15\",\n" +
            "        \"period\": \"03:24\",\n" +
            "        \"albumName\": \"夜宴风波\",\n" +
            "        \"pic\": \"http://p1.music.126.net/PPuulVHufUuWtDNHUjrYYQ==/109951163549298656.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"皇帝的新衣 (Skr)\",\n" +
            "        \"author\": \"AR（刘夫阳）\",\n" +
            "        \"date\": \"2018-07-26\",\n" +
            "        \"period\": \"03:00\",\n" +
            "        \"albumName\": \"皇帝的新衣 (Skr)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/TxwwIjyZxV7XbukRcDoRJA==/109951163426881993.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"对不起\",\n" +
            "        \"author\": \"Panta.Q,周深\",\n" +
            "        \"date\": \"2018-10-16\",\n" +
            "        \"period\": \"03:52\",\n" +
            "        \"albumName\": \"对不起\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ocS3bbRu8E6ZtyDrm4WFgg==/109951163606604501.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"以你命题\",\n" +
            "        \"author\": \"乌糟兽\",\n" +
            "        \"date\": \"2018-11-21\",\n" +
            "        \"period\": \"04:25\",\n" +
            "        \"albumName\": \"最后的先知\",\n" +
            "        \"pic\": \"http://p1.music.126.net/fLvqdPxd7HXajk4GwS6w3w==/109951163669675449.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Run Dat Game\",\n" +
            "        \"author\": \"Mc光光,Round_2,Ice Paper\",\n" +
            "        \"date\": \"2018-11-30\",\n" +
            "        \"period\": \"04:33\",\n" +
            "        \"albumName\": \"run dat game\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Au9FBwUdREPbhDp1JR8ceg==/109951163696450964.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"SAD激光雨\",\n" +
            "        \"author\": \"SSS水鬼,化學凝結尾,Rochard\",\n" +
            "        \"date\": \"2018-12-03\",\n" +
            "        \"period\": \"02:11\",\n" +
            "        \"albumName\": \"SAD激光雨\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Z4-f2foCXh7tK-KKYVz3cQ==/109951163704234228.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"一半\",\n" +
            "        \"author\": \"熊汝霖\",\n" +
            "        \"date\": \"2018-10-31\",\n" +
            "        \"period\": \"03:35\",\n" +
            "        \"albumName\": \"一半\",\n" +
            "        \"pic\": \"http://p1.music.126.net/m6IRbB-Cd4jm8BUlXRUV-g==/109951163636307562.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"九月底 \",\n" +
            "        \"author\": \"余佳运\",\n" +
            "        \"date\": \"2018-11-20\",\n" +
            "        \"period\": \"04:17\",\n" +
            "        \"albumName\": \"九月底\",\n" +
            "        \"pic\": \"http://p1.music.126.net/vN8ib5afmH3oUp8TYl5-ag==/109951163676876789.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"浪客侠心\",\n" +
            "        \"author\": \"HOPE-T\",\n" +
            "        \"date\": \"2018-11-30\",\n" +
            "        \"period\": \"03:38\",\n" +
            "        \"albumName\": \"浪客侠心\",\n" +
            "        \"pic\": \"http://p1.music.126.net/NRn0ccSIS-0GiiW-1ihkpg==/109951163697271510.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Young For You\",\n" +
            "        \"author\": \"GALA\",\n" +
            "        \"date\": \"2018-09-28\",\n" +
            "        \"period\": \"03:51\",\n" +
            "        \"albumName\": \"2的奉献--GALA爱爱爱新年音乐会Vol.1\",\n" +
            "        \"pic\": \"http://p1.music.126.net/OO59wy9uDFKjmdmb9h2t6A==/109951163512287703.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"摸摸它\",\n" +
            "        \"author\": \"花粥,孟凡明\",\n" +
            "        \"date\": \"2018-08-22\",\n" +
            "        \"period\": \"04:12\",\n" +
            "        \"albumName\": \"粥请客（三）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nCyMkjJZeBlLPRaBriVG1Q==/109951163497159572.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"流光记\",\n" +
            "        \"author\": \"银临\",\n" +
            "        \"date\": \"2018-10-02\",\n" +
            "        \"period\": \"04:45\",\n" +
            "        \"albumName\": \"流光记\",\n" +
            "        \"pic\": \"http://p1.music.126.net/hMYhT0w-dZ3xWL1FFDDIqw==/109951163580172000.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"顺平侯\",\n" +
            "        \"author\": \"花粥\",\n" +
            "        \"date\": \"2018-09-20\",\n" +
            "        \"period\": \"03:01\",\n" +
            "        \"albumName\": \"2018（哼）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5yK415W0v8TX56vaM1HgEA==/109951163561651681.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"花舞人间\",\n" +
            "        \"author\": \"闫东炜\",\n" +
            "        \"date\": \"2018-12-01\",\n" +
            "        \"period\": \"03:00\",\n" +
            "        \"albumName\": \"花舞人间\",\n" +
            "        \"pic\": \"http://p1.music.126.net/YiUXsJqkBxqZNJb0r_nzlA==/109951163698382316.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你那边还好吗\",\n" +
            "        \"author\": \"李子阳\",\n" +
            "        \"date\": \"2018-11-23\",\n" +
            "        \"period\": \"05:03\",\n" +
            "        \"albumName\": \"你那边还好吗\",\n" +
            "        \"pic\": \"http://p1.music.126.net/NCaWGf4-7coXMsJIfDEisg==/109951163683942488.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你有什么愿望么 我想听\",\n" +
            "        \"author\": \"秦才淞\",\n" +
            "        \"date\": \"2018-12-03\",\n" +
            "        \"period\": \"04:00\",\n" +
            "        \"albumName\": \"你好，这是一份愿望清单\",\n" +
            "        \"pic\": \"http://p1.music.126.net/W-11MSO8X-c-IKRdUejOCQ==/109951163704567199.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你能看到我\",\n" +
            "        \"author\": \"黄旭,艾热\",\n" +
            "        \"date\": \"2018-08-04\",\n" +
            "        \"period\": \"04:42\",\n" +
            "        \"albumName\": \"你能看到我\",\n" +
            "        \"pic\": \"http://p1.music.126.net/jsI2rnBaFm4jCOjQ7rnfew==/109951163439689555.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"孤独城市\",\n" +
            "        \"author\": \"李上安\",\n" +
            "        \"date\": \"2018-08-21\",\n" +
            "        \"period\": \"04:25\",\n" +
            "        \"albumName\": \"慢\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_XrcPAzO50NZoMpk8FSEPw==/109951163385682767.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"想淋雨就别走\",\n" +
            "        \"author\": \"Fine乐团\",\n" +
            "        \"date\": \"2018-10-10\",\n" +
            "        \"period\": \"04:41\",\n" +
            "        \"albumName\": \"想淋雨就别走\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Z2sHJnvUj9_-RYn48iNxCw==/109951163596582581.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Heart Beats (feat. Yuli Huang)\",\n" +
            "        \"author\": \"黄雨篱,iDiot8,Weiyu Shen\",\n" +
            "        \"date\": \"2018-12-04\",\n" +
            "        \"period\": \"03:02\",\n" +
            "        \"albumName\": \"Heart Beats\",\n" +
            "        \"pic\": \"http://p2.music.126.net/QKbxhJV2ku4uGJbU0aUX-A==/109951163706011950.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"惊蛰\",\n" +
            "        \"author\": \"音阙诗听,王梓钰\",\n" +
            "        \"date\": \"2018-06-25\",\n" +
            "        \"period\": \"04:01\",\n" +
            "        \"albumName\": \"惊蛰\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5MmXpaP9r88tNzExPGMI8Q==/109951163370350985.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"好嗨哦 感觉人生已经到达了高潮\",\n" +
            "        \"author\": \"Tino.S3\",\n" +
            "        \"date\": \"2018-12-03\",\n" +
            "        \"period\": \"03:23\",\n" +
            "        \"albumName\": \"好嗨哦\",\n" +
            "        \"pic\": \"http://p1.music.126.net/PMyYPVCjn4-ffsYUmbjZnQ==/109951163703707089.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"时空\",\n" +
            "        \"author\": \"张楚\",\n" +
            "        \"date\": \"2018-11-17\",\n" +
            "        \"period\": \"04:28\",\n" +
            "        \"albumName\": \"时空\",\n" +
            "        \"pic\": \"http://p1.music.126.net/MdeUubEsCs7PsCQ1LFVfSQ==/109951163670604760.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"梧桐\",\n" +
            "        \"author\": \"唐映枫,黄楚桐\",\n" +
            "        \"date\": \"2018-10-30\",\n" +
            "        \"period\": \"05:33\",\n" +
            "        \"albumName\": \"梧桐\",\n" +
            "        \"pic\": \"http://p1.music.126.net/dVhZQP3Z013EaC1sukANaQ==/109951163633504772.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"形意\",\n" +
            "        \"author\": \"谢帝,Anti-General\",\n" +
            "        \"date\": \"2018-11-03\",\n" +
            "        \"period\": \"03:34\",\n" +
            "        \"albumName\": \"三\",\n" +
            "        \"pic\": \"http://p1.music.126.net/-k4UD9OTVlmOA1zGDZV6Xg==/109951163648291636.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"“End ofthe world”\",\n" +
            "        \"author\": \"Trouble.Z,法老,situasian张太郎\",\n" +
            "        \"date\": \"2018-08-03\",\n" +
            "        \"period\": \"04:45\",\n" +
            "        \"albumName\": \"End of the world\",\n" +
            "        \"pic\": \"http://p1.music.126.net/tAoZ1b2JntmPBAaCROTegA==/109951163439540253.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"十一月\",\n" +
            "        \"author\": \"王三溥,熊梓崴\",\n" +
            "        \"date\": \"2018-11-03\",\n" +
            "        \"period\": \"04:55\",\n" +
            "        \"albumName\": \"十一月\",\n" +
            "        \"pic\": \"http://p1.music.126.net/9bIsi6Pfsr37VZircFjbhg==/109951163639133353.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"上里与手抄卷\",\n" +
            "        \"author\": \"双笙,闫东炜\",\n" +
            "        \"date\": \"2018-07-27\",\n" +
            "        \"period\": \"05:19\",\n" +
            "        \"albumName\": \"上里与手抄卷\",\n" +
            "        \"pic\": \"http://p1.music.126.net/F6UFAwFC1zkzifDJ9JEXcQ==/109951163435093197.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"彩虹下面\",\n" +
            "        \"author\": \"赵雷\",\n" +
            "        \"date\": \"2018-07-23\",\n" +
            "        \"period\": \"04:42\",\n" +
            "        \"albumName\": \"彩虹下面\",\n" +
            "        \"pic\": \"http://p1.music.126.net/v3dWeCvmSOqPb4bzYCoA8w==/109951163425838987.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"白夜备忘录\",\n" +
            "        \"author\": \"冯佳界\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:06\",\n" +
            "        \"albumName\": \"众乐纪肆·光怪陆离\",\n" +
            "        \"pic\": \"http://p1.music.126.net/x-t04sLUfEFG5_Trz8GTjQ==/109951163705046031.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"My 22 (Inst.)\",\n" +
            "        \"author\": \"逆时针向\",\n" +
            "        \"date\": \"2018-12-04\",\n" +
            "        \"period\": \"03:14\",\n" +
            "        \"albumName\": \"My 22\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_ag6NQt55KIDeXi-atr71A==/109951163704313382.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"China-E\",\n" +
            "        \"author\": \"徐梦圆\",\n" +
            "        \"date\": \"2018-08-24\",\n" +
            "        \"period\": \"03:24\",\n" +
            "        \"albumName\": \"China-E\",\n" +
            "        \"pic\": \"http://p1.music.126.net/tTH10cFyn0LKQh2FYJL9JQ==/109951163512571949.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"离开你的城市后\",\n" +
            "        \"author\": \"陈壹千\",\n" +
            "        \"date\": \"2018-06-29\",\n" +
            "        \"period\": \"04:41\",\n" +
            "        \"albumName\": \"离开你的城市后\",\n" +
            "        \"pic\": \"http://p2.music.126.net/45634l0yUQ_sn9txSBYtwQ==/109951163381808991.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"华年\",\n" +
            "        \"author\": \"鹿先森乐队\",\n" +
            "        \"date\": \"2018-07-16\",\n" +
            "        \"period\": \"04:19\",\n" +
            "        \"albumName\": \"华年\",\n" +
            "        \"pic\": \"http://p1.music.126.net/r94mVfx8ERhRr7Zzemhd_w==/109951163405599390.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"All Or Nothing (Feat.snoop dogg)\",\n" +
            "        \"author\": \"谢帝,Snoop Dogg\",\n" +
            "        \"date\": \"2018-10-30\",\n" +
            "        \"period\": \"03:50\",\n" +
            "        \"albumName\": \"三\",\n" +
            "        \"pic\": \"http://p1.music.126.net/-k4UD9OTVlmOA1zGDZV6Xg==/109951163648291636.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"一棵会开花的树\",\n" +
            "        \"author\": \"谢春花\",\n" +
            "        \"date\": \"2018-06-12\",\n" +
            "        \"period\": \"03:15\",\n" +
            "        \"albumName\": \"点心\",\n" +
            "        \"pic\": \"http://p1.music.126.net/bbQqsr9hvVPTpDVmqnPaUw==/109951163345567967.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"少尉先生\",\n" +
            "        \"author\": \"马融\",\n" +
            "        \"date\": \"2018-11-30\",\n" +
            "        \"period\": \"03:59\",\n" +
            "        \"albumName\": \"少尉先生\",\n" +
            "        \"pic\": \"http://p1.music.126.net/3rvyoGZS7QKzA06O6ORDjg==/109951163696848951.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"通过验证\",\n" +
            "        \"author\": \"艾福杰尼\",\n" +
            "        \"date\": \"2018-09-07\",\n" +
            "        \"period\": \"03:37\",\n" +
            "        \"albumName\": \"通过验证\",\n" +
            "        \"pic\": \"http://p1.music.126.net/IRWuy_vihVj6CX9o9AKcmQ==/109951163536411219.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Dark Forest\",\n" +
            "        \"author\": \"Toby Davis\",\n" +
            "        \"date\": \"2018-11-29\",\n" +
            "        \"period\": \"04:06\",\n" +
            "        \"albumName\": \"Dark Forest\",\n" +
            "        \"pic\": \"http://p1.music.126.net/TZlCK3ocQ_xNZ_B90jQm9g==/109951163695170165.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"从头\",\n" +
            "        \"author\": \"陈粒\",\n" +
            "        \"date\": \"2018-09-12\",\n" +
            "        \"period\": \"03:28\",\n" +
            "        \"albumName\": \"从头\",\n" +
            "        \"pic\": \"http://p2.music.126.net/ewafe5uApGKwX7o9c8Ygag==/109951163544830874.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你会不会请我喝瓶山城啤酒\",\n" +
            "        \"author\": \"刘莱斯\",\n" +
            "        \"date\": \"2018-08-08\",\n" +
            "        \"period\": \"04:57\",\n" +
            "        \"albumName\": \"你会不会请我喝瓶山城啤酒\",\n" +
            "        \"pic\": \"http://p2.music.126.net/g13SsjiSA-PBqVS3bt6b4A==/109951163446824774.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"给妈妈的歌\",\n" +
            "        \"author\": \"黄旭,李佳隆\",\n" +
            "        \"date\": \"2018-07-11\",\n" +
            "        \"period\": \"02:56\",\n" +
            "        \"albumName\": \"给妈妈的歌\",\n" +
            "        \"pic\": \"http://p1.music.126.net/CALEUeK-DIJOd5pHCf-LmA==/109951163393170726.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"押韵歌\",\n" +
            "        \"author\": \"AR（刘夫阳）\",\n" +
            "        \"date\": \"2018-10-20\",\n" +
            "        \"period\": \"04:09\",\n" +
            "        \"albumName\": \"押韵歌\",\n" +
            "        \"pic\": \"http://p1.music.126.net/gQHY8dHJqpURLwanBMFPCQ==/109951163620413813.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"洞仙尘烟\",\n" +
            "        \"author\": \"音阙诗听,昆玉\",\n" +
            "        \"date\": \"2018-11-22\",\n" +
            "        \"period\": \"04:27\",\n" +
            "        \"albumName\": \"洞仙尘烟\",\n" +
            "        \"pic\": \"http://p1.music.126.net/y_Ye5gbBsWNHODIVVIwJ1A==/109951163681941000.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"地球上最后一个男孩\",\n" +
            "        \"author\": \"红双囍\",\n" +
            "        \"date\": \"2018-11-29\",\n" +
            "        \"period\": \"04:00\",\n" +
            "        \"albumName\": \"地球上最后一个男孩\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_j4pR1f54ElB1TiVNVEqrw==/109951163695413816.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"20\",\n" +
            "        \"author\": \"廖效浓\",\n" +
            "        \"date\": \"2018-08-07\",\n" +
            "        \"period\": \"04:06\",\n" +
            "        \"albumName\": \"廖效浓\",\n" +
            "        \"pic\": \"http://p1.music.126.net/1LobCJJCiF3rzz7s-ytMCw==/109951163436908363.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"迷途之中\",\n" +
            "        \"author\": \"李上安\",\n" +
            "        \"date\": \"2018-08-21\",\n" +
            "        \"period\": \"03:43\",\n" +
            "        \"albumName\": \"慢\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_XrcPAzO50NZoMpk8FSEPw==/109951163385682767.jpg\"\n" +
            "    }\n" +
            "]";
    public static List<JSONObject> originTopMusicData = null;
    static {
        originTopMusicData = JSON.parseObject(originTopMusicDataStr,List.class);
    }
}
