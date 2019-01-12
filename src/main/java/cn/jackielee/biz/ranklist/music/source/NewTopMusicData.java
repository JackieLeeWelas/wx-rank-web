package cn.jackielee.biz.ranklist.music.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by lxb on 2019/1/12.
 */
public class NewTopMusicData {
    public static final String newTopMusicDataStr = "[\n" +
            "    {\n" +
            "        \"title\": \"起风了\",\n" +
            "        \"author\": \"买辣椒也用券\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"05:25\",\n" +
            "        \"albumName\": \"起风了\",\n" +
            "        \"pic\": \"http://p1.music.126.net/diGAyEmpymX8G7JcnElncQ==/109951163699673355.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"遗书\",\n" +
            "        \"author\": \"蔡健雅\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"04:15\",\n" +
            "        \"albumName\": \"遗书\",\n" +
            "        \"pic\": \"http://p1.music.126.net/x2-nJAeh1QYAAaaVB8oqIw==/109951163709524815.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"岩石里的花\",\n" +
            "        \"author\": \"G.E.M.邓紫棋\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:54\",\n" +
            "        \"albumName\": \"岩石里的花\",\n" +
            "        \"pic\": \"http://p1.music.126.net/XRxZk-k7_f_KFallvyNVQg==/109951163709089294.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"书\",\n" +
            "        \"author\": \"张楚\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:57\",\n" +
            "        \"albumName\": \"书\",\n" +
            "        \"pic\": \"http://p1.music.126.net/njnd7ti0bTeUFyrp3f4Ujw==/109951163716330454.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Different World\",\n" +
            "        \"author\": \"Alan Walker,K-391,CORSAK,Sofia Carson\",\n" +
            "        \"date\": \"2018-11-30\",\n" +
            "        \"period\": \"03:22\",\n" +
            "        \"albumName\": \"Different World\",\n" +
            "        \"pic\": \"http://p1.music.126.net/AsWeNHmhdf70gMOPR119AQ==/109951163684060115.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"光年之外 (热爱版)\",\n" +
            "        \"author\": \"G.E.M.邓紫棋,艾热\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:37\",\n" +
            "        \"albumName\": \"光年之外 (热爱版)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/-tBRFXYkEoT73fFAgQcg5w==/109951163717782652.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"姬和不如\",\n" +
            "        \"author\": \"隔壁老樊\",\n" +
            "        \"date\": \"2018-11-15\",\n" +
            "        \"period\": \"04:12\",\n" +
            "        \"albumName\": \"姬和不如\",\n" +
            "        \"pic\": \"http://p1.music.126.net/QPLLad7eBWZG7tphT6uJfw==/109951163667546580.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"倾城时光\",\n" +
            "        \"author\": \"金瀚\",\n" +
            "        \"date\": \"2018-11-25\",\n" +
            "        \"period\": \"03:13\",\n" +
            "        \"albumName\": \"电视剧 你和我的倾城时光 原声带\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_NZWyS_YKtyhIhYCvsK0gQ==/109951163676646729.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"胡广生\",\n" +
            "        \"author\": \"任素汐\",\n" +
            "        \"date\": \"2018-11-19\",\n" +
            "        \"period\": \"03:34\",\n" +
            "        \"albumName\": \"胡广生\",\n" +
            "        \"pic\": \"http://p1.music.126.net/fG0T1hnM9EEmkYSo4Ey97A==/109951163669946483.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"喜新恋旧\",\n" +
            "        \"author\": \"Jony J\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:22\",\n" +
            "        \"albumName\": \"喜新恋旧\",\n" +
            "        \"pic\": \"http://p1.music.126.net/78Nt_AEGTm7-Nk7EXTOiVg==/109951163678373297.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"南风北巷\",\n" +
            "        \"author\": \"解忧邵帅\",\n" +
            "        \"date\": \"2018-11-15\",\n" +
            "        \"period\": \"04:10\",\n" +
            "        \"albumName\": \"借忧 所以然\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Txr6At7-WyGW16JF_V26Hg==/109951163691637080.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Get Sweat (Feat.张晏恺)\",\n" +
            "        \"author\": \"朱星杰\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:18\",\n" +
            "        \"albumName\": \"Get Sweat\",\n" +
            "        \"pic\": \"http://p1.music.126.net/rOi_ziYRV0DqN2scnpQ1BQ==/109951163704443811.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"绝代风华\",\n" +
            "        \"author\": \"许嵩\",\n" +
            "        \"date\": \"2018-11-22\",\n" +
            "        \"period\": \"04:15\",\n" +
            "        \"albumName\": \"绝代风华\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Ngh65GwhHtufNRSs9KgEIA==/109951163681417636.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"乱世\",\n" +
            "        \"author\": \"鬼卞\",\n" +
            "        \"date\": \"2018-12-08\",\n" +
            "        \"period\": \"03:20\",\n" +
            "        \"albumName\": \"乱世\",\n" +
            "        \"pic\": \"http://p1.music.126.net/OqHoCCeiQibY4k_MHiA8VQ==/109951163704197285.jpg\"\n" +
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
            "        \"title\": \"Drunk\",\n" +
            "        \"author\": \"徐梦圆,嘿人李逵Noisemakers,J Cason\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:46\",\n" +
            "        \"albumName\": \"Drunk\",\n" +
            "        \"pic\": \"http://p1.music.126.net/CQUTANMItzQdGRx5g40kOw==/109951163715480470.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"当爱来临的时候\",\n" +
            "        \"author\": \"吴莫愁\",\n" +
            "        \"date\": \"2018-11-06\",\n" +
            "        \"period\": \"03:46\",\n" +
            "        \"albumName\": \"电视剧 你和我的倾城时光 原声带\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_NZWyS_YKtyhIhYCvsK0gQ==/109951163676646729.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"大眠\",\n" +
            "        \"author\": \"王心凌\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:59\",\n" +
            "        \"albumName\": \"CYNDILOVES2SING 爱。心凌\",\n" +
            "        \"pic\": \"http://p1.music.126.net/kiThDJ2wlbhgX9d3vvVbWw==/109951163709583836.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"鹦鹉\",\n" +
            "        \"author\": \"孟凡明\",\n" +
            "        \"date\": \"2018-11-10\",\n" +
            "        \"period\": \"04:24\",\n" +
            "        \"albumName\": \"鹦鹉\",\n" +
            "        \"pic\": \"http://p1.music.126.net/8j1Or2EFUGzsiaobieM8yQ==/109951163649699436.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"起风了 (Acoustic)\",\n" +
            "        \"author\": \"买辣椒也用券\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"05:21\",\n" +
            "        \"albumName\": \"起风了\",\n" +
            "        \"pic\": \"http://p1.music.126.net/diGAyEmpymX8G7JcnElncQ==/109951163699673355.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小船\",\n" +
            "        \"author\": \"陈绮贞\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:39\",\n" +
            "        \"albumName\": \"小船\",\n" +
            "        \"pic\": \"http://p1.music.126.net/2beNqOflIWxV72IXGCSB2Q==/109951163683705049.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Waste It On Me (Slushii Remix)\",\n" +
            "        \"author\": \"Steve Aoki,BTS (防弹少年团),Slushii\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:08\",\n" +
            "        \"albumName\": \"Waste It On Me (Slushii Remix)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/BQWzbopj7oNuCd1YpMOzdQ==/109951163710553178.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \" 时光是座博物馆\",\n" +
            "        \"author\": \"木小雅\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:40\",\n" +
            "        \"albumName\": \"时光是座博物馆\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ichnH9ZQd0vpAxf33i4P4Q==/109951163712011047.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"那个傻瓜\",\n" +
            "        \"author\": \"陈雪凝\",\n" +
            "        \"date\": \"2018-12-08\",\n" +
            "        \"period\": \"04:27\",\n" +
            "        \"albumName\": \"那个傻瓜\",\n" +
            "        \"pic\": \"http://p1.music.126.net/U4ua33ndX8SXVs3X_AjixA==/109951163714846692.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"The Winter Light (冬日告白)\",\n" +
            "        \"author\": \"朱正廷\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:18\",\n" +
            "        \"albumName\": \"The Winter Light (冬日告白)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/HMu97SikhAT-LfiindfgEA==/109951163696748307.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"I'm Here\",\n" +
            "        \"author\": \"范丞丞\",\n" +
            "        \"date\": \"2018-11-22\",\n" +
            "        \"period\": \"02:56\",\n" +
            "        \"albumName\": \"I'm Here\",\n" +
            "        \"pic\": \"http://p1.music.126.net/0IkfnkuBsyVBOnYfOeYRsg==/109951163679679123.jpg\"\n" +
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
            "        \"title\": \"Don't Think Twice\",\n" +
            "        \"author\": \"宇多田ヒカル\",\n" +
            "        \"date\": \"2018-12-10\",\n" +
            "        \"period\": \"04:33\",\n" +
            "        \"albumName\": \"Don't Think Twice\",\n" +
            "        \"pic\": \"http://p1.music.126.net/c3vhtrOXY5R3VCn1LdKUMw==/109951163712086952.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"回忆的沙漏 (10周年版)\",\n" +
            "        \"author\": \"G.E.M.邓紫棋\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:54\",\n" +
            "        \"albumName\": \"回忆的沙漏 (10周年版)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/KfwhcY-Pz72EgqbZ27wYYw==/109951163695133395.jpg\"\n" +
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
            "        \"title\": \"艺术家\",\n" +
            "        \"author\": \"徐秉龙\",\n" +
            "        \"date\": \"2018-11-16\",\n" +
            "        \"period\": \"03:58\",\n" +
            "        \"albumName\": \"艺术家\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nNIMT_h3fxn2zDvVlt_4Fg==/109951163667858142.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Twenty One\",\n" +
            "        \"author\": \"Greyson Chance\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:12\",\n" +
            "        \"albumName\": \"Twenty One\",\n" +
            "        \"pic\": \"http://p1.music.126.net/zau5i1yHqvcIPv6UMOp5-Q==/109951163710535610.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"离开我你快乐吗\",\n" +
            "        \"author\": \"虎二\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:39\",\n" +
            "        \"albumName\": \"离开我你快乐吗\",\n" +
            "        \"pic\": \"http://p1.music.126.net/vl-8nsMo6N8M35aMQMHQgg==/109951163694910921.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"It's Always The Little Things\",\n" +
            "        \"author\": \"郭顶,Rachael Yamagata\",\n" +
            "        \"date\": \"2018-11-23\",\n" +
            "        \"period\": \"04:10\",\n" +
            "        \"albumName\": \"It's Always The Little Things\",\n" +
            "        \"pic\": \"http://p1.music.126.net/7ee_tjv-kJI8HgZB_eGAEg==/109951163681321795.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"동화\",\n" +
            "        \"author\": \"金东律,IU\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"04:13\",\n" +
            "        \"albumName\": \"동화 (feat. 아이유)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ZVt22tl2eEr0XQ4eqQojXw==/109951163711354155.jpg\"\n" +
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
            "        \"title\": \"触电\",\n" +
            "        \"author\": \"徐良,冯提莫\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:12\",\n" +
            "        \"albumName\": \"触电\",\n" +
            "        \"pic\": \"http://p1.music.126.net/wIFAQ4fUPsUElhemF08EuA==/109951163694965059.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Project Dreams\",\n" +
            "        \"author\": \"Marshmello,Roddy Ricch\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"02:47\",\n" +
            "        \"albumName\": \"Project Dreams\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ecktyF_YGPBMKzlW8aKDOw==/109951163710467936.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Bad Habit\",\n" +
            "        \"author\": \"Far East Movement,艾热,Justine Skye\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:14\",\n" +
            "        \"albumName\": \"Bad Habit\",\n" +
            "        \"pic\": \"http://p1.music.126.net/zxEiS1F2_xIFsS-TDV5Yog==/109951163691378676.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"黑白键\",\n" +
            "        \"author\": \"何洁\",\n" +
            "        \"date\": \"2018-11-15\",\n" +
            "        \"period\": \"03:24\",\n" +
            "        \"albumName\": \"电视剧 你和我的倾城时光 原声带\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_NZWyS_YKtyhIhYCvsK0gQ==/109951163676646729.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"春山外史\",\n" +
            "        \"author\": \"李常超 (Lao乾妈)\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:53\",\n" +
            "        \"albumName\": \"春山外史\",\n" +
            "        \"pic\": \"http://p1.music.126.net/DsVWX25IHeAdNBXag-2LQg==/109951163711827198.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Dumb Show\",\n" +
            "        \"author\": \"范丞丞\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:29\",\n" +
            "        \"albumName\": \"NEXT TO YOU\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nuQbaqdgyDi_fcZIB29ung==/109951163707352041.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Goodnight To You\",\n" +
            "        \"author\": \"毕雯珺\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:23\",\n" +
            "        \"albumName\": \"NEXT TO YOU\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nuQbaqdgyDi_fcZIB29ung==/109951163707352041.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"如果遇见\",\n" +
            "        \"author\": \"孙伯纶\",\n" +
            "        \"date\": \"2018-11-19\",\n" +
            "        \"period\": \"03:43\",\n" +
            "        \"albumName\": \"电视剧 你和我的倾城时光 原声带\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_NZWyS_YKtyhIhYCvsK0gQ==/109951163676646729.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"了解一下\",\n" +
            "        \"author\": \"AY楊佬叁,CNBALLER\",\n" +
            "        \"date\": \"2018-11-23\",\n" +
            "        \"period\": \"03:09\",\n" +
            "        \"albumName\": \"了解一下\",\n" +
            "        \"pic\": \"http://p1.music.126.net/pOoa9RKr3qIVGC8kOBcvTg==/109951163682956816.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"到处不存在的我\",\n" +
            "        \"author\": \"王心凌\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"04:21\",\n" +
            "        \"albumName\": \"CYNDILOVES2SING 爱。心凌\",\n" +
            "        \"pic\": \"http://p1.music.126.net/kiThDJ2wlbhgX9d3vvVbWw==/109951163709583836.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"塔之礼赞\",\n" +
            "        \"author\": \"双笙,雨狸,依溪禾\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:46\",\n" +
            "        \"albumName\": \"αrtist5（人声本家）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/fKZR3uOkMdsn3tsMhQbvBw==/109951163711108742.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"少年时\",\n" +
            "        \"author\": \"侯明昊\",\n" +
            "        \"date\": \"2018-11-22\",\n" +
            "        \"period\": \"03:42\",\n" +
            "        \"albumName\": \"少年时\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Ia3ECpXo_oeuZKXJgkpWZw==/109951163689414020.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我的心里只有你没有他\",\n" +
            "        \"author\": \"大张伟\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:50\",\n" +
            "        \"albumName\": \"我的心里只有你没有他\",\n" +
            "        \"pic\": \"http://p1.music.126.net/gKtWamEhBBNzCIBkZzEdWg==/109951163711583049.jpg\"\n" +
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
            "        \"title\": \"After Leaving\",\n" +
            "        \"author\": \"黄明昊 (Justin)\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:54\",\n" +
            "        \"albumName\": \"NEXT TO YOU\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nuQbaqdgyDi_fcZIB29ung==/109951163707352041.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"爱的重量\",\n" +
            "        \"author\": \"王心凌\",\n" +
            "        \"date\": \"2018-12-05\",\n" +
            "        \"period\": \"03:34\",\n" +
            "        \"albumName\": \"CYNDILOVES2SING 爱。心凌\",\n" +
            "        \"pic\": \"http://p1.music.126.net/kiThDJ2wlbhgX9d3vvVbWw==/109951163709583836.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"1999 (R3HAB Remix)\",\n" +
            "        \"author\": \"Charli XCX,Troye Sivan,R3hab\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:18\",\n" +
            "        \"albumName\": \"1999 (R3HAB Remix)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/wrwaxZMu486-DlzZ1Bizbw==/109951163712810792.jpg\"\n" +
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
            "        \"title\": \"RBB (Really Bad Boy)\",\n" +
            "        \"author\": \"Red Velvet\",\n" +
            "        \"date\": \"2018-11-30\",\n" +
            "        \"period\": \"03:08\",\n" +
            "        \"albumName\": \"RBB - The 5th Mini Album\",\n" +
            "        \"pic\": \"http://p1.music.126.net/q1az14W75SNHO7zvKyScjg==/109951163697271836.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"I.W.A.B.N\",\n" +
            "        \"author\": \"Lil Ghost小鬼\",\n" +
            "        \"date\": \"2018-11-16\",\n" +
            "        \"period\": \"02:34\",\n" +
            "        \"albumName\": \"I.W.A.B.N\",\n" +
            "        \"pic\": \"http://p1.music.126.net/H3I9SsShhBmlGe9bW8cXMA==/109951163680363568.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"劈你的雷正在路上\",\n" +
            "        \"author\": \"王心凌\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:41\",\n" +
            "        \"albumName\": \"CYNDILOVES2SING 爱。心凌\",\n" +
            "        \"pic\": \"http://p1.music.126.net/kiThDJ2wlbhgX9d3vvVbWw==/109951163709583836.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"P!NK\",\n" +
            "        \"author\": \"刘思鉴,飞行少年,尚先生\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:31\",\n" +
            "        \"albumName\": \"PINK\",\n" +
            "        \"pic\": \"http://p1.music.126.net/n77svZQbLIw0zk4Dap70eA==/109951163711283955.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我的爱对你说\",\n" +
            "        \"author\": \"好妹妹\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:18\",\n" +
            "        \"albumName\": \"我们的四十年 电视原声带\",\n" +
            "        \"pic\": \"http://p1.music.126.net/SFZC33kMEISyoR9CXp7dhg==/109951163678538356.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"那时的我们\",\n" +
            "        \"author\": \"毛不易\",\n" +
            "        \"date\": \"2018-11-25\",\n" +
            "        \"period\": \"03:27\",\n" +
            "        \"albumName\": \"那时的我们\",\n" +
            "        \"pic\": \"http://p1.music.126.net/KKAHZ60LxmIz9faQNlxW-g==/109951163681898984.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"whoa (mind in awe)\",\n" +
            "        \"author\": \"XXXTENTACION\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"02:37\",\n" +
            "        \"albumName\": \"SKINS\",\n" +
            "        \"pic\": \"http://p1.music.126.net/zn8_8YIoUvv9_1DGUUTTFw==/109951163663861040.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"鱼\",\n" +
            "        \"author\": \"西瓜JUN\",\n" +
            "        \"date\": \"2018-11-18\",\n" +
            "        \"period\": \"03:56\",\n" +
            "        \"albumName\": \"鱼\",\n" +
            "        \"pic\": \"http://p1.music.126.net/6JTC45z5d4iuiR96Pr6ojw==/109951163655932227.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"男の勲章 - 试听版\",\n" +
            "        \"author\": \"今日俺バンド\",\n" +
            "        \"date\": \"2018-11-19\",\n" +
            "        \"period\": \"01:35\",\n" +
            "        \"albumName\": \"男の勲章\",\n" +
            "        \"pic\": \"http://p1.music.126.net/jhhvS30uSU2tGJWpeY4jVQ==/109951163681452818.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"最美的遇见\",\n" +
            "        \"author\": \"徐佳莹\",\n" +
            "        \"date\": \"2018-09-11\",\n" +
            "        \"period\": \"04:45\",\n" +
            "        \"albumName\": \"凉生，我们可不可以不忧伤 电视剧原声带\",\n" +
            "        \"pic\": \"http://p1.music.126.net/-Hw92LxmlGBhFr1bQEXw0Q==/109951163677978089.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"消失的侦探\",\n" +
            "        \"author\": \"封茗囧菌\",\n" +
            "        \"date\": \"2018-12-09\",\n" +
            "        \"period\": \"04:37\",\n" +
            "        \"albumName\": \"消失的侦探\",\n" +
            "        \"pic\": \"http://p1.music.126.net/POZ3ZxDK_mpHJBtdWGHYVQ==/109951163715356757.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"I Got Love\",\n" +
            "        \"author\": \"Don Diablo,Nate Dogg\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"02:39\",\n" +
            "        \"albumName\": \"I Got Love\",\n" +
            "        \"pic\": \"http://p1.music.126.net/7N-hpOCAEaeFn6X7HNsk4w==/109951163707652084.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"陌生的刚好\",\n" +
            "        \"author\": \"习谱予\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:10\",\n" +
            "        \"albumName\": \"陌生的刚好\",\n" +
            "        \"pic\": \"http://p1.music.126.net/6lL1YMFBc0FTcyMLu8Y8Cg==/109951163705862498.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"梦开始的地方\",\n" +
            "        \"author\": \"朱一龙,吉克隽逸,刘维,李菲儿\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:36\",\n" +
            "        \"albumName\": \"梦开始的地方\",\n" +
            "        \"pic\": \"http://p1.music.126.net/j8rIxLCOBEVJ9wxpSS-PWQ==/109951163688892269.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"绮骨说【人声本家】\",\n" +
            "        \"author\": \"双笙\",\n" +
            "        \"date\": \"2018-12-03\",\n" +
            "        \"period\": \"04:44\",\n" +
            "        \"albumName\": \"绮骨说【人声本家】\",\n" +
            "        \"pic\": \"http://p1.music.126.net/IsAMvic17bsbPrJWEGG2hQ==/109951163704207295.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"连锁反应\",\n" +
            "        \"author\": \"Jony J\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"03:40\",\n" +
            "        \"albumName\": \"喜新恋旧\",\n" +
            "        \"pic\": \"http://p1.music.126.net/78Nt_AEGTm7-Nk7EXTOiVg==/109951163678373297.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \" Feelings\",\n" +
            "        \"author\": \"Al Rocco,FADER ONE,RED8红八\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"01:46\",\n" +
            "        \"albumName\": \"Feelings\",\n" +
            "        \"pic\": \"http://p1.music.126.net/v9VA2G6kf0wfLvsp3oZjqQ==/109951163705944622.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"无解\",\n" +
            "        \"author\": \"赵天宇\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:36\",\n" +
            "        \"albumName\": \"局外人\",\n" +
            "        \"pic\": \"http://p1.music.126.net/a-gGkeTY64qoy4CxP-QSMQ==/109951163705377711.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"알러뷰\",\n" +
            "        \"author\": \"EXID\",\n" +
            "        \"date\": \"2018-11-21\",\n" +
            "        \"period\": \"03:14\",\n" +
            "        \"albumName\": \"알러뷰\",\n" +
            "        \"pic\": \"http://p1.music.126.net/bZmk3cIIn5ph2uG8DUkYmQ==/109951163670106010.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Dreamer (Nicky Romero Remix)\",\n" +
            "        \"author\": \"Martin Garrix,Mike Yung,Nicky Romero\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:44\",\n" +
            "        \"albumName\": \"Dreamer (Remixes Vol. 1)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/uYaPBfhCtIYE_6iL9-BCmw==/109951163710236249.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"All Into Nothing\",\n" +
            "        \"author\": \"R3hab,Mokita\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"02:41\",\n" +
            "        \"albumName\": \"All Into Nothing\",\n" +
            "        \"pic\": \"http://p1.music.126.net/wDRcv5jR3fFMUqxPSn-hvw==/109951163718728541.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"28\",\n" +
            "        \"author\": \"Jony J\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"03:41\",\n" +
            "        \"albumName\": \"喜新恋旧\",\n" +
            "        \"pic\": \"http://p1.music.126.net/78Nt_AEGTm7-Nk7EXTOiVg==/109951163678373297.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"路过人间 (演唱会Live限定版)\",\n" +
            "        \"author\": \"郁可唯\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:08\",\n" +
            "        \"albumName\": \"路过人间 (演唱会Live限定版)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/6V3wjS1JBcOyL4gCMB92bA==/109951163709719269.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"沐春风\",\n" +
            "        \"author\": \"谢安琪\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:23\",\n" +
            "        \"albumName\": \"沐春风\",\n" +
            "        \"pic\": \"http://p1.music.126.net/17n_nlxqIb5lOBYNu9AbDQ==/109951163707168700.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"风云喜\",\n" +
            "        \"author\": \"李常超 (Lao乾妈)\",\n" +
            "        \"date\": \"2018-11-26\",\n" +
            "        \"period\": \"04:16\",\n" +
            "        \"albumName\": \"风云喜\",\n" +
            "        \"pic\": \"http://p1.music.126.net/p9C2PNW7qRaxtFL9XTPmSw==/109951163689784965.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"what are you so afraid of\",\n" +
            "        \"author\": \"XXXTENTACION\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"02:30\",\n" +
            "        \"albumName\": \"SKINS\",\n" +
            "        \"pic\": \"http://p1.music.126.net/zn8_8YIoUvv9_1DGUUTTFw==/109951163663861040.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"天网\",\n" +
            "        \"author\": \"周柏豪\",\n" +
            "        \"date\": \"2018-12-10\",\n" +
            "        \"period\": \"02:56\",\n" +
            "        \"albumName\": \"All About Love 关于爱 Allt er ást\",\n" +
            "        \"pic\": \"http://p1.music.126.net/adjDrU7Lt5BwOWTboB1PzQ==/109951163718157761.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"原来\",\n" +
            "        \"author\": \"林东\",\n" +
            "        \"date\": \"2018-11-20\",\n" +
            "        \"period\": \"04:31\",\n" +
            "        \"albumName\": \"原来\",\n" +
            "        \"pic\": \"http://p1.music.126.net/MAeUoxXcsdwrPg363NIPdw==/109951163683765409.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Wait Another Day\",\n" +
            "        \"author\": \"Mike Williams,Mesto\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"02:59\",\n" +
            "        \"albumName\": \"Wait Another Day\",\n" +
            "        \"pic\": \"http://p1.music.126.net/x9NpRHnwwptyuvrn71w-0Q==/109951163706450286.jpg\"\n" +
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
            "        \"title\": \"Sexual Vibe\",\n" +
            "        \"author\": \"Stephen Puth\",\n" +
            "        \"date\": \"2018-12-07\",\n" +
            "        \"period\": \"03:30\",\n" +
            "        \"albumName\": \"Sexual Vibe\",\n" +
            "        \"pic\": \"http://p1.music.126.net/uvMVSMdj49oYW4txSU7JpQ==/109951163718444944.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \" 虚拟少年\",\n" +
            "        \"author\": \"徵羽摩柯\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:14\",\n" +
            "        \"albumName\": \"虚拟少年\",\n" +
            "        \"pic\": \"http://p1.music.126.net/p5ST8PvRHdOb4Mg2F5W36g==/109951163718140002.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"努力变成你爱的模样\",\n" +
            "        \"author\": \"苟瀚中\",\n" +
            "        \"date\": \"2018-11-15\",\n" +
            "        \"period\": \"03:58\",\n" +
            "        \"albumName\": \"努力变成你爱的模样\",\n" +
            "        \"pic\": \"http://p1.music.126.net/3TxF0IWTXT-h21m6Jkl5Xg==/109951163666820946.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Guardian angel\",\n" +
            "        \"author\": \"XXXTENTACION\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"01:48\",\n" +
            "        \"albumName\": \"SKINS\",\n" +
            "        \"pic\": \"http://p1.music.126.net/zn8_8YIoUvv9_1DGUUTTFw==/109951163663861040.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"西域公主\",\n" +
            "        \"author\": \"艾福杰尼\",\n" +
            "        \"date\": \"2018-12-05\",\n" +
            "        \"period\": \"03:33\",\n" +
            "        \"albumName\": \"楼兰\",\n" +
            "        \"pic\": \"http://p1.music.126.net/pTdy0AnxgSwTDK-lXeB3-g==/109951163678538781.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Good Years\",\n" +
            "        \"author\": \"ZAYN\",\n" +
            "        \"date\": \"2018-12-06\",\n" +
            "        \"period\": \"03:00\",\n" +
            "        \"albumName\": \"Good Years\",\n" +
            "        \"pic\": \"http://p1.music.126.net/vK9CKHghuAYTo1cVbTLMqw==/109951163707879287.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"The Winter Light (冬日告白) [试听版]\",\n" +
            "        \"author\": \"朱正廷\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"00:21\",\n" +
            "        \"albumName\": \"The Winter Light (冬日告白)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/HMu97SikhAT-LfiindfgEA==/109951163696748307.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Excuses\",\n" +
            "        \"author\": \"乐华七子NEXT\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:30\",\n" +
            "        \"albumName\": \"NEXT TO YOU\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nuQbaqdgyDi_fcZIB29ung==/109951163707352041.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Miracle\",\n" +
            "        \"author\": \"GOT7\",\n" +
            "        \"date\": \"2018-12-03\",\n" +
            "        \"period\": \"04:10\",\n" +
            "        \"albumName\": \"`Present : YOU` &ME Edition\",\n" +
            "        \"pic\": \"http://p1.music.126.net/YymYlw6uO-4L_HuY1acSTA==/109951163704162386.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"抱紧你\",\n" +
            "        \"author\": \"徐梦圆,嘿人李逵Noisemakers\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:47\",\n" +
            "        \"albumName\": \"抱紧你\",\n" +
            "        \"pic\": \"http://p1.music.126.net/N29i8g3nyaRwI6_8AZRqwQ==/109951163691775953.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"虚拟恋爱指南 (Future Lead Remix)\",\n" +
            "        \"author\": \"汪苏泷\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"02:57\",\n" +
            "        \"albumName\": \"虚拟恋爱指南 (Future Lead Remix)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/k7vF61ZygjEDdzJzt3CVRw==/109951163710183516.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"少年·北京\",\n" +
            "        \"author\": \"刘丰\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"02:01\",\n" +
            "        \"albumName\": \"国风美少年 第一期\",\n" +
            "        \"pic\": \"http://p1.music.126.net/pXQzqupQXDNHHVArWY0THA==/109951163697239564.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"嘿\",\n" +
            "        \"author\": \"张楚\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"04:22\",\n" +
            "        \"albumName\": \"嘿\",\n" +
            "        \"pic\": \"http://p1.music.126.net/q4TAOAxICgknspYHELJd5w==/109951163696898337.jpg\"\n" +
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
            "        \"title\": \"difference (interlude)\",\n" +
            "        \"author\": \"XXXTENTACION\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"01:17\",\n" +
            "        \"albumName\": \"SKINS\",\n" +
            "        \"pic\": \"http://p1.music.126.net/zn8_8YIoUvv9_1DGUUTTFw==/109951163663861040.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"fragile (prod. lentra)\",\n" +
            "        \"author\": \"bbno$,So Loki\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"03:15\",\n" +
            "        \"albumName\": \"fragile (prod. lentra)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/sicgCvjX3ggIPiiiu-tWbg==/109951163717861823.jpg\"\n" +
            "    }\n" +
            "]";
    public static List<JSONObject> newTopMusicData = null;
    static {
        newTopMusicData = JSON.parseObject(newTopMusicDataStr,List.class);
    }
}
