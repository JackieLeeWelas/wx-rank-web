package cn.jackielee.biz.ranklist.music.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by lxb on 2019/1/12.
 */
public class DouYinTopMusicData {
    public static final String douYinTopMusicDataStr = "[\n" +
            "    {\n" +
            "        \"title\": \"小星星\",\n" +
            "        \"author\": \"汪苏泷\",\n" +
            "        \"date\": \"2010-11-19\",\n" +
            "        \"period\": \"03:16\",\n" +
            "        \"albumName\": \"慢慢懂\",\n" +
            "        \"pic\": \"http://p2.music.126.net/k_WHGJoTvS6H7exsSnK1iA==/3304032446773006.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"沙漠骆驼\",\n" +
            "        \"author\": \"展展与罗罗\",\n" +
            "        \"date\": \"2017-06-19\",\n" +
            "        \"period\": \"05:38\",\n" +
            "        \"albumName\": \"沙漠骆驼\",\n" +
            "        \"pic\": \"http://p1.music.126.net/oov7j64hTKZSm0CEUkRNoQ==/109951163111639178.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"学猫叫\",\n" +
            "        \"author\": \"小潘潘,小峰峰\",\n" +
            "        \"date\": \"2018-04-20\",\n" +
            "        \"period\": \"03:29\",\n" +
            "        \"albumName\": \"学猫叫\",\n" +
            "        \"pic\": \"http://p1.music.126.net/D1Ov-XMAwUzsr16mQk95fA==/109951163256119128.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"灵魂伴侣\",\n" +
            "        \"author\": \"姜晗JHoenix,w小婉君\",\n" +
            "        \"date\": \"2018-11-23\",\n" +
            "        \"period\": \"04:46\",\n" +
            "        \"albumName\": \"灵魂伴侣\",\n" +
            "        \"pic\": \"http://p1.music.126.net/QtPu-rVPNSA-nVlRv0orJw==/109951163682071475.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"讲真的\",\n" +
            "        \"author\": \"曾惜\",\n" +
            "        \"date\": \"2015-03-12\",\n" +
            "        \"period\": \"03:58\",\n" +
            "        \"albumName\": \"不要你为难\",\n" +
            "        \"pic\": \"http://p1.music.126.net/cd9tDyVMq7zzYFbkr0gZcw==/2885118513459477.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"闺蜜\",\n" +
            "        \"author\": \"许嵩\",\n" +
            "        \"date\": \"2012-07-02\",\n" +
            "        \"period\": \"04:09\",\n" +
            "        \"albumName\": \"梦游计\",\n" +
            "        \"pic\": \"http://p1.music.126.net/6TNYBV2rezZLiwsGYBgmPw==/123145302311773.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"远走高飞\",\n" +
            "        \"author\": \"金志文\",\n" +
            "        \"date\": \"2017-04-24\",\n" +
            "        \"period\": \"04:01\",\n" +
            "        \"albumName\": \"Hello 1\",\n" +
            "        \"pic\": \"http://p1.music.126.net/elfqBKIdad0KYCCeKQpDSA==/18700493767108166.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你的前男友\",\n" +
            "        \"author\": \"Young 7\",\n" +
            "        \"date\": \"2018-09-17\",\n" +
            "        \"period\": \"02:56\",\n" +
            "        \"albumName\": \"你的前男友\",\n" +
            "        \"pic\": \"http://p1.music.126.net/-Zb4UsP9p9a8zYwRQjsT1Q==/109951163548175284.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"意大利海\",\n" +
            "        \"author\": \"爱星人\",\n" +
            "        \"date\": \"2018-10-16\",\n" +
            "        \"period\": \"03:07\",\n" +
            "        \"albumName\": \"意大利海\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5Lqx8RKxQbhvmJrkqUD2Cw==/109951163607289773.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"窗外的颜色\",\n" +
            "        \"author\": \"Gifty\",\n" +
            "        \"date\": \"2018-11-09\",\n" +
            "        \"period\": \"02:44\",\n" +
            "        \"albumName\": \"窗外的颜色\",\n" +
            "        \"pic\": \"http://p1.music.126.net/FW7YtSiO3wVLnzj7MmLkcg==/109951163653428465.jpg\"\n" +
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
            "        \"title\": \"可不可以给我你的微信\",\n" +
            "        \"author\": \"Milky,MOONBOI\",\n" +
            "        \"date\": \"2018-09-30\",\n" +
            "        \"period\": \"03:02\",\n" +
            "        \"albumName\": \"可不可以给我你的微信\",\n" +
            "        \"pic\": \"http://p1.music.126.net/vLV0KPjknc8TBeAkvV_Ldg==/109951163575422327.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"迷人小坏坏\",\n" +
            "        \"author\": \"Young 7\",\n" +
            "        \"date\": \"2018-10-16\",\n" +
            "        \"period\": \"03:15\",\n" +
            "        \"albumName\": \"迷人小坏坏\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5ozJ0TrUjz5yzIggy0x5ZA==/109951163618442032.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"FLY (加强版)\",\n" +
            "        \"author\": \"ANU\",\n" +
            "        \"date\": \"2018-10-19\",\n" +
            "        \"period\": \"04:25\",\n" +
            "        \"albumName\": \"FLY（加强版）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/tPQGOy53UUwT4pTlvkdWdA==/109951163610296075.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"The Fire\",\n" +
            "        \"author\": \"吉克隽逸\",\n" +
            "        \"date\": \"2018-10-31\",\n" +
            "        \"period\": \"03:36\",\n" +
            "        \"albumName\": \"The Fire\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_EF4t81h51SAavjuQCBT8Q==/109951163635335357.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"欧巴我不傻\",\n" +
            "        \"author\": \"夕西\",\n" +
            "        \"date\": \"2018-08-29\",\n" +
            "        \"period\": \"02:33\",\n" +
            "        \"albumName\": \"欧巴我不傻\",\n" +
            "        \"pic\": \"http://p1.music.126.net/j4XE0njwN3Y7ayriD0gjpg==/109951163518329660.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我们不一样\",\n" +
            "        \"author\": \"大壮\",\n" +
            "        \"date\": \"2017-06-06\",\n" +
            "        \"period\": \"04:30\",\n" +
            "        \"albumName\": \"我们不一样\",\n" +
            "        \"pic\": \"http://p1.music.126.net/e8rrwkOED4RbeaKuaVOcJA==/18997361904874206.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"养狗不养男朋友\",\n" +
            "        \"author\": \"夏瑶\",\n" +
            "        \"date\": \"2018-06-11\",\n" +
            "        \"period\": \"03:09\",\n" +
            "        \"albumName\": \"养狗不养男朋友\",\n" +
            "        \"pic\": \"http://p2.music.126.net/QfS9hANwRjnOTfQ99S9-vg==/109951163345544980.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"隔壁泰山\",\n" +
            "        \"author\": \"阿里郎\",\n" +
            "        \"date\": \"2018-07-02\",\n" +
            "        \"period\": \"03:19\",\n" +
            "        \"albumName\": \"隔壁泰山\",\n" +
            "        \"pic\": \"http://p1.music.126.net/pbT0ag5PXJwYzFJ7YklMCA==/109951163386629013.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"大碗吃肉大口想你\",\n" +
            "        \"author\": \"范世錡\",\n" +
            "        \"date\": \"2018-10-26\",\n" +
            "        \"period\": \"03:40\",\n" +
            "        \"albumName\": \"大碗吃肉大口想你\",\n" +
            "        \"pic\": \"http://p1.music.126.net/fJBhSTNtCRBgH3fzopErPQ==/109951163625871576.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"幸运女孩\",\n" +
            "        \"author\": \"Young 7\",\n" +
            "        \"date\": \"2018-11-08\",\n" +
            "        \"period\": \"03:19\",\n" +
            "        \"albumName\": \"幸运女孩\",\n" +
            "        \"pic\": \"http://p1.music.126.net/KXWH3M5IDLIy3v_js1USZQ==/109951163691339429.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"一点点\",\n" +
            "        \"author\": \"lilMoGo,唧唧JIJI\",\n" +
            "        \"date\": \"2018-10-25\",\n" +
            "        \"period\": \"03:57\",\n" +
            "        \"albumName\": \"一点点\",\n" +
            "        \"pic\": \"http://p1.music.126.net/XqJVFAhboPjR0Tg-KP5ymw==/109951163649702842.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小奶狗VS大狼狗\",\n" +
            "        \"author\": \"郑建鹏,YUJay\",\n" +
            "        \"date\": \"2018-07-09\",\n" +
            "        \"period\": \"03:07\",\n" +
            "        \"albumName\": \"小奶狗VS大狼狗\",\n" +
            "        \"pic\": \"http://p1.music.126.net/-cnBY-nQ4wFtEog8SuPQSw==/109951163393733651.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"好喜欢你\",\n" +
            "        \"author\": \"王广允\",\n" +
            "        \"date\": \"2018-10-25\",\n" +
            "        \"period\": \"03:31\",\n" +
            "        \"albumName\": \"好喜欢你\",\n" +
            "        \"pic\": \"http://p1.music.126.net/4sZTHb-mhwKCQBjvQiAxEQ==/109951163622684745.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"带你去海边\",\n" +
            "        \"author\": \"刘思达,h3R3,桑娜\",\n" +
            "        \"date\": \"2018-07-13\",\n" +
            "        \"period\": \"03:30\",\n" +
            "        \"albumName\": \"带你去海边\",\n" +
            "        \"pic\": \"http://p1.music.126.net/F7zj2uDTwsX-rtqg-uuynA==/109951163405623093.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"多肉少女\",\n" +
            "        \"author\": \"王韫\",\n" +
            "        \"date\": \"2018-09-05\",\n" +
            "        \"period\": \"03:25\",\n" +
            "        \"albumName\": \"多肉少女\",\n" +
            "        \"pic\": \"http://p1.music.126.net/2LRkxPvXb_4hVZ7y8fU4Cw==/109951163534720964.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"笑起来\",\n" +
            "        \"author\": \"卡小卡\",\n" +
            "        \"date\": \"2018-11-19\",\n" +
            "        \"period\": \"03:16\",\n" +
            "        \"albumName\": \"笑起来\",\n" +
            "        \"pic\": \"http://p1.music.126.net/oxhehP-0awSgA4kUmqUZcQ==/109951163665572444.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小任性\",\n" +
            "        \"author\": \"穆婧雅\",\n" +
            "        \"date\": \"2018-09-18\",\n" +
            "        \"period\": \"03:30\",\n" +
            "        \"albumName\": \"小任性\",\n" +
            "        \"pic\": \"http://p1.music.126.net/iMFYMax2E0VGS9k7xycTNg==/109951163556920412.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"没有理想何必远方\",\n" +
            "        \"author\": \"雨宗林\",\n" +
            "        \"date\": \"2018-10-03\",\n" +
            "        \"period\": \"04:41\",\n" +
            "        \"albumName\": \"没有理想何必远方\",\n" +
            "        \"pic\": \"http://p1.music.126.net/1IZd9GDJq3M1BmUBew89iw==/109951163593417575.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"跟我在一起\",\n" +
            "        \"author\": \"很美味\",\n" +
            "        \"date\": \"2018-09-27\",\n" +
            "        \"period\": \"03:09\",\n" +
            "        \"albumName\": \"跟我在一起\",\n" +
            "        \"pic\": \"http://p1.music.126.net/EQ3qr5Orir5ozDO24GTDGg==/109951163569056115.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"只为你着迷\",\n" +
            "        \"author\": \"李秉成\",\n" +
            "        \"date\": \"2018-10-25\",\n" +
            "        \"period\": \"04:00\",\n" +
            "        \"albumName\": \"只为你着迷\",\n" +
            "        \"pic\": \"http://p1.music.126.net/XhfsoTEY0oO_ClA5cNEvdg==/109951163626601279.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"快给我点个赞\",\n" +
            "        \"author\": \"跟风超人\",\n" +
            "        \"date\": \"2018-08-27\",\n" +
            "        \"period\": \"03:18\",\n" +
            "        \"albumName\": \"快给我点个赞\",\n" +
            "        \"pic\": \"http://p1.music.126.net/goLQrfT0HY7-3XFgwBwh-w==/109951163518055024.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"差一步\",\n" +
            "        \"author\": \"大壮\",\n" +
            "        \"date\": \"2017-11-13\",\n" +
            "        \"period\": \"04:05\",\n" +
            "        \"albumName\": \"差一步\",\n" +
            "        \"pic\": \"http://p1.music.126.net/b4MrcWDaX7MmdLlfoT-UcQ==/109951163061728442.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"买条街\",\n" +
            "        \"author\": \"$唐老师,Wya乌鸦\",\n" +
            "        \"date\": \"2018-09-05\",\n" +
            "        \"period\": \"03:05\",\n" +
            "        \"albumName\": \"买条街\",\n" +
            "        \"pic\": \"http://p1.music.126.net/uv2TrxMzJb5dJdV7eYdBZg==/109951163360056941.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"有时候\",\n" +
            "        \"author\": \"佟左左\",\n" +
            "        \"date\": \"2018-10-30\",\n" +
            "        \"period\": \"04:21\",\n" +
            "        \"albumName\": \"有时候\",\n" +
            "        \"pic\": \"http://p1.music.126.net/VUQeQFMdXF9AXwi0QmYUjw==/109951163636796429.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"思念你\",\n" +
            "        \"author\": \"虎二\",\n" +
            "        \"date\": \"2018-10-30\",\n" +
            "        \"period\": \"03:58\",\n" +
            "        \"albumName\": \"思念你\",\n" +
            "        \"pic\": \"http://p1.music.126.net/dmWDbSX5K1dBvVo9AIK5zg==/109951163635545937.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"流浪\",\n" +
            "        \"author\": \"卢焱\",\n" +
            "        \"date\": \"2017-07-19\",\n" +
            "        \"period\": \"03:20\",\n" +
            "        \"albumName\": \"流浪\",\n" +
            "        \"pic\": \"http://p1.music.126.net/baaLZ8t6Y_9kNB31z_2PgQ==/19196373509589905.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"最好的8090后\",\n" +
            "        \"author\": \"陈柯宇\",\n" +
            "        \"date\": \"2018-11-06\",\n" +
            "        \"period\": \"04:29\",\n" +
            "        \"albumName\": \"最好的8090后\",\n" +
            "        \"pic\": \"http://p1.music.126.net/EPdrCDN5cFjzIpRg9f7vqw==/109951163648005506.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"暖阳\",\n" +
            "        \"author\": \"南丁博格,耳朵亮\",\n" +
            "        \"date\": \"2018-05-30\",\n" +
            "        \"period\": \"05:22\",\n" +
            "        \"albumName\": \"暖阳\",\n" +
            "        \"pic\": \"http://p1.music.126.net/CDlYyMaCxgNiHAzw5oF-5w==/109951163324142898.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哥们带你搞事\",\n" +
            "        \"author\": \"姚飞\",\n" +
            "        \"date\": \"2018-11-03\",\n" +
            "        \"period\": \"02:26\",\n" +
            "        \"albumName\": \"哥们带你搞事\",\n" +
            "        \"pic\": \"http://p1.music.126.net/9ylD9iGwpnuP-lseS0iA0A==/109951163641149142.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"短发女孩\",\n" +
            "        \"author\": \"杨璐ylyanglu\",\n" +
            "        \"date\": \"2016-10-09\",\n" +
            "        \"period\": \"03:18\",\n" +
            "        \"albumName\": \"有关于爱的定义\",\n" +
            "        \"pic\": \"http://p1.music.126.net/hEY9-R6NfFU26TYMvBkQSA==/109951163287801258.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"爱情小丑\",\n" +
            "        \"author\": \"廖晶\",\n" +
            "        \"date\": \"2018-08-15\",\n" +
            "        \"period\": \"04:57\",\n" +
            "        \"albumName\": \"爱情小丑\",\n" +
            "        \"pic\": \"http://p1.music.126.net/mZYE8-P3mkEqInQjy_S1vw==/109951163464076032.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"侧脸\",\n" +
            "        \"author\": \"于果\",\n" +
            "        \"date\": \"2018-02-01\",\n" +
            "        \"period\": \"03:37\",\n" +
            "        \"albumName\": \"侧脸\",\n" +
            "        \"pic\": \"http://p1.music.126.net/FWR6RWtqhljoKR0QyRhQzQ==/109951163127272432.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"CHINA-2\",\n" +
            "        \"author\": \"Sand\",\n" +
            "        \"date\": \"2018-03-28\",\n" +
            "        \"period\": \"03:22\",\n" +
            "        \"albumName\": \"【EDM】CHINA（中国风电音）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/KNMEjxBPLOMFnVhDDHcfSA==/109951163211378484.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"就怕rapper说情话\",\n" +
            "        \"author\": \"前男友\",\n" +
            "        \"date\": \"2018-08-10\",\n" +
            "        \"period\": \"03:26\",\n" +
            "        \"albumName\": \"就怕rapper说情话\",\n" +
            "        \"pic\": \"http://p1.music.126.net/XwhY6UV1LwhRzwq-0ztEZw==/109951163450264617.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Hello Hello\",\n" +
            "        \"author\": \"丢火车\",\n" +
            "        \"date\": \"2018-07-04\",\n" +
            "        \"period\": \"03:40\",\n" +
            "        \"albumName\": \"浮生\",\n" +
            "        \"pic\": \"http://p1.music.126.net/dbCY004asYFiwO9-LhrOCw==/109951163049845879.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"i miss you\",\n" +
            "        \"author\": \"青春美少女,罗百吉\",\n" +
            "        \"date\": \"2017-05-23\",\n" +
            "        \"period\": \"04:05\",\n" +
            "        \"albumName\": \"国宝级组合青春美少女珍藏集\",\n" +
            "        \"pic\": \"http://p1.music.126.net/j2a6HL6hMKwamDQmIVgCwg==/109951162933404679.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"世界有你足矣\",\n" +
            "        \"author\": \"尹晨\",\n" +
            "        \"date\": \"2018-09-13\",\n" +
            "        \"period\": \"02:22\",\n" +
            "        \"albumName\": \"世界有你足矣\",\n" +
            "        \"pic\": \"http://p1.music.126.net/JLu4dHS34Hd0YHuJe3722g==/109951163546438974.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"她的周六夜\",\n" +
            "        \"author\": \"冰块先生\",\n" +
            "        \"date\": \"2017-09-21\",\n" +
            "        \"period\": \"03:46\",\n" +
            "        \"albumName\": \"她的周六夜\",\n" +
            "        \"pic\": \"http://p1.music.126.net/11FcqbqqZOkq7Aov0LU5yQ==/109951163028875051.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"不和你说话\",\n" +
            "        \"author\": \"斯斯與帆\",\n" +
            "        \"date\": \"2018-10-30\",\n" +
            "        \"period\": \"02:41\",\n" +
            "        \"albumName\": \"就知道你是这样的女孩\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Vj26Q6NSyYH94UFLqRnLQA==/109951163633348213.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"走路带风（Original Mix）\",\n" +
            "        \"author\": \"Sand\",\n" +
            "        \"date\": \"2018-06-06\",\n" +
            "        \"period\": \"03:20\",\n" +
            "        \"albumName\": \"【EDM】走路带风系列\",\n" +
            "        \"pic\": \"http://p1.music.126.net/gRD9qWpjBcoWCYlsXcsgfg==/109951163335718887.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"逆生长\",\n" +
            "        \"author\": \"林凯轩\",\n" +
            "        \"date\": \"2018-11-21\",\n" +
            "        \"period\": \"04:20\",\n" +
            "        \"albumName\": \"逆生长\",\n" +
            "        \"pic\": \"http://p1.music.126.net/dH-Lt5iXY6pmtb4k5uMcWQ==/109951163684927621.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"旧时光\",\n" +
            "        \"author\": \"陈叶玲\",\n" +
            "        \"date\": \"2018-07-13\",\n" +
            "        \"period\": \"03:29\",\n" +
            "        \"albumName\": \"旧时光Ⅰ\",\n" +
            "        \"pic\": \"http://p1.music.126.net/rodpzsHG7JMpMUBJp7Br4g==/109951163427763680.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"目不转睛\",\n" +
            "        \"author\": \"王以太\",\n" +
            "        \"date\": \"2018-03-18\",\n" +
            "        \"period\": \"02:42\",\n" +
            "        \"albumName\": \"Feel & Sight\",\n" +
            "        \"pic\": \"http://p1.music.126.net/3MaeDnsU61e96WlH5-hoaQ==/109951163195183343.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"像石头一样滚（demo）\",\n" +
            "        \"author\": \"松涛叔叔\",\n" +
            "        \"date\": \"2018-04-14\",\n" +
            "        \"period\": \"03:54\",\n" +
            "        \"albumName\": \"像石头一样滚\",\n" +
            "        \"pic\": \"http://p1.music.126.net/xEUW6MtWlqf7V_IDB5ef4A==/109951163247125965.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"就这样和你在一起\",\n" +
            "        \"author\": \"蝴蝶效应(B.E.)\",\n" +
            "        \"date\": \"2018-11-19\",\n" +
            "        \"period\": \"03:25\",\n" +
            "        \"albumName\": \"就这样和你在一起\",\n" +
            "        \"pic\": \"http://p1.music.126.net/RhUPEqRxL73R71i5un70uQ==/109951163676377030.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"可不可以\",\n" +
            "        \"author\": \"张紫豪\",\n" +
            "        \"date\": \"2018-08-31\",\n" +
            "        \"period\": \"04:00\",\n" +
            "        \"albumName\": \"可不可以\",\n" +
            "        \"pic\": \"http://p2.music.126.net/WafK2OQfEtqXitdDXJ772Q==/109951163252847249.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"东西\",\n" +
            "        \"author\": \"林俊呈\",\n" +
            "        \"date\": \"2018-09-21\",\n" +
            "        \"period\": \"02:42\",\n" +
            "        \"albumName\": \"东西\",\n" +
            "        \"pic\": \"http://p1.music.126.net/lImkmFfPTf6sfmNeXc3MqQ==/109951163559198470.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"想象\",\n" +
            "        \"author\": \"摩登兄弟\",\n" +
            "        \"date\": \"2018-09-18\",\n" +
            "        \"period\": \"04:33\",\n" +
            "        \"albumName\": \"想象\",\n" +
            "        \"pic\": \"http://p1.music.126.net/JrKpVtluwXjoe2mXr8rNFw==/109951163555148668.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"负极Still\",\n" +
            "        \"author\": \"黄贤哲Keyz\",\n" +
            "        \"date\": \"2018-06-06\",\n" +
            "        \"period\": \"03:49\",\n" +
            "        \"albumName\": \"负极Still\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5ebbdQJEyNrDwNDXPLNAig==/109951163337894046.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"萌\",\n" +
            "        \"author\": \"妙静鸥\",\n" +
            "        \"date\": \"2018-09-25\",\n" +
            "        \"period\": \"03:41\",\n" +
            "        \"albumName\": \"萌\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nel-AXnYwBHt0yFPLzJIHg==/109951163568422292.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"梦回长安\",\n" +
            "        \"author\": \"宋扬\",\n" +
            "        \"date\": \"2015-11-06\",\n" +
            "        \"period\": \"03:34\",\n" +
            "        \"albumName\": \"你还好吗\",\n" +
            "        \"pic\": \"http://p1.music.126.net/4QeHZUCh1oWwVI1EtN7pkQ==/109951163055134180.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"晚安我的故乡\",\n" +
            "        \"author\": \"潘悦晨\",\n" +
            "        \"date\": \"2018-11-23\",\n" +
            "        \"period\": \"04:38\",\n" +
            "        \"albumName\": \"晚安我的故乡\",\n" +
            "        \"pic\": \"http://p1.music.126.net/j9kpUto3ntBdiQvBZhUJmw==/109951163689322426.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"想想想想\",\n" +
            "        \"author\": \"刘晓晨\",\n" +
            "        \"date\": \"2018-10-26\",\n" +
            "        \"period\": \"03:23\",\n" +
            "        \"albumName\": \"想想想想\",\n" +
            "        \"pic\": \"http://p1.music.126.net/CCXAcv9fqQEWF5_HaRdThQ==/109951163620200537.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你个小坏坏\",\n" +
            "        \"author\": \"跟风超人\",\n" +
            "        \"date\": \"2018-09-21\",\n" +
            "        \"period\": \"03:09\",\n" +
            "        \"albumName\": \"你个小坏坏\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_wOSd4IMTZpD8lzObxhBMQ==/109951163558070006.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"多爱一天\",\n" +
            "        \"author\": \"萱萱\",\n" +
            "        \"date\": \"2018-10-12\",\n" +
            "        \"period\": \"03:52\",\n" +
            "        \"albumName\": \"空洞\",\n" +
            "        \"pic\": \"http://p1.music.126.net/rr7b5m8cOKAOUEh67cxitQ==/109951163624480039.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"陪我去蹦迪\",\n" +
            "        \"author\": \"方丈MasonD,Dry.T\",\n" +
            "        \"date\": \"2018-04-23\",\n" +
            "        \"period\": \"03:28\",\n" +
            "        \"albumName\": \"陪你去蹦迪\",\n" +
            "        \"pic\": \"http://p1.music.126.net/xnlRz8y2WGahZ_IcGTFIag==/109951163263102973.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"天气还不错\",\n" +
            "        \"author\": \"新马甲乐队\",\n" +
            "        \"date\": \"2018-07-23\",\n" +
            "        \"period\": \"03:38\",\n" +
            "        \"albumName\": \"阴山以南黄河以北\",\n" +
            "        \"pic\": \"http://p1.music.126.net/P9ZQBdYgHa_s84vgGF5G7A==/109951163421823788.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Horizon\",\n" +
            "        \"author\": \"Janji\",\n" +
            "        \"date\": \"2014-11-24\",\n" +
            "        \"period\": \"03:17\",\n" +
            "        \"albumName\": \"Horizon\",\n" +
            "        \"pic\": \"http://p1.music.126.net/8pko-MebyO_1XlXms0rF9g==/109951163456840298.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"好想你陪我\",\n" +
            "        \"author\": \"开开（赵锴羿）\",\n" +
            "        \"date\": \"2018-10-08\",\n" +
            "        \"period\": \"04:09\",\n" +
            "        \"albumName\": \"好想你陪我\",\n" +
            "        \"pic\": \"http://p1.music.126.net/BUQZPzVmhOYu9gsdHIkqHQ==/109951163593217211.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"梦乡佛境\",\n" +
            "        \"author\": \"龙迦娜\",\n" +
            "        \"date\": \"2018-09-28\",\n" +
            "        \"period\": \"04:20\",\n" +
            "        \"albumName\": \"梦乡佛境\",\n" +
            "        \"pic\": \"http://p1.music.126.net/yRWeCLbC0rWy0Hgoq2GSKA==/109951163573530845.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"红颜笑\",\n" +
            "        \"author\": \"石头\",\n" +
            "        \"date\": \"2015-02-05\",\n" +
            "        \"period\": \"04:42\",\n" +
            "        \"albumName\": \"念\",\n" +
            "        \"pic\": \"http://p1.music.126.net/AjfRV3jS_2wOcgxo3oWb8A==/7885697394624325.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Butterfly\",\n" +
            "        \"author\": \"SKiz0\",\n" +
            "        \"date\": \"2018-06-01\",\n" +
            "        \"period\": \"02:48\",\n" +
            "        \"albumName\": \"Butterfly\",\n" +
            "        \"pic\": \"http://p1.music.126.net/JesIkYfV8CGcPJpesytg3w==/109951163325595539.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"一个人的北京\",\n" +
            "        \"author\": \"山野\",\n" +
            "        \"date\": \"2012-07-23\",\n" +
            "        \"period\": \"04:04\",\n" +
            "        \"albumName\": \"一个人的北京\",\n" +
            "        \"pic\": \"http://p1.music.126.net/BhgmWlHnWnBFy6Y4lOfyLA==/122045790688855.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我家住在桃花山\",\n" +
            "        \"author\": \"尤沫Dina\",\n" +
            "        \"date\": \"2018-08-15\",\n" +
            "        \"period\": \"03:32\",\n" +
            "        \"albumName\": \"我家住在桃花山\",\n" +
            "        \"pic\": \"http://p1.music.126.net/aUL1aw3sAazOF2IPktfQ1w==/109951163458516067.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"今儿别想放假\",\n" +
            "        \"author\": \"Artascope万花筒\",\n" +
            "        \"date\": \"2018-02-07\",\n" +
            "        \"period\": \"04:29\",\n" +
            "        \"albumName\": \"Tbang2017•皂\",\n" +
            "        \"pic\": \"http://p1.music.126.net/WWj4ySxUFpGWJu0UmuSNCA==/109951163135158730.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"唱首情歌给你\",\n" +
            "        \"author\": \"董嘉鸿\",\n" +
            "        \"date\": \"2018-09-17\",\n" +
            "        \"period\": \"03:02\",\n" +
            "        \"albumName\": \"唱首情歌给你\",\n" +
            "        \"pic\": \"http://p1.music.126.net/9qxB5rRYV6WiayUuBnNhMw==/109951163549323017.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"初恋的小美好\",\n" +
            "        \"author\": \"Sunny是个小太阳\",\n" +
            "        \"date\": \"2018-01-12\",\n" +
            "        \"period\": \"04:04\",\n" +
            "        \"albumName\": \"初恋的小美好\",\n" +
            "        \"pic\": \"http://p1.music.126.net/7DvTdaOADAw7KiKVkcMcag==/109951163105691071.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"不想去上班\",\n" +
            "        \"author\": \"王胜男\",\n" +
            "        \"date\": \"2012-01-31\",\n" +
            "        \"period\": \"03:04\",\n" +
            "        \"albumName\": \"不想去上班\",\n" +
            "        \"pic\": \"http://p2.music.126.net/5NYSykytSKB0h5fn5iyOGA==/91259465122660.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"独行侠\",\n" +
            "        \"author\": \"YKEY,Namunong\",\n" +
            "        \"date\": \"2017-02-28\",\n" +
            "        \"period\": \"03:56\",\n" +
            "        \"albumName\": \"独行侠\",\n" +
            "        \"pic\": \"http://p1.music.126.net/8mnn6YiQldsRIHe_nER8wg==/109951162894925733.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"买个包包 (Live版)\",\n" +
            "        \"author\": \"布瑞吉Bridge\",\n" +
            "        \"date\": \"2018-02-03\",\n" +
            "        \"period\": \"03:11\",\n" +
            "        \"albumName\": \"Stage舞台 第1季\",\n" +
            "        \"pic\": \"http://p1.music.126.net/qdA0i_BwZDIsLQNjypfVPw==/109951163090171973.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"脑瓜疼\",\n" +
            "        \"author\": \"嘿人李逵Noisemakers,AirJordy,Donny\",\n" +
            "        \"date\": \"2018-08-29\",\n" +
            "        \"period\": \"03:42\",\n" +
            "        \"albumName\": \"脑瓜疼\",\n" +
            "        \"pic\": \"http://p1.music.126.net/wV1Z-Lf_yXKd9-7znuVR9A==/109951163521834430.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"什么都想吃\",\n" +
            "        \"author\": \"小尾巴\",\n" +
            "        \"date\": \"2018-01-04\",\n" +
            "        \"period\": \"03:23\",\n" +
            "        \"albumName\": \"小尾巴 / Tiest\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Csg1n1CZduQuTSDbhVhM9A==/109951163116382647.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小圈套\",\n" +
            "        \"author\": \"魏小也\",\n" +
            "        \"date\": \"2018-09-22\",\n" +
            "        \"period\": \"03:55\",\n" +
            "        \"albumName\": \"小圈套\",\n" +
            "        \"pic\": \"http://p1.music.126.net/l2KN5tTXkHObb-bQheiEZA==/109951163561003454.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"多爱算爱\",\n" +
            "        \"author\": \"猫咪呀\",\n" +
            "        \"date\": \"2018-09-29\",\n" +
            "        \"period\": \"03:55\",\n" +
            "        \"albumName\": \"多爱算爱\",\n" +
            "        \"pic\": \"http://p1.music.126.net/4R4G53yva-6zCCkUWm7yaA==/109951163573137528.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"鸽子\",\n" +
            "        \"author\": \"徐秉龙\",\n" +
            "        \"date\": \"2017-02-24\",\n" +
            "        \"period\": \"02:18\",\n" +
            "        \"albumName\": \"鸽子\",\n" +
            "        \"pic\": \"http://p1.music.126.net/2bmVAQM9-KBMg9QOkWcXKQ==/109951162865916994.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"一见倾心\",\n" +
            "        \"author\": \"欧俊诚\",\n" +
            "        \"date\": \"2018-06-20\",\n" +
            "        \"period\": \"04:03\",\n" +
            "        \"albumName\": \"一见倾心\",\n" +
            "        \"pic\": \"http://p1.music.126.net/e2MfnMIgBEENAadnJztu3w==/109951163365561334.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Falling\",\n" +
            "        \"author\": \"汪昱名\",\n" +
            "        \"date\": \"2017-11-12\",\n" +
            "        \"period\": \"04:24\",\n" +
            "        \"albumName\": \"Falling\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nw4Jvn7OG1PgTfPiwnZ0lw==/109951163061085401.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"偏偏\",\n" +
            "        \"author\": \"魏枫\",\n" +
            "        \"date\": \"2018-08-27\",\n" +
            "        \"period\": \"03:14\",\n" +
            "        \"albumName\": \"偏偏\",\n" +
            "        \"pic\": \"http://p1.music.126.net/VJrQbBycwDoXc22TpDxW3w==/109951163471236065.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你打不过我吧\",\n" +
            "        \"author\": \"跟风超人\",\n" +
            "        \"date\": \"2018-04-25\",\n" +
            "        \"period\": \"02:38\",\n" +
            "        \"albumName\": \"你打不过我吧\",\n" +
            "        \"pic\": \"http://p1.music.126.net/79qXTc6gUQKMaTmefpIukQ==/109951163263421992.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"没那么坚强\",\n" +
            "        \"author\": \"阿泱\",\n" +
            "        \"date\": \"2018-09-05\",\n" +
            "        \"period\": \"03:26\",\n" +
            "        \"albumName\": \"没那么坚强\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5rB6HyKqxveyEiiyudDYvQ==/109951163537678221.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"那个女孩\",\n" +
            "        \"author\": \"蒋雪璇\",\n" +
            "        \"date\": \"2018-06-21\",\n" +
            "        \"period\": \"03:12\",\n" +
            "        \"albumName\": \"那个女孩\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Qfc4Cr1mGf8PRar-_lzZog==/109951163601005603.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"撒浪嘿哟 (撒浪嘿呦)\",\n" +
            "        \"author\": \"潘柯夫,吴缤欣\",\n" +
            "        \"date\": \"2018-06-21\",\n" +
            "        \"period\": \"02:46\",\n" +
            "        \"albumName\": \"撒浪嘿哟\",\n" +
            "        \"pic\": \"http://p1.music.126.net/qj8ra-RgF1IR88RkyC4nzA==/109951163377119807.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Baby嫁给我吧\",\n" +
            "        \"author\": \"李佳丹小K\",\n" +
            "        \"date\": \"2018-09-29\",\n" +
            "        \"period\": \"03:45\",\n" +
            "        \"albumName\": \"Baby嫁给我吧\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Sje5Agl-EuDKfNWd5ypY9A==/109951163569860700.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"多喝水\",\n" +
            "        \"author\": \"常石磊\",\n" +
            "        \"date\": \"2018-08-20\",\n" +
            "        \"period\": \"04:55\",\n" +
            "        \"albumName\": \"多喝水\",\n" +
            "        \"pic\": \"http://p1.music.126.net/YOkr3Wt6qCs31rjMM_1_AA==/109951163469380106.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Hello小鲜肉\",\n" +
            "        \"author\": \"赵芷彤\",\n" +
            "        \"date\": \"2018-08-24\",\n" +
            "        \"period\": \"03:07\",\n" +
            "        \"albumName\": \"Hello小鲜肉\",\n" +
            "        \"pic\": \"http://p1.music.126.net/sFijYNiv20oc6lMePjBuKw==/109951163508874533.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"人海\",\n" +
            "        \"author\": \"刘明辉\",\n" +
            "        \"date\": \"2018-09-27\",\n" +
            "        \"period\": \"05:03\",\n" +
            "        \"albumName\": \"人海\",\n" +
            "        \"pic\": \"http://p1.music.126.net/I0ZtoU433NJzZJ1xriYiEg==/109951163570326075.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"恍如昨天\",\n" +
            "        \"author\": \"季彦霖\",\n" +
            "        \"date\": \"2018-05-26\",\n" +
            "        \"period\": \"04:12\",\n" +
            "        \"albumName\": \"恍如昨天\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Ij_q_-zEtxj76POsdb_0Gg==/109951163327052670.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"风景\",\n" +
            "        \"author\": \"丢火车\",\n" +
            "        \"date\": \"2018-01-26\",\n" +
            "        \"period\": \"04:08\",\n" +
            "        \"albumName\": \"我站在桥上看风景 电视剧OST原声专辑\",\n" +
            "        \"pic\": \"http://p1.music.126.net/MaknemchaQ5un3s-CwdhPg==/109951163128772499.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"莎啦啦\",\n" +
            "        \"author\": \"蒋雪璇\",\n" +
            "        \"date\": \"2018-02-12\",\n" +
            "        \"period\": \"03:36\",\n" +
            "        \"albumName\": \"莎啦啦\",\n" +
            "        \"pic\": \"http://p1.music.126.net/t633x_KG8Zcd6SNf7xZdYA==/109951163142569560.jpg\"\n" +
            "    }\n" +
            "]";
    public static List<JSONObject> douYinTopMusicData = null;
    static {
        douYinTopMusicData = JSON.parseObject(douYinTopMusicDataStr,List.class);
    }
}
