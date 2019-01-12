package cn.jackielee.biz.ranklist.music.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by lxb on 2019/1/12.
 */
public class HotTopMusicData {
    public static final String hotTopMusicDataStr = "[\n" +
            "    {\n" +
            "        \"title\": \"起风了\",\n" +
            "        \"author\": \"买辣椒也用券\",\n" +
            "        \"date\": \"1970-01-01\",\n" +
            "        \"period\": \"05:25\",\n" +
            "        \"albumName\": \"起风了\",\n" +
            "        \"pic\": \"http://p1.music.126.net/diGAyEmpymX8G7JcnElncQ==/109951163699673355.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"盗将行\",\n" +
            "        \"author\": \"花粥,马雨阳\",\n" +
            "        \"date\": \"2018-06-19\",\n" +
            "        \"period\": \"03:18\",\n" +
            "        \"albumName\": \"粥请客（二）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/-qHPT3rhxDlu5zQV9NcQ-A==/109951163555860423.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"可不可以\",\n" +
            "        \"author\": \"张紫豪\",\n" +
            "        \"date\": \"2018-08-31\",\n" +
            "        \"period\": \"04:00\",\n" +
            "        \"albumName\": \"可不可以\",\n" +
            "        \"pic\": \"http://p1.music.126.net/WafK2OQfEtqXitdDXJ772Q==/109951163252847249.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"水星记\",\n" +
            "        \"author\": \"郭顶\",\n" +
            "        \"date\": \"2016-11-25\",\n" +
            "        \"period\": \"05:25\",\n" +
            "        \"albumName\": \"飞行器的执行周期\",\n" +
            "        \"pic\": \"http://p1.music.126.net/wSMfGvFzOAYRU_yVIfquAA==/2946691248081599.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"写给黄淮\",\n" +
            "        \"author\": \"解忧邵帅\",\n" +
            "        \"date\": \"2018-08-31\",\n" +
            "        \"period\": \"03:48\",\n" +
            "        \"albumName\": \"我在黄淮\",\n" +
            "        \"pic\": \"http://p1.music.126.net/PNNpIr9mQY98jS9H9PV9eA==/109951163525904130.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"光年之外\",\n" +
            "        \"author\": \"G.E.M.邓紫棋\",\n" +
            "        \"date\": \"2016-12-30\",\n" +
            "        \"period\": \"03:55\",\n" +
            "        \"albumName\": \"光年之外\",\n" +
            "        \"pic\": \"http://p2.music.126.net/fkqFqMaEt0CzxYS-0NpCog==/18587244069235039.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"年少有为\",\n" +
            "        \"author\": \"李荣浩\",\n" +
            "        \"date\": \"2018-10-17\",\n" +
            "        \"period\": \"04:39\",\n" +
            "        \"albumName\": \"耳朵\",\n" +
            "        \"pic\": \"http://p1.music.126.net/tt8xwK-ASC2iqXNUXYKoDQ==/109951163606377163.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"东西\",\n" +
            "        \"author\": \"林俊呈\",\n" +
            "        \"date\": \"2018-09-21\",\n" +
            "        \"period\": \"02:42\",\n" +
            "        \"albumName\": \"东西\",\n" +
            "        \"pic\": \"http://p2.music.126.net/lImkmFfPTf6sfmNeXc3MqQ==/109951163559198470.jpg\"\n" +
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
            "        \"title\": \"往后余生\",\n" +
            "        \"author\": \"王贰浪\",\n" +
            "        \"date\": \"2018-06-08\",\n" +
            "        \"period\": \"03:51\",\n" +
            "        \"albumName\": \"往后余生\",\n" +
            "        \"pic\": \"http://p2.music.126.net/hTiVEeQTUSsc-YGF3o6ItQ==/109951163337847600.jpg\"\n" +
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
            "        \"title\": \"Way Back Home\",\n" +
            "        \"author\": \"SHAUN\",\n" +
            "        \"date\": \"2018-06-27\",\n" +
            "        \"period\": \"03:34\",\n" +
            "        \"albumName\": \"Take\",\n" +
            "        \"pic\": \"http://p1.music.126.net/MAkLvm2p9LE0mWLEr2NkMA==/109951163378634466.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"拿走了什么\",\n" +
            "        \"author\": \"A-Lin\",\n" +
            "        \"date\": \"2014-12-30\",\n" +
            "        \"period\": \"04:56\",\n" +
            "        \"albumName\": \"罪恶感\",\n" +
            "        \"pic\": \"http://p2.music.126.net/JXwIzOzQOat5l_VCUiiemA==/6670737047155555.jpg\"\n" +
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
            "        \"title\": \"说谎\",\n" +
            "        \"author\": \"林宥嘉\",\n" +
            "        \"date\": \"2009-10-30\",\n" +
            "        \"period\": \"04:24\",\n" +
            "        \"albumName\": \"感官/世界\",\n" +
            "        \"pic\": \"http://p1.music.126.net/mMZNB-jhYsw29K61QtopJA==/109951163187404137.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"不染\",\n" +
            "        \"author\": \"毛不易\",\n" +
            "        \"date\": \"2018-08-13\",\n" +
            "        \"period\": \"05:25\",\n" +
            "        \"albumName\": \"香蜜沉沉烬如霜 电视原声音乐专辑\",\n" +
            "        \"pic\": \"http://p2.music.126.net/gEia-o05FSas8uJos54Sug==/109951163456726954.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"静悄悄\",\n" +
            "        \"author\": \"大泫\",\n" +
            "        \"date\": \"2018-04-19\",\n" +
            "        \"period\": \"03:05\",\n" +
            "        \"albumName\": \"静悄悄\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_AFGOj5fv7CzCgrUadWztQ==/109951163254735616.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"去年夏天\",\n" +
            "        \"author\": \"王大毛\",\n" +
            "        \"date\": \"2018-05-09\",\n" +
            "        \"period\": \"04:05\",\n" +
            "        \"albumName\": \"去年夏天\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5M7Qvv32HaFmMrLN8uehuA==/109951163293243877.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"可能否\",\n" +
            "        \"author\": \"木小雅\",\n" +
            "        \"date\": \"2018-05-30\",\n" +
            "        \"period\": \"03:47\",\n" +
            "        \"albumName\": \"可能否\",\n" +
            "        \"pic\": \"http://p1.music.126.net/SJYnDay7wgewU3O7tPfmOQ==/109951163322541581.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"醒着醉\",\n" +
            "        \"author\": \"马良\",\n" +
            "        \"date\": \"2018-06-06\",\n" +
            "        \"period\": \"03:48\",\n" +
            "        \"albumName\": \"醒着醉\",\n" +
            "        \"pic\": \"http://p1.music.126.net/g-tbzhZCU2opvigyB2g_Qg==/109951163334448121.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"感谢你曾来过\",\n" +
            "        \"author\": \"Ayo97,是阿涵阿\",\n" +
            "        \"date\": \"2017-02-12\",\n" +
            "        \"period\": \"03:56\",\n" +
            "        \"albumName\": \"卧龙与酒\",\n" +
            "        \"pic\": \"http://p2.music.126.net/iL36G-e6rm2zwCUmlL4pOw==/109951162859100521.jpg\"\n" +
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
            "        \"title\": \"出山\",\n" +
            "        \"author\": \"花粥,王胜男\",\n" +
            "        \"date\": \"2018-09-28\",\n" +
            "        \"period\": \"03:20\",\n" +
            "        \"albumName\": \"粥请客（王胜男）\",\n" +
            "        \"pic\": \"http://p2.music.126.net/xUAfdMHdXhu3BmO4g8nOYA==/109951163573311341.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"云烟成雨\",\n" +
            "        \"author\": \"房东的猫\",\n" +
            "        \"date\": \"2017-10-19\",\n" +
            "        \"period\": \"04:00\",\n" +
            "        \"albumName\": \"云烟成雨\",\n" +
            "        \"pic\": \"http://p1.music.126.net/DSTg1dR7yKsyGq4IK3NL8A==/109951163046050093.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"说爱你\",\n" +
            "        \"author\": \"蔡依林\",\n" +
            "        \"date\": \"2003-03-07\",\n" +
            "        \"period\": \"03:46\",\n" +
            "        \"albumName\": \"看我72变\",\n" +
            "        \"pic\": \"http://p2.music.126.net/lsMlFshdJ96aTGFFgayh4Q==/109951163611523278.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"陷阱\",\n" +
            "        \"author\": \"王北车\",\n" +
            "        \"date\": \"2018-07-19\",\n" +
            "        \"period\": \"04:40\",\n" +
            "        \"albumName\": \"陷阱\",\n" +
            "        \"pic\": \"http://p2.music.126.net/1hyPx7SxIQH8nnsIhcgmfQ==/109951163415300959.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"不在\",\n" +
            "        \"author\": \"韩安旭\",\n" +
            "        \"date\": \"2016-09-01\",\n" +
            "        \"period\": \"04:16\",\n" +
            "        \"albumName\": \"不在\",\n" +
            "        \"pic\": \"http://p1.music.126.net/duY_T9VXfpnEcsuoQDFPmw==/109951163169037953.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"POP/STARS\",\n" +
            "        \"author\": \"Madison Beer,(G)I-DLE,Jaira Burns\",\n" +
            "        \"date\": \"2018-11-03\",\n" +
            "        \"period\": \"03:11\",\n" +
            "        \"albumName\": \"POP/STARS\",\n" +
            "        \"pic\": \"http://p2.music.126.net/nLnWleHmcX-XKybSZum11Q==/109951163647619940.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"寂寞烟火\",\n" +
            "        \"author\": \"朱婧汐JING\",\n" +
            "        \"date\": \"2014-09-11\",\n" +
            "        \"period\": \"04:33\",\n" +
            "        \"albumName\": \"以梦为马\",\n" +
            "        \"pic\": \"http://p1.music.126.net/lDlFdy62rPxCM9kSnymGQA==/6645448278712402.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我的秘密\",\n" +
            "        \"author\": \"G.E.M.邓紫棋\",\n" +
            "        \"date\": \"2011-02-11\",\n" +
            "        \"period\": \"04:10\",\n" +
            "        \"albumName\": \"A.I.N.Y. 爱你\",\n" +
            "        \"pic\": \"http://p1.music.126.net/maj6C_L03m59WopCkMEzJw==/45079976754675.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"岁月神偷\",\n" +
            "        \"author\": \"金玟岐\",\n" +
            "        \"date\": \"2014-03-03\",\n" +
            "        \"period\": \"02:42\",\n" +
            "        \"albumName\": \"金玟岐作品集\",\n" +
            "        \"pic\": \"http://p2.music.126.net/54wdQi_3rpjreY2oo2jb7w==/5998935441219557.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"一百万个可能\",\n" +
            "        \"author\": \"Christine Welch\",\n" +
            "        \"date\": \"2014-11-07\",\n" +
            "        \"period\": \"04:35\",\n" +
            "        \"albumName\": \"一百万个可能\",\n" +
            "        \"pic\": \"http://p2.music.126.net/SSGt30LAVJwW31-qreZDFA==/2532175280446455.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Lemon\",\n" +
            "        \"author\": \"米津玄師\",\n" +
            "        \"date\": \"2018-03-14\",\n" +
            "        \"period\": \"04:15\",\n" +
            "        \"albumName\": \"Lemon\",\n" +
            "        \"pic\": \"http://p1.music.126.net/6IeZ9MiSSDXifj74nzH6ww==/109951163561494000.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Move Your Body (Alan Walker Remix)\",\n" +
            "        \"author\": \"Sia,Alan Walker\",\n" +
            "        \"date\": \"2016-10-21\",\n" +
            "        \"period\": \"03:37\",\n" +
            "        \"albumName\": \"This Is Acting (Deluxe Version)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/9h_TA43qbHLTKwQrQzhLgQ==/18162832579997237.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"That Girl\",\n" +
            "        \"author\": \"Olly Murs\",\n" +
            "        \"date\": \"2016-11-11\",\n" +
            "        \"period\": \"02:56\",\n" +
            "        \"albumName\": \"24 HRS (Deluxe)\",\n" +
            "        \"pic\": \"http://p2.music.126.net/_dPhSlbDz23MjXUEYeBGRw==/18820340533734696.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"可乐\",\n" +
            "        \"author\": \"赵紫骅\",\n" +
            "        \"date\": \"2014-05-05\",\n" +
            "        \"period\": \"05:45\",\n" +
            "        \"albumName\": \"赵浴辰原创demo精选\",\n" +
            "        \"pic\": \"http://p1.music.126.net/qOfVT6izV4mBe4IyQn489Q==/18190320370401891.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Take me hand\",\n" +
            "        \"author\": \"DAISHI DANCE,Cecile Corbel\",\n" +
            "        \"date\": \"2012-11-14\",\n" +
            "        \"period\": \"04:19\",\n" +
            "        \"albumName\": \"WONDER Tourism\",\n" +
            "        \"pic\": \"http://p2.music.126.net/AoVFMKkLVMOmTMo_A6x02g==/109951163403515653.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"烟火里的尘埃\",\n" +
            "        \"author\": \"华晨宇\",\n" +
            "        \"date\": \"2014-08-26\",\n" +
            "        \"period\": \"05:21\",\n" +
            "        \"albumName\": \"烟火里的尘埃\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_49Xz_x9kTTdEgmYYk6w2w==/6672936069046297.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"红色高跟鞋\",\n" +
            "        \"author\": \"蔡健雅\",\n" +
            "        \"date\": \"2009-08-19\",\n" +
            "        \"period\": \"03:26\",\n" +
            "        \"albumName\": \"若你碰到他\",\n" +
            "        \"pic\": \"http://p2.music.126.net/2toWuH2oD6c0dM6QLdThzg==/109951163165824418.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"月牙湾\",\n" +
            "        \"author\": \"F.I.R.\",\n" +
            "        \"date\": \"2007-09-28\",\n" +
            "        \"period\": \"05:08\",\n" +
            "        \"albumName\": \"爱.歌姬\",\n" +
            "        \"pic\": \"http://p2.music.126.net/AWSY9vFG4viq-IeC3wTWDg==/109951163169023077.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Something Just Like This\",\n" +
            "        \"author\": \"The Chainsmokers,Coldplay\",\n" +
            "        \"date\": \"2017-02-25\",\n" +
            "        \"period\": \"04:07\",\n" +
            "        \"albumName\": \"Something Just Like This\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ggnyubDdMxrhpqYvpZbhEQ==/3302932937412681.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你就不要想起我\",\n" +
            "        \"author\": \"田馥甄\",\n" +
            "        \"date\": \"2013-11-14\",\n" +
            "        \"period\": \"04:40\",\n" +
            "        \"albumName\": \"渺小\",\n" +
            "        \"pic\": \"http://p2.music.126.net/aPnwHIJECLpQCoSV-qm_qA==/109951163571315498.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"飞云之下\",\n" +
            "        \"author\": \"韩红,林俊杰\",\n" +
            "        \"date\": \"2018-04-23\",\n" +
            "        \"period\": \"04:26\",\n" +
            "        \"albumName\": \"飞云之下\",\n" +
            "        \"pic\": \"http://p1.music.126.net/YsQrEZ_M6kduwN2zh6Q6kg==/109951163311406661.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"假装\",\n" +
            "        \"author\": \"陈雪凝\",\n" +
            "        \"date\": \"2017-09-09\",\n" +
            "        \"period\": \"04:24\",\n" +
            "        \"albumName\": \"拾陆\",\n" +
            "        \"pic\": \"http://p1.music.126.net/LLI28TeCfNBo6DK1Ct1k4Q==/109951163249809425.jpg\"\n" +
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
            "        \"title\": \"像我这样的人\",\n" +
            "        \"author\": \"毛不易\",\n" +
            "        \"date\": \"2018-07-03\",\n" +
            "        \"period\": \"03:27\",\n" +
            "        \"albumName\": \"平凡的一天\",\n" +
            "        \"pic\": \"http://p1.music.126.net/vmCcDvD1H04e9gm97xsCqg==/109951163350929740.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"慢慢喜欢你\",\n" +
            "        \"author\": \"莫文蔚\",\n" +
            "        \"date\": \"2018-06-07\",\n" +
            "        \"period\": \"03:41\",\n" +
            "        \"albumName\": \"我们在中场相遇\",\n" +
            "        \"pic\": \"http://p1.music.126.net/21l0Cy8SO6ycY_eZT-6vVw==/109951163386949943.jpg\"\n" +
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
            "        \"title\": \"喜新恋旧\",\n" +
            "        \"author\": \"Jony J\",\n" +
            "        \"date\": \"2018-11-27\",\n" +
            "        \"period\": \"04:22\",\n" +
            "        \"albumName\": \"喜新恋旧\",\n" +
            "        \"pic\": \"http://p1.music.126.net/78Nt_AEGTm7-Nk7EXTOiVg==/109951163678373297.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Nevada (feat. Cozi Zuehlsdorff)\",\n" +
            "        \"author\": \"Vicetone,Cozi Zuehlsdorff\",\n" +
            "        \"date\": \"2016-06-24\",\n" +
            "        \"period\": \"03:28\",\n" +
            "        \"albumName\": \"Nevada (feat. Cozi Zuehlsdorff)\",\n" +
            "        \"pic\": \"http://p2.music.126.net/X_Ukd1BhXdDwsz4NqrisNA==/109951163640412456.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"幸福了 然后呢\",\n" +
            "        \"author\": \"A-Lin\",\n" +
            "        \"date\": \"2012-12-30\",\n" +
            "        \"period\": \"05:07\",\n" +
            "        \"albumName\": \"幸福了 然后呢 (影音庆功版)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/V9fJHx9y-cfz1SMf7SF4iQ==/109951163667528565.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"需要人陪\",\n" +
            "        \"author\": \"王力宏\",\n" +
            "        \"date\": \"2010-08-14\",\n" +
            "        \"period\": \"04:11\",\n" +
            "        \"albumName\": \"十八般武艺\",\n" +
            "        \"pic\": \"http://p2.music.126.net/Eoql80OnsZAvZ0UASHo6zQ==/109951163421419702.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"浪人琵琶\",\n" +
            "        \"author\": \"胡66\",\n" +
            "        \"date\": \"2018-05-31\",\n" +
            "        \"period\": \"03:44\",\n" +
            "        \"albumName\": \"浪人琵琶\",\n" +
            "        \"pic\": \"http://p1.music.126.net/G5YxAyt9812z9MROfWarkg==/109951163318974870.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"够钟\",\n" +
            "        \"author\": \"周柏豪\",\n" +
            "        \"date\": \"2014-12-10\",\n" +
            "        \"period\": \"03:48\",\n" +
            "        \"albumName\": \"Follow\",\n" +
            "        \"pic\": \"http://p2.music.126.net/8pHTPZixRTD0lB57OKieIQ==/772956684553748.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"春风十里\",\n" +
            "        \"author\": \"鹿先森乐队\",\n" +
            "        \"date\": \"2016-11-09\",\n" +
            "        \"period\": \"06:15\",\n" +
            "        \"albumName\": \"所有的酒，都不如你\",\n" +
            "        \"pic\": \"http://p2.music.126.net/hYjA4Th6CAdkWI_sm32juw==/109951163669459549.jpg\"\n" +
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
            "        \"title\": \"小半\",\n" +
            "        \"author\": \"陈粒\",\n" +
            "        \"date\": \"2016-07-26\",\n" +
            "        \"period\": \"04:57\",\n" +
            "        \"albumName\": \"小梦大半\",\n" +
            "        \"pic\": \"http://p1.music.126.net/HQxTggMCB7AHUXN-ZFEtmA==/1371091013186741.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Shape of You\",\n" +
            "        \"author\": \"Ed Sheeran\",\n" +
            "        \"date\": \"2017-01-06\",\n" +
            "        \"period\": \"03:51\",\n" +
            "        \"albumName\": \"Shape Of You\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5Zs51JS6cQzvQclW5u_J1g==/18832435162240436.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"白羊\",\n" +
            "        \"author\": \"徐秉龙,沈以诚\",\n" +
            "        \"date\": \"2017-10-26\",\n" +
            "        \"period\": \"02:48\",\n" +
            "        \"albumName\": \"白羊\",\n" +
            "        \"pic\": \"http://p1.music.126.net/tczb_7II9KzSuLQsVt89Gw==/109951163049336667.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"R.\",\n" +
            "        \"author\": \"李子豪(HtFR),大喜\",\n" +
            "        \"date\": \"2018-09-17\",\n" +
            "        \"period\": \"03:01\",\n" +
            "        \"albumName\": \"R.\",\n" +
            "        \"pic\": \"http://p1.music.126.net/mir042BmDvrBeta0sDt0xQ==/109951163555488144.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"心安理得\",\n" +
            "        \"author\": \"王天戈\",\n" +
            "        \"date\": \"2017-04-25\",\n" +
            "        \"period\": \"04:29\",\n" +
            "        \"albumName\": \"心安理得\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Hrckg2IfeAV34N4UAZctRg==/109951163604902705.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"理想三旬\",\n" +
            "        \"author\": \"陈鸿宇\",\n" +
            "        \"date\": \"2015-12-31\",\n" +
            "        \"period\": \"03:30\",\n" +
            "        \"albumName\": \"浓烟下的诗歌电台\",\n" +
            "        \"pic\": \"http://p1.music.126.net/cqTTEPAaxXG3cOwaE4E_-g==/109951163104103366.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"RISE\",\n" +
            "        \"author\": \"The Glitch Mob,Mako,The Word Alive\",\n" +
            "        \"date\": \"2018-09-26\",\n" +
            "        \"period\": \"03:12\",\n" +
            "        \"albumName\": \"RISE\",\n" +
            "        \"pic\": \"http://p2.music.126.net/XLulJwVbfowNQhATCt809g==/109951163573081067.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小鹿乱撞\",\n" +
            "        \"author\": \"永彬Ryan.B,狄迪（D-DAY）\",\n" +
            "        \"date\": \"2018-07-10\",\n" +
            "        \"period\": \"03:08\",\n" +
            "        \"albumName\": \"小鹿乱撞\",\n" +
            "        \"pic\": \"http://p1.music.126.net/1qTRyoArCagVmxVkoXIkzg==/109951163398558468.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Wonderful U (Demo Version)\",\n" +
            "        \"author\": \"AGA\",\n" +
            "        \"date\": \"2016-05-10\",\n" +
            "        \"period\": \"04:08\",\n" +
            "        \"albumName\": \"Ginadoll\",\n" +
            "        \"pic\": \"http://p2.music.126.net/UIE3T_txKzd6e8PORxmpCQ==/109951163412959613.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"喜欢\",\n" +
            "        \"author\": \"阿肆\",\n" +
            "        \"date\": \"2017-12-28\",\n" +
            "        \"period\": \"04:10\",\n" +
            "        \"albumName\": \"喜欢\",\n" +
            "        \"pic\": \"http://p1.music.126.net/BA0bFrD0cK4YDSYublCThA==/109951163093942268.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"椿\",\n" +
            "        \"author\": \"沈以诚\",\n" +
            "        \"date\": \"2017-05-20\",\n" +
            "        \"period\": \"03:37\",\n" +
            "        \"albumName\": \"椿\",\n" +
            "        \"pic\": \"http://p1.music.126.net/CpwIPy2YUWC6ksF88eGNyw==/109951162931819035.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"断线\",\n" +
            "        \"author\": \"Shang,lil sophy\",\n" +
            "        \"date\": \"2017-08-07\",\n" +
            "        \"period\": \"04:17\",\n" +
            "        \"albumName\": \"断线\",\n" +
            "        \"pic\": \"http://p2.music.126.net/W-4b64hCb_s8OAGROQXgig==/109951162995598984.jpg\"\n" +
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
            "        \"title\": \"倾城时光\",\n" +
            "        \"author\": \"金瀚\",\n" +
            "        \"date\": \"2018-11-25\",\n" +
            "        \"period\": \"03:13\",\n" +
            "        \"albumName\": \"电视剧 你和我的倾城时光 原声带\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_NZWyS_YKtyhIhYCvsK0gQ==/109951163676646729.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"那些你很冒险的梦\",\n" +
            "        \"author\": \"林俊杰\",\n" +
            "        \"date\": \"2011-12-30\",\n" +
            "        \"period\": \"04:05\",\n" +
            "        \"albumName\": \"学不会\",\n" +
            "        \"pic\": \"http://p2.music.126.net/nQUhiSnK620HHLbZwnrJ3g==/109951163298363015.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Faded\",\n" +
            "        \"author\": \"Alan Walker,Iselin Solheim\",\n" +
            "        \"date\": \"2015-11-25\",\n" +
            "        \"period\": \"03:32\",\n" +
            "        \"albumName\": \"Faded\",\n" +
            "        \"pic\": \"http://p1.music.126.net/8dzD62VK8jLDbhEqkmpIAg==/18277181788626198.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"倒数\",\n" +
            "        \"author\": \"G.E.M.邓紫棋\",\n" +
            "        \"date\": \"2018-08-16\",\n" +
            "        \"period\": \"03:49\",\n" +
            "        \"albumName\": \"另一个童话\",\n" +
            "        \"pic\": \"http://p2.music.126.net/tXCIFsVDK6IKcQ9YWxwOEg==/109951163523944497.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"飘向北方 (Live)\",\n" +
            "        \"author\": \"尤长靖,那吾克热LIL-EM\",\n" +
            "        \"date\": \"2018-09-15\",\n" +
            "        \"period\": \"04:18\",\n" +
            "        \"albumName\": \"中国新说唱 第10期\",\n" +
            "        \"pic\": \"http://p2.music.126.net/D-mpVLLwMrA-hPu0QPYUNQ==/109951163551410648.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"少一点天分\",\n" +
            "        \"author\": \"孙盛希\",\n" +
            "        \"date\": \"2014-11-26\",\n" +
            "        \"period\": \"04:34\",\n" +
            "        \"albumName\": \"|希。O2 | 初雪限定\",\n" +
            "        \"pic\": \"http://p1.music.126.net/1QT6pMrufe1LjwVOgDJ81w==/109951163176818589.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"红昭愿\",\n" +
            "        \"author\": \"音阙诗听\",\n" +
            "        \"date\": \"2017-01-11\",\n" +
            "        \"period\": \"02:53\",\n" +
            "        \"albumName\": \"红昭愿\",\n" +
            "        \"pic\": \"http://p1.music.126.net/8ltR3o9R8uJ9_5Cc71cDhA==/109951162951242154.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"最美的期待\",\n" +
            "        \"author\": \"周笔畅\",\n" +
            "        \"date\": \"2018-03-19\",\n" +
            "        \"period\": \"03:30\",\n" +
            "        \"albumName\": \"最美的期待\",\n" +
            "        \"pic\": \"http://p1.music.126.net/mwCUI0iL3xEC2a4WVICHlA==/109951163115369030.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Send It \",\n" +
            "        \"author\": \"Austin Mahone,Rich Homie Quan\",\n" +
            "        \"date\": \"2016-08-19\",\n" +
            "        \"period\": \"03:01\",\n" +
            "        \"albumName\": \"Send It\",\n" +
            "        \"pic\": \"http://p2.music.126.net/OvNzao--j5ZfucYr6MSdXw==/18561955300159599.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"追光者\",\n" +
            "        \"author\": \"岑宁儿\",\n" +
            "        \"date\": \"2017-06-13\",\n" +
            "        \"period\": \"03:55\",\n" +
            "        \"albumName\": \"夏至未至 影视原声带\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ZZAQGWl9mR7g5xCyWWH3Pw==/19149094509535913.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Five Hundred Miles\",\n" +
            "        \"author\": \"Justin Timberlake,Carey Mulligan,Stark Sands\",\n" +
            "        \"date\": \"2013-09-17\",\n" +
            "        \"period\": \"03:26\",\n" +
            "        \"albumName\": \"Inside Llewyn Davis: Original Soundtrack Recording\",\n" +
            "        \"pic\": \"http://p2.music.126.net/4BTe96FPQ_kW1pmNnlNvHg==/2536573326765583.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我好像在哪见过你\",\n" +
            "        \"author\": \"薛之谦\",\n" +
            "        \"date\": \"2016-06-23\",\n" +
            "        \"period\": \"04:39\",\n" +
            "        \"albumName\": \"初学者\",\n" +
            "        \"pic\": \"http://p1.music.126.net/hti_a0LADoFMBHvOBwAtRA==/1369991500930171.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"浪子回头\",\n" +
            "        \"author\": \"茄子蛋\",\n" +
            "        \"date\": \"2017-11-04\",\n" +
            "        \"period\": \"04:19\",\n" +
            "        \"albumName\": \"卡通人物\",\n" +
            "        \"pic\": \"http://p1.music.126.net/emWwYFceRZ2plNWgnGUDfg==/109951163333175426.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"平凡之路\",\n" +
            "        \"author\": \"朴树\",\n" +
            "        \"date\": \"2017-04-30\",\n" +
            "        \"period\": \"05:02\",\n" +
            "        \"albumName\": \"猎户星座\",\n" +
            "        \"pic\": \"http://p2.music.126.net/W_5XiCv3rGS1-J7EXpHSCQ==/18885211718782327.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Dream It Possible\",\n" +
            "        \"author\": \"Delacey\",\n" +
            "        \"date\": \"2015-12-10\",\n" +
            "        \"period\": \"03:24\",\n" +
            "        \"albumName\": \"Dream It Possible\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Gfq_eVuq7lgilBf0w1g5dg==/109951163088676710.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"삐삐\",\n" +
            "        \"author\": \"IU\",\n" +
            "        \"date\": \"2018-10-10\",\n" +
            "        \"period\": \"03:14\",\n" +
            "        \"albumName\": \"삐삐\",\n" +
            "        \"pic\": \"http://p1.music.126.net/gxo54B2ypqq0Y6tmahBnIw==/109951163596240238.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"僕が死のうと思ったのは\",\n" +
            "        \"author\": \"中島美嘉\",\n" +
            "        \"date\": \"2013-08-28\",\n" +
            "        \"period\": \"06:22\",\n" +
            "        \"albumName\": \"僕が死のうと思ったのは\",\n" +
            "        \"pic\": \"http://p1.music.126.net/c3J4oI2wNSuBg3r2x9LwLg==/5505254720366452.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"GOOD NIGHT\",\n" +
            "        \"author\": \"Lil Ghost小鬼\",\n" +
            "        \"date\": \"2018-03-02\",\n" +
            "        \"period\": \"02:57\",\n" +
            "        \"albumName\": \"GOOD NIGHT\",\n" +
            "        \"pic\": \"http://p1.music.126.net/n1HwjMg04qmkX30YneQXIg==/109951163175266992.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Attention\",\n" +
            "        \"author\": \"Charlie Puth\",\n" +
            "        \"date\": \"2018-05-11\",\n" +
            "        \"period\": \"03:28\",\n" +
            "        \"albumName\": \"Voicenotes\",\n" +
            "        \"pic\": \"http://p1.music.126.net/XWMiED2ryCj2xVovjDRDSQ==/109951163281594877.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"绝代风华\",\n" +
            "        \"author\": \"许嵩\",\n" +
            "        \"date\": \"2018-11-22\",\n" +
            "        \"period\": \"04:15\",\n" +
            "        \"albumName\": \"绝代风华\",\n" +
            "        \"pic\": \"http://p2.music.126.net/Ngh65GwhHtufNRSs9KgEIA==/109951163681417636.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"后来\",\n" +
            "        \"author\": \"刘若英\",\n" +
            "        \"date\": \"1999-11-01\",\n" +
            "        \"period\": \"05:41\",\n" +
            "        \"albumName\": \"我等你\",\n" +
            "        \"pic\": \"http://p2.music.126.net/eBF7bHnJYBUfOFrJ_7SUfw==/109951163351825356.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"遇见\",\n" +
            "        \"author\": \"孙燕姿\",\n" +
            "        \"date\": \"2007-03-01\",\n" +
            "        \"period\": \"03:30\",\n" +
            "        \"albumName\": \"经典全纪录(主打精华版)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ZpcOx5dbNTRK94vSIM20PQ==/768558627827568.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"过客\",\n" +
            "        \"author\": \"是阿涵阿\",\n" +
            "        \"date\": \"2016-12-08\",\n" +
            "        \"period\": \"04:30\",\n" +
            "        \"albumName\": \"过客\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ai-tIcR1c69_tXCoDy8hyA==/18770862510931326.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"消愁\",\n" +
            "        \"author\": \"毛不易\",\n" +
            "        \"date\": \"2018-07-03\",\n" +
            "        \"period\": \"04:21\",\n" +
            "        \"albumName\": \"平凡的一天\",\n" +
            "        \"pic\": \"http://p1.music.126.net/vmCcDvD1H04e9gm97xsCqg==/109951163350929740.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"往后余生\",\n" +
            "        \"author\": \"马良\",\n" +
            "        \"date\": \"2018-05-16\",\n" +
            "        \"period\": \"03:15\",\n" +
            "        \"albumName\": \"往后余生\",\n" +
            "        \"pic\": \"http://p1.music.126.net/VY-LfiQZZNjtDBHGmEu85A==/109951163300149472.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"说散就散\",\n" +
            "        \"author\": \"袁娅维\",\n" +
            "        \"date\": \"2017-12-13\",\n" +
            "        \"period\": \"04:02\",\n" +
            "        \"albumName\": \"说散就散\",\n" +
            "        \"pic\": \"http://p2.music.126.net/Yj2g6u9X6UCZPaRLCoJ5mQ==/109951163169027515.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"空空如也 \",\n" +
            "        \"author\": \"任然\",\n" +
            "        \"date\": \"2017-12-28\",\n" +
            "        \"period\": \"03:33\",\n" +
            "        \"albumName\": \"空空如也\",\n" +
            "        \"pic\": \"http://p2.music.126.net/84FJjDgb51TmRqixaUpshg==/109951163094476391.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"夜空中最亮的星\",\n" +
            "        \"author\": \"逃跑计划\",\n" +
            "        \"date\": \"2012-01-01\",\n" +
            "        \"period\": \"04:12\",\n" +
            "        \"albumName\": \"世界\",\n" +
            "        \"pic\": \"http://p2.music.126.net/d541jx7SqoDzVkenhmtg6g==/19193074974743620.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"魔鬼中的天使\",\n" +
            "        \"author\": \"田馥甄\",\n" +
            "        \"date\": \"2011-09-02\",\n" +
            "        \"period\": \"03:58\",\n" +
            "        \"albumName\": \"My Love\",\n" +
            "        \"pic\": \"http://p1.music.126.net/W9HqFsgMcjgWjW9SutIvrw==/18956679974613469.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"We Don't Talk Anymore\",\n" +
            "        \"author\": \"Charlie Puth,Selena Gomez\",\n" +
            "        \"date\": \"2016-01-29\",\n" +
            "        \"period\": \"03:37\",\n" +
            "        \"albumName\": \"Nine Track Mind\",\n" +
            "        \"pic\": \"http://p1.music.126.net/OVHar05vedbWFEWHuArbGA==/3295236348738229.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"成都\",\n" +
            "        \"author\": \"赵雷\",\n" +
            "        \"date\": \"2016-10-24\",\n" +
            "        \"period\": \"05:28\",\n" +
            "        \"albumName\": \"成都\",\n" +
            "        \"pic\": \"http://p2.music.126.net/34YW1QtKxJ_3YnX9ZzKhzw==/2946691234868155.jpg\"\n" +
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
            "        \"title\": \"你要的全拿走\",\n" +
            "        \"author\": \"胡彦斌\",\n" +
            "        \"date\": \"2018-01-10\",\n" +
            "        \"period\": \"04:59\",\n" +
            "        \"albumName\": \"覅忒好\",\n" +
            "        \"pic\": \"http://p2.music.126.net/9uUWLnRsv4c0F0wu9dlttA==/109951163118372627.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"打上花火\",\n" +
            "        \"author\": \"DAOKO,米津玄師\",\n" +
            "        \"date\": \"2017-08-16\",\n" +
            "        \"period\": \"04:49\",\n" +
            "        \"albumName\": \"打上花火\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ZUCE_1Tl_hkbtamKmSNXEg==/109951163009282836.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"The truth that you leave\",\n" +
            "        \"author\": \"Pianoboy高至豪\",\n" +
            "        \"date\": \"2005-09-08\",\n" +
            "        \"period\": \"03:43\",\n" +
            "        \"albumName\": \"The truth that you leave\",\n" +
            "        \"pic\": \"http://p1.music.126.net/9idkdzbel_-lYBP7Dv_dVQ==/102254581395289.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球坠落 (Live)\",\n" +
            "        \"author\": \"艾热,李佳隆\",\n" +
            "        \"date\": \"2018-07-28\",\n" +
            "        \"period\": \"02:49\",\n" +
            "        \"albumName\": \"中国新说唱 第3期\",\n" +
            "        \"pic\": \"http://p1.music.126.net/4k-pMEO-en8IE6PdJoAYfg==/109951163429466895.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"纸短情长\",\n" +
            "        \"author\": \"花粥\",\n" +
            "        \"date\": \"2018-05-10\",\n" +
            "        \"period\": \"03:06\",\n" +
            "        \"albumName\": \"纸短情长\",\n" +
            "        \"pic\": \"http://p1.music.126.net/PXE9MfYCgnjHz1vkrpUywQ==/109951163290871736.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Wolves\",\n" +
            "        \"author\": \"Selena Gomez,Marshmello\",\n" +
            "        \"date\": \"2017-10-25\",\n" +
            "        \"period\": \"03:17\",\n" +
            "        \"albumName\": \"Wolves\",\n" +
            "        \"pic\": \"http://p1.music.126.net/-nQ2E-8ZjuwGtMipBTYzBw==/17902248323721194.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Havana\",\n" +
            "        \"author\": \"Camila Cabello,Young Thug\",\n" +
            "        \"date\": \"2017-08-03\",\n" +
            "        \"period\": \"03:36\",\n" +
            "        \"albumName\": \"Havana\",\n" +
            "        \"pic\": \"http://p1.music.126.net/zUp6BqKPn1lmZINHsVDoew==/18425615858527510.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Friendships (Original Mix)\",\n" +
            "        \"author\": \"Pascal Letoublon\",\n" +
            "        \"date\": \"2017-09-05\",\n" +
            "        \"period\": \"04:02\",\n" +
            "        \"albumName\": \"Friendships\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ejBqv__hHneHWQnMd1x00A==/18338754440252475.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"再也没有\",\n" +
            "        \"author\": \"永彬Ryan.B,AY楊佬叁\",\n" +
            "        \"date\": \"2017-05-31\",\n" +
            "        \"period\": \"03:32\",\n" +
            "        \"albumName\": \"再也没有\",\n" +
            "        \"pic\": \"http://p1.music.126.net/B7MRU9cieODaInnwzyLwYQ==/18771962022944662.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"千禧\",\n" +
            "        \"author\": \"徐秉龙\",\n" +
            "        \"date\": \"2017-12-09\",\n" +
            "        \"period\": \"03:19\",\n" +
            "        \"albumName\": \"千禧\",\n" +
            "        \"pic\": \"http://p2.music.126.net/_sblL2ZjBOtwLAL-3i01Fw==/109951163078474921.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"虚拟\",\n" +
            "        \"author\": \"陈粒\",\n" +
            "        \"date\": \"2016-07-26\",\n" +
            "        \"period\": \"04:00\",\n" +
            "        \"albumName\": \"小梦大半\",\n" +
            "        \"pic\": \"http://p1.music.126.net/HQxTggMCB7AHUXN-ZFEtmA==/1371091013186741.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"PLANET\",\n" +
            "        \"author\": \"ラムジ\",\n" +
            "        \"date\": \"2006-06-07\",\n" +
            "        \"period\": \"04:03\",\n" +
            "        \"albumName\": \"3ラムジ\",\n" +
            "        \"pic\": \"http://p1.music.126.net/cCyPSxi-BE2h-SmpLBztbA==/18635622580993683.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"越来越不懂\",\n" +
            "        \"author\": \"蔡健雅\",\n" +
            "        \"date\": \"2007-10-05\",\n" +
            "        \"period\": \"03:49\",\n" +
            "        \"albumName\": \"Close To 蔡健雅 Original X Tanya Demo\",\n" +
            "        \"pic\": \"http://p2.music.126.net/urAYesmIFsMak292DbudlQ==/125344325567370.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"See You Again\",\n" +
            "        \"author\": \"Wiz Khalifa,Charlie Puth\",\n" +
            "        \"date\": \"2015-03-17\",\n" +
            "        \"period\": \"03:50\",\n" +
            "        \"albumName\": \"Furious 7 (Original Motion Picture Soundtrack)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/JIc9X91OSH-7fUZqVfQXAQ==/7731765766799133.jpg\"\n" +
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
            "        \"title\": \"牵丝戏\",\n" +
            "        \"author\": \"银临,Aki阿杰\",\n" +
            "        \"date\": \"2015-01-27\",\n" +
            "        \"period\": \"03:59\",\n" +
            "        \"albumName\": \"牵丝戏\",\n" +
            "        \"pic\": \"http://p2.music.126.net/Nd86SOcyCxU5Qu7jdZn_MQ==/7725168696876736.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"买条街\",\n" +
            "        \"author\": \"$唐老师,Wya乌鸦\",\n" +
            "        \"date\": \"2018-09-05\",\n" +
            "        \"period\": \"03:05\",\n" +
            "        \"albumName\": \"买条街\",\n" +
            "        \"pic\": \"http://p2.music.126.net/uv2TrxMzJb5dJdV7eYdBZg==/109951163360056941.jpg\"\n" +
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
            "        \"title\": \"#Lov3 #Ngẫu Hứng\",\n" +
            "        \"author\": \"Hoaprox\",\n" +
            "        \"date\": \"2015-09-19\",\n" +
            "        \"period\": \"01:15\",\n" +
            "        \"albumName\": \"#Lov3 #Ngẫu Hứng\",\n" +
            "        \"pic\": \"http://p1.music.126.net/znZQMUXniXqwjJrXMJO_Qg==/109951163100026676.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"至此流年各天涯\",\n" +
            "        \"author\": \"我不李志\",\n" +
            "        \"date\": \"2017-04-03\",\n" +
            "        \"period\": \"04:08\",\n" +
            "        \"albumName\": \"至此流年各天涯\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ZNr4gStbwNAk4Ek7-uMpWg==/109951162894952016.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"浮生\",\n" +
            "        \"author\": \"刘莱斯\",\n" +
            "        \"date\": \"2016-12-08\",\n" +
            "        \"period\": \"05:29\",\n" +
            "        \"albumName\": \"浮生\",\n" +
            "        \"pic\": \"http://p1.music.126.net/l-Ev4NbIeolk9QoJLtRzTQ==/109951162819579041.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"东西\",\n" +
            "        \"author\": \"很美味\",\n" +
            "        \"date\": \"2018-11-01\",\n" +
            "        \"period\": \"02:40\",\n" +
            "        \"albumName\": \"东西\",\n" +
            "        \"pic\": \"http://p1.music.126.net/PhQLBkijv8iwo1F_t7GY_Q==/109951163638985548.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"大鱼\",\n" +
            "        \"author\": \"周深\",\n" +
            "        \"date\": \"2016-05-19\",\n" +
            "        \"period\": \"05:13\",\n" +
            "        \"albumName\": \"大鱼\",\n" +
            "        \"pic\": \"http://p2.music.126.net/aiPQXP8mdLovQSrKsM3hMQ==/1416170985079958.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"All Falls Down\",\n" +
            "        \"author\": \"Alan Walker,Noah Cyrus,Digital Farm Animals\",\n" +
            "        \"date\": \"2017-10-27\",\n" +
            "        \"period\": \"03:19\",\n" +
            "        \"albumName\": \"All Falls Down\",\n" +
            "        \"pic\": \"http://p1.music.126.net/rTb28CZeLWxIRuSlJWkPLQ==/18850027346628137.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"I Am You\",\n" +
            "        \"author\": \"Kim Taylor\",\n" +
            "        \"date\": \"2009-03-01\",\n" +
            "        \"period\": \"04:34\",\n" +
            "        \"albumName\": \"I Am You\",\n" +
            "        \"pic\": \"http://p1.music.126.net/cCw5Kr5C52bYbV-AOp6IUA==/109951163073357482.jpg\"\n" +
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
            "        \"title\": \"Psycho (Pt. 2)\",\n" +
            "        \"author\": \"Russ\",\n" +
            "        \"date\": \"2016-11-09\",\n" +
            "        \"period\": \"02:42\",\n" +
            "        \"albumName\": \"Psycho (Pt. 2)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/tVjr7jfmmDfsIkrqag3Bkw==/2946691242838284.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"空心 \",\n" +
            "        \"author\": \"光泽\",\n" +
            "        \"date\": \"2016-10-14\",\n" +
            "        \"period\": \"04:39\",\n" +
            "        \"albumName\": \"光泽\",\n" +
            "        \"pic\": \"http://p1.music.126.net/D64eug6ElwN0IjdTY7EDFQ==/3443670431612942.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"流浪\",\n" +
            "        \"author\": \"半阳\",\n" +
            "        \"date\": \"2018-09-06\",\n" +
            "        \"period\": \"03:39\",\n" +
            "        \"albumName\": \"流浪\",\n" +
            "        \"pic\": \"http://p2.music.126.net/TVcuH5xcu23hc4-GBTp5Iw==/109951163560980668.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Right Now (Na Na Na)\",\n" +
            "        \"author\": \"Am1r\",\n" +
            "        \"date\": \"2016-11-08\",\n" +
            "        \"period\": \"02:44\",\n" +
            "        \"albumName\": \"Renditions\",\n" +
            "        \"pic\": \"http://p2.music.126.net/ejLPvQsq-7TrU-3D1z2hrg==/19132601834939735.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我还年轻 我还年轻\",\n" +
            "        \"author\": \"老王乐队\",\n" +
            "        \"date\": \"2017-09-28\",\n" +
            "        \"period\": \"05:47\",\n" +
            "        \"albumName\": \"吾十有五而志于学\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Hv7hvn2lx1wt7Zp0R1y5wg==/109951163032704992.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"只要平凡\",\n" +
            "        \"author\": \"张杰,张碧晨\",\n" +
            "        \"date\": \"2018-06-25\",\n" +
            "        \"period\": \"04:06\",\n" +
            "        \"albumName\": \"只要平凡\",\n" +
            "        \"pic\": \"http://p2.music.126.net/CjGoliP3xOB0gcCUaeTTBg==/109951163375727336.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"广东十年爱情故事\",\n" +
            "        \"author\": \"广东雨神\",\n" +
            "        \"date\": \"2017-10-18\",\n" +
            "        \"period\": \"03:34\",\n" +
            "        \"albumName\": \"广东十年爱情故事\",\n" +
            "        \"pic\": \"http://p2.music.126.net/SWDOrvO3f6L8Q1xGPTbb6w==/109951163102543599.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"世界第一等\",\n" +
            "        \"author\": \"浪哥\",\n" +
            "        \"date\": \"2018-11-20\",\n" +
            "        \"period\": \"03:24\",\n" +
            "        \"albumName\": \"世界第一等\",\n" +
            "        \"pic\": \"http://p2.music.126.net/rP3WtWwn7BJkzR42HvwWuw==/109951163672136620.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"请先说你好(2)\",\n" +
            "        \"author\": \"德芙\",\n" +
            "        \"date\": \"2017-02-07\",\n" +
            "        \"period\": \"04:49\",\n" +
            "        \"albumName\": \"D ove德芙\",\n" +
            "        \"pic\": \"http://p1.music.126.net/iDcfXCdMT39VSrUXZjFtkA==/109951162856582671.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我们\",\n" +
            "        \"author\": \"陈奕迅\",\n" +
            "        \"date\": \"2018-04-10\",\n" +
            "        \"period\": \"04:20\",\n" +
            "        \"albumName\": \"我们\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Ng7OR-bdgrHQKXzLyj2mGg==/109951163240732641.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"非酋\",\n" +
            "        \"author\": \"薛明媛,朱贺\",\n" +
            "        \"date\": \"2017-07-10\",\n" +
            "        \"period\": \"02:52\",\n" +
            "        \"albumName\": \"非酋\",\n" +
            "        \"pic\": \"http://p1.music.126.net/gtPsmgldw_UEsCT2k9eocQ==/19067730649109671.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"易燃易爆炸\",\n" +
            "        \"author\": \"陈粒\",\n" +
            "        \"date\": \"2015-02-02\",\n" +
            "        \"period\": \"03:20\",\n" +
            "        \"albumName\": \"如也\",\n" +
            "        \"pic\": \"http://p1.music.126.net/VuJFMbXzpAProbJPoXLv7g==/7721870161993398.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"相依为命\",\n" +
            "        \"author\": \"陈小春\",\n" +
            "        \"date\": \"2005-08-01\",\n" +
            "        \"period\": \"03:57\",\n" +
            "        \"albumName\": \"十年选\",\n" +
            "        \"pic\": \"http://p1.music.126.net/T9nGuH3jv0Rq0iWYeOhvAQ==/30786325589804.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"爱你\",\n" +
            "        \"author\": \"陈芳语\",\n" +
            "        \"date\": \"2012-04-27\",\n" +
            "        \"period\": \"03:29\",\n" +
            "        \"albumName\": \"Kimberley首张同名专辑 \",\n" +
            "        \"pic\": \"http://p2.music.126.net/0Xvz_4oS4YLCvWtQcXU05Q==/17867063951755098.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"纸短情长（完整版）\",\n" +
            "        \"author\": \"烟把儿\",\n" +
            "        \"date\": \"2017-10-29\",\n" +
            "        \"period\": \"05:00\",\n" +
            "        \"albumName\": \"纸短情长（完整版）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/tbZaE-DjL_BkemynFlL1cQ==/109951163052534918.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"当真\",\n" +
            "        \"author\": \"蒋家驹（蒋蒋）,曲肖冰\",\n" +
            "        \"date\": \"2018-08-27\",\n" +
            "        \"period\": \"03:09\",\n" +
            "        \"albumName\": \"当真\",\n" +
            "        \"pic\": \"http://p2.music.126.net/DH24toQj5As0cKemKfAikw==/109951163511652133.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你，好不好？\",\n" +
            "        \"author\": \"周兴哲\",\n" +
            "        \"date\": \"2016-08-05\",\n" +
            "        \"period\": \"04:47\",\n" +
            "        \"albumName\": \"爱，教会我们的事\",\n" +
            "        \"pic\": \"http://p2.music.126.net/LQcahhupk87rR6ObxQP90A==/3252355408653836.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Please Don't Go\",\n" +
            "        \"author\": \"Joel Adams\",\n" +
            "        \"date\": \"2015-11-02\",\n" +
            "        \"period\": \"03:30\",\n" +
            "        \"albumName\": \"Please Don't Go\",\n" +
            "        \"pic\": \"http://p2.music.126.net/MTG-nrAtrbaV_0k6gTn40A==/3397490932848120.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小幸运\",\n" +
            "        \"author\": \"田馥甄\",\n" +
            "        \"date\": \"2015-07-10\",\n" +
            "        \"period\": \"04:25\",\n" +
            "        \"albumName\": \"小幸运\",\n" +
            "        \"pic\": \"http://p2.music.126.net/bwBsDMYJcFetIc-q_oWjAw==/109951163520335473.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小星星\",\n" +
            "        \"author\": \"汪苏泷\",\n" +
            "        \"date\": \"2010-11-19\",\n" +
            "        \"period\": \"03:16\",\n" +
            "        \"albumName\": \"慢慢懂\",\n" +
            "        \"pic\": \"http://p2.music.126.net/k_WHGJoTvS6H7exsSnK1iA==/3304032446773006.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Waiting For Love\",\n" +
            "        \"author\": \"Avicii,Martin Garrix,Simon Aldred\",\n" +
            "        \"date\": \"2015-03-29\",\n" +
            "        \"period\": \"04:31\",\n" +
            "        \"albumName\": \"Waiting For Love\",\n" +
            "        \"pic\": \"http://p1.music.126.net/oaRoXPxV3EzchLOLQ6a5uQ==/2932397511504193.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Counting Stars\",\n" +
            "        \"author\": \"OneRepublic\",\n" +
            "        \"date\": \"2013-03-22\",\n" +
            "        \"period\": \"04:17\",\n" +
            "        \"albumName\": \"Native (Deluxe Version)\",\n" +
            "        \"pic\": \"http://p2.music.126.net/b2nl6jsVbqj23IV8dVvJcg==/7766950139663735.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Despacito (Remix)\",\n" +
            "        \"author\": \"Luis Fonsi,Daddy Yankee,Justin Bieber\",\n" +
            "        \"date\": \"2017-04-17\",\n" +
            "        \"period\": \"03:48\",\n" +
            "        \"albumName\": \"Despacito (Remix)\",\n" +
            "        \"pic\": \"http://p2.music.126.net/vA4UF75gS1Qpyx07B0acrw==/18521273371761277.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"All Time Low\",\n" +
            "        \"author\": \"Kurt Hugo Schneider,Sam Tsui,Casey Breves\",\n" +
            "        \"date\": \"2016-11-30\",\n" +
            "        \"period\": \"03:21\",\n" +
            "        \"albumName\": \"All Time Low\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Fb07N5IYB2gaqVR0ds-hLw==/18701593278659791.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"借我\",\n" +
            "        \"author\": \"谢春花\",\n" +
            "        \"date\": \"2016-06-21\",\n" +
            "        \"period\": \"04:17\",\n" +
            "        \"albumName\": \"算云烟\",\n" +
            "        \"pic\": \"http://p1.music.126.net/Eg4cy0_HIF2nrX2gMCsWkQ==/17967119509636556.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"老街\",\n" +
            "        \"author\": \"李荣浩\",\n" +
            "        \"date\": \"2010-09-09\",\n" +
            "        \"period\": \"05:18\",\n" +
            "        \"albumName\": \"小黄\",\n" +
            "        \"pic\": \"http://p1.music.126.net/fZFrplIVrHMx4lvgdqiIHQ==/42880953496261.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Run Free (feat. IVIE)\",\n" +
            "        \"author\": \"Deep Chills,IVIE\",\n" +
            "        \"date\": \"2017-08-18\",\n" +
            "        \"period\": \"02:50\",\n" +
            "        \"albumName\": \"Run Free (feat. IVIE)\",\n" +
            "        \"pic\": \"http://p1.music.126.net/jMnLWocFxdIk4N2gugEYTg==/109951163007824283.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"足够\",\n" +
            "        \"author\": \"周星星\",\n" +
            "        \"date\": \"2018-05-04\",\n" +
            "        \"period\": \"03:14\",\n" +
            "        \"albumName\": \"足够\",\n" +
            "        \"pic\": \"http://p1.music.126.net/4uCdaGe3CrDm7FmqgAT0ww==/109951163282502817.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"七月上\",\n" +
            "        \"author\": \"Jam\",\n" +
            "        \"date\": \"2015-04-17\",\n" +
            "        \"period\": \"03:10\",\n" +
            "        \"albumName\": \"七月上\",\n" +
            "        \"pic\": \"http://p1.music.126.net/9kZl6NRj3HxmQQ8DqTjZ4Q==/17729624997966923.jpg\"\n" +
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
            "        \"title\": \"遥远的你\",\n" +
            "        \"author\": \"穆南晶\",\n" +
            "        \"date\": \"2018-07-09\",\n" +
            "        \"period\": \"03:31\",\n" +
            "        \"albumName\": \"遥远的你\",\n" +
            "        \"pic\": \"http://p2.music.126.net/6KsSs51lnEpwQINyXd01Ew==/109951163398425863.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Beautiful Now\",\n" +
            "        \"author\": \"Zedd,Jon Bellion\",\n" +
            "        \"date\": \"2015-05-19\",\n" +
            "        \"period\": \"03:38\",\n" +
            "        \"albumName\": \"True Colors\",\n" +
            "        \"pic\": \"http://p1.music.126.net/ze_ggtReuHBLF2o-wUolFw==/109951163221161145.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Skin\",\n" +
            "        \"author\": \"Rag'N'Bone Man\",\n" +
            "        \"date\": \"2017-01-27\",\n" +
            "        \"period\": \"03:59\",\n" +
            "        \"albumName\": \"Skin\",\n" +
            "        \"pic\": \"http://p1.music.126.net/7nu6VMY4WhO-NsqDYD3YBA==/18299172021576097.jpg\"\n" +
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
            "        \"title\": \"浪费\",\n" +
            "        \"author\": \"林宥嘉\",\n" +
            "        \"date\": \"2012-06-22\",\n" +
            "        \"period\": \"05:07\",\n" +
            "        \"albumName\": \"大小说家\",\n" +
            "        \"pic\": \"http://p2.music.126.net/os7qbSSng_yni2ZFouUryw==/109951163167636205.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"戒烟\",\n" +
            "        \"author\": \"李荣浩\",\n" +
            "        \"date\": \"2017-11-14\",\n" +
            "        \"period\": \"04:53\",\n" +
            "        \"albumName\": \"戒烟\",\n" +
            "        \"pic\": \"http://p1.music.126.net/rVkRzdKkIqVxRjDhN4LFHQ==/18342052975051883.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"其实都没有\",\n" +
            "        \"author\": \"杨宗纬\",\n" +
            "        \"date\": \"2013-03-29\",\n" +
            "        \"period\": \"03:51\",\n" +
            "        \"albumName\": \"初·爱\",\n" +
            "        \"pic\": \"http://p1.music.126.net/DxQeZM26qjkQsyZulBdw6A==/109951163314294843.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"卡路里\",\n" +
            "        \"author\": \"火箭少女101\",\n" +
            "        \"date\": \"2018-07-26\",\n" +
            "        \"period\": \"03:52\",\n" +
            "        \"albumName\": \"卡路里\",\n" +
            "        \"pic\": \"http://p1.music.126.net/fcmIRLdxD1ngZABV9N5maA==/109951163425833838.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你瞒我瞒\",\n" +
            "        \"author\": \"陈柏宇\",\n" +
            "        \"date\": \"2009-12-18\",\n" +
            "        \"period\": \"03:59\",\n" +
            "        \"albumName\": \"Can’t Be Half\",\n" +
            "        \"pic\": \"http://p1.music.126.net/LGSZ3rGT8Ux1pYxcwxnR-g==/2225411534621328.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"耳朵\",\n" +
            "        \"author\": \"李荣浩\",\n" +
            "        \"date\": \"2018-10-17\",\n" +
            "        \"period\": \"04:01\",\n" +
            "        \"albumName\": \"耳朵\",\n" +
            "        \"pic\": \"http://p1.music.126.net/tt8xwK-ASC2iqXNUXYKoDQ==/109951163606377163.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Legends Never Die\",\n" +
            "        \"author\": \"Against the Current\",\n" +
            "        \"date\": \"2017-05-10\",\n" +
            "        \"period\": \"03:55\",\n" +
            "        \"albumName\": \"英雄联盟官方音乐\",\n" +
            "        \"pic\": \"http://p2.music.126.net/raAqjrUB_OMiVbbPkrGtXg==/109951162926087188.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"成全\",\n" +
            "        \"author\": \"林宥嘉\",\n" +
            "        \"date\": \"2018-05-21\",\n" +
            "        \"period\": \"05:09\",\n" +
            "        \"albumName\": \"成全\",\n" +
            "        \"pic\": \"http://p2.music.126.net/jI1EcP0FrAVpPlZdGXd5Cw==/109951163304640811.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"LOVE SCENARIO\",\n" +
            "        \"author\": \"iKON\",\n" +
            "        \"date\": \"2018-09-26\",\n" +
            "        \"period\": \"03:31\",\n" +
            "        \"albumName\": \"RETURN\",\n" +
            "        \"pic\": \"http://p1.music.126.net/t5U-bFNog7p60vY9Ei-AsA==/109951163568446619.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"夜之光\",\n" +
            "        \"author\": \"花姐\",\n" +
            "        \"date\": \"2018-11-03\",\n" +
            "        \"period\": \"03:09\",\n" +
            "        \"albumName\": \"夜之光\",\n" +
            "        \"pic\": \"http://p1.music.126.net/mOo5_Ok0uL3dx-MCll4Wcg==/109951163633343019.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"男孩\",\n" +
            "        \"author\": \"梁博,陶孟童,肖和东,高誉容\",\n" +
            "        \"date\": \"2017-06-10\",\n" +
            "        \"period\": \"03:59\",\n" +
            "        \"albumName\": \"我想和你唱 第二季 第7期\",\n" +
            "        \"pic\": \"http://p1.music.126.net/QFXbRb-OOk-ThxtDyg8fjQ==/18618030395080088.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"走马\",\n" +
            "        \"author\": \"陈粒\",\n" +
            "        \"date\": \"2015-02-02\",\n" +
            "        \"period\": \"03:55\",\n" +
            "        \"albumName\": \"如也\",\n" +
            "        \"pic\": \"http://p1.music.126.net/VuJFMbXzpAProbJPoXLv7g==/7721870161993398.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Counting Sheep\",\n" +
            "        \"author\": \"SAFIA\",\n" +
            "        \"date\": \"2015-03-13\",\n" +
            "        \"period\": \"02:53\",\n" +
            "        \"albumName\": \"Counting Sheep\",\n" +
            "        \"pic\": \"http://p2.music.126.net/MXzI7ExXb6ru3CeW_P1HSw==/7906588115831440.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"BINGBIAN病变 (女声版)\",\n" +
            "        \"author\": \"鞠文娴\",\n" +
            "        \"date\": \"2018-03-03\",\n" +
            "        \"period\": \"04:07\",\n" +
            "        \"albumName\": \"BINGBIAN病变 (女声版)\",\n" +
            "        \"pic\": \"http://p2.music.126.net/4TuBpyxVpbHnj2EMCSnW9w==/109951163176375492.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我要找到你\",\n" +
            "        \"author\": \"陈明\",\n" +
            "        \"date\": \"2000-04-01\",\n" +
            "        \"period\": \"04:15\",\n" +
            "        \"albumName\": \"幸福\",\n" +
            "        \"pic\": \"http://p1.music.126.net/o6CaDDYcTHki_oAO10dwPQ==/109951163451218052.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"房间\",\n" +
            "        \"author\": \"刘瑞琦\",\n" +
            "        \"date\": \"2013-10-18\",\n" +
            "        \"period\": \"04:25\",\n" +
            "        \"albumName\": \"房间\",\n" +
            "        \"pic\": \"http://p1.music.126.net/hOr_kcXuEDIsQ0JK1HOewQ==/5698768766875669.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Closer\",\n" +
            "        \"author\": \"The Chainsmokers,Halsey\",\n" +
            "        \"date\": \"2016-07-29\",\n" +
            "        \"period\": \"04:04\",\n" +
            "        \"albumName\": \"Closer\",\n" +
            "        \"pic\": \"http://p2.music.126.net/nC7UtVKkQNmfb8oPG1qQFw==/3310629516306722.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"i love Poland\",\n" +
            "        \"author\": \"苏冬涛,昊林\",\n" +
            "        \"date\": \"2018-09-15\",\n" +
            "        \"period\": \"03:07\",\n" +
            "        \"albumName\": \"i love Poland\",\n" +
            "        \"pic\": \"http://p2.music.126.net/h_JHIoFaX56FSiMcjVdkuw==/109951163551319376.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"There For You\",\n" +
            "        \"author\": \"Martin Garrix,Troye Sivan\",\n" +
            "        \"date\": \"2017-05-26\",\n" +
            "        \"period\": \"03:41\",\n" +
            "        \"albumName\": \"There For You\",\n" +
            "        \"pic\": \"http://p1.music.126.net/E_ffmvXrVZoTugVf_Zf4Cg==/18520173860179248.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Intro\",\n" +
            "        \"author\": \"The xx\",\n" +
            "        \"date\": \"2009-08-16\",\n" +
            "        \"period\": \"02:07\",\n" +
            "        \"albumName\": \"xx\",\n" +
            "        \"pic\": \"http://p2.music.126.net/Xik6a3wXoGPOLI1GNXGdFQ==/825733232504415.jpg\"\n" +
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
            "        \"title\": \"遥不可及的你\",\n" +
            "        \"author\": \"花粥\",\n" +
            "        \"date\": \"2017-01-01\",\n" +
            "        \"period\": \"02:30\",\n" +
            "        \"albumName\": \"2017（一）\",\n" +
            "        \"pic\": \"http://p1.music.126.net/_d88fVvtP17B-hV7z1lWzg==/109951162835476747.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Victory\",\n" +
            "        \"author\": \"Two Steps From Hell\",\n" +
            "        \"date\": \"2015-04-28\",\n" +
            "        \"period\": \"05:20\",\n" +
            "        \"albumName\": \"Battlecry\",\n" +
            "        \"pic\": \"http://p1.music.126.net/nJROWeZiEp1TUv27amRguQ==/18195817928618786.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"后来的我们\",\n" +
            "        \"author\": \"五月天\",\n" +
            "        \"date\": \"2018-04-13\",\n" +
            "        \"period\": \"04:45\",\n" +
            "        \"albumName\": \"后来的我们\",\n" +
            "        \"pic\": \"http://p1.music.126.net/s6bXQX0M-H9EoeqGfr4wrg==/109951163250238942.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"青柠\",\n" +
            "        \"author\": \"徐秉龙,桃十五\",\n" +
            "        \"date\": \"2017-09-08\",\n" +
            "        \"period\": \"03:19\",\n" +
            "        \"albumName\": \"青柠\",\n" +
            "        \"pic\": \"http://p2.music.126.net/CFWxtFlJK3qs-Fx-TUfMnQ==/109951163020971473.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"当爱来临的时候\",\n" +
            "        \"author\": \"吴莫愁\",\n" +
            "        \"date\": \"2018-11-06\",\n" +
            "        \"period\": \"03:46\",\n" +
            "        \"albumName\": \"电视剧 你和我的倾城时光 原声带\",\n" +
            "        \"pic\": \"http://p2.music.126.net/_NZWyS_YKtyhIhYCvsK0gQ==/109951163676646729.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"你一定要幸福\",\n" +
            "        \"author\": \"何洁\",\n" +
            "        \"date\": \"2007-02-12\",\n" +
            "        \"period\": \"05:15\",\n" +
            "        \"albumName\": \"美丽分贝 原声大碟\",\n" +
            "        \"pic\": \"http://p1.music.126.net/OXKdV18OtmaENCq5pgoiRg==/72567767449548.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Shiva\",\n" +
            "        \"author\": \"INKYZ,M.I.M.E\",\n" +
            "        \"date\": \"2017-05-02\",\n" +
            "        \"period\": \"03:04\",\n" +
            "        \"albumName\": \"Shiva\",\n" +
            "        \"pic\": \"http://p1.music.126.net/NWraD_Kqb5-zYVHzyyvEeQ==/109951163292082272.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"离人愁\",\n" +
            "        \"author\": \"李袁杰\",\n" +
            "        \"date\": \"2018-02-08\",\n" +
            "        \"period\": \"04:08\",\n" +
            "        \"albumName\": \"离人愁\",\n" +
            "        \"pic\": \"http://p2.music.126.net/GwuLAjpfZysAB9U5rC9C9g==/109951163248612704.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Superstar\",\n" +
            "        \"author\": \"Beatrich\",\n" +
            "        \"date\": \"2017-07-21\",\n" +
            "        \"period\": \"03:37\",\n" +
            "        \"albumName\": \"Superstar\",\n" +
            "        \"pic\": \"http://p1.music.126.net/kM-9kKS4YHdO3Vf4rWKS1w==/18195817928623495.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"一直很安静\",\n" +
            "        \"author\": \"阿桑\",\n" +
            "        \"date\": \"2006-02-20\",\n" +
            "        \"period\": \"04:10\",\n" +
            "        \"albumName\": \"Listen To HIM\",\n" +
            "        \"pic\": \"http://p2.music.126.net/Zyji-kiWpjLF19CF0yHSlg==/1727332767246198.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"莫妮卡\",\n" +
            "        \"author\": \"柳爽\",\n" +
            "        \"date\": \"2017-06-28\",\n" +
            "        \"period\": \"04:49\",\n" +
            "        \"albumName\": \"莫妮卡\",\n" +
            "        \"pic\": \"http://p1.music.126.net/0PFBuvIIi3n-U_3qjGwfeg==/18926993160737620.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"恋爱サーキュレーション\",\n" +
            "        \"author\": \"花澤香菜\",\n" +
            "        \"date\": \"2010-01-27\",\n" +
            "        \"period\": \"04:13\",\n" +
            "        \"albumName\": \"恋爱サーキュレーション\",\n" +
            "        \"pic\": \"http://p1.music.126.net/hWrYLdhzF4waj4WL1dFPmg==/642114790633458.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"The Spectre\",\n" +
            "        \"author\": \"Alan Walker\",\n" +
            "        \"date\": \"2017-09-15\",\n" +
            "        \"period\": \"03:13\",\n" +
            "        \"albumName\": \"The Spectre\",\n" +
            "        \"pic\": \"http://p2.music.126.net/um3WrsNYjSLrsycBkB7urw==/109951163025213134.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"昨日青空\",\n" +
            "        \"author\": \"尤长靖\",\n" +
            "        \"date\": \"2018-07-19\",\n" +
            "        \"period\": \"04:39\",\n" +
            "        \"albumName\": \"昨日青空\",\n" +
            "        \"pic\": \"http://p1.music.126.net/5BLwaGxULPLXWhhnIzD2CQ==/109951163413015911.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"偏爱\",\n" +
            "        \"author\": \"张芸京\",\n" +
            "        \"date\": \"2009-06-18\",\n" +
            "        \"period\": \"03:32\",\n" +
            "        \"albumName\": \"仙剑奇侠传三 电视原声带\",\n" +
            "        \"pic\": \"http://p1.music.126.net/2-_sPmCBnN6VfwFmONRy2Q==/46179488378975.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"再见青春\",\n" +
            "        \"author\": \"任素汐\",\n" +
            "        \"date\": \"2018-09-13\",\n" +
            "        \"period\": \"04:41\",\n" +
            "        \"albumName\": \"再见青春\",\n" +
            "        \"pic\": \"http://p1.music.126.net/VfL1yDDtIL-GCH_Zt4a9NQ==/109951163547493452.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钟无艳\",\n" +
            "        \"author\": \"谢安琪\",\n" +
            "        \"date\": \"2007-12-11\",\n" +
            "        \"period\": \"04:36\",\n" +
            "        \"albumName\": \"3/8(新歌+精选)\",\n" +
            "        \"pic\": \"http://p2.music.126.net/jKdhcbQIjNTVRVVpc6INQA==/109951163610130313.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Frontier (Extended Mix)\",\n" +
            "        \"author\": \"VINAI,SCNDL\",\n" +
            "        \"date\": \"2015-08-19\",\n" +
            "        \"period\": \"03:26\",\n" +
            "        \"albumName\": \"Frontier\",\n" +
            "        \"pic\": \"http://p1.music.126.net/G6cGFBhRdplC2vPWZTK-kQ==/109951163171453285.jpg\"\n" +
            "    }\n" +
            "]";
    public static List<JSONObject> hotTopMusicData = null;
    static {
        hotTopMusicData = JSON.parseObject(hotTopMusicDataStr,List.class);
    }
}
