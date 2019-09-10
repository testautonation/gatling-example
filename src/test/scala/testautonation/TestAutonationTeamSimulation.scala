package testautonation

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TestAutonationTeamSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://testautonation.com")
		.inferHtmlResources(BlackList(), WhiteList())
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-MT,en-US;q=0.9,en;q=0.8,it;q=0.7",
		"Pragma" -> "no-cache",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map("Intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""")

	val headers_4 = Map("Origin" -> "https://testautonation.com")

	val headers_11 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-MT,en-US;q=0.9,en;q=0.8,it;q=0.7",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"upgrade-insecure-requests" -> "1",
		"x-client-data" -> "CKm1yQEIlbbJAQijtskBCMG2yQEIqZ3KAQi7ncoBCKijygEIv6fKAQjkqMoBGPmlygE=")

	val headers_16 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-MT,en-US;q=0.9,en;q=0.8,it;q=0.7",
		"Pragma" -> "no-cache")

	val headers_35 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-MT,en-US;q=0.9,en;q=0.8,it;q=0.7",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"x-client-data" -> "CKm1yQEIlbbJAQijtskBCMG2yQEIqZ3KAQi7ncoBCKijygEIv6fKAQjkqMoBGPmlygE=")

	val headers_36 = Map("Origin" -> "https://googleads.g.doubleclick.net")

    val uri01 = "https://tpc.googlesyndication.com"
    val uri03 = "https://i0.wp.com/testautonation.com/wp-content/uploads"
    val uri04 = "https://z-na.amazon-adsystem.com/widgets/onejs"
    val uri05 = "https://i1.wp.com/testautonation.com/wp-content/uploads"
    val uri06 = "https://googleads.g.doubleclick.net/pagead"
    val uri07 = "https://downloads.mailchimp.com/js/signup-forms/popup"
    val uri08 = "https://mc.us17.list-manage.com/subscribe/form-settings"
    val uri09 = "https://s1.wp.com/wp-content"
    val uri10 = "https://fls-na.amazon-adsystem.com/1/action-impressions/1/OE/associates-adsystems/action/cm_:onejs_load_evt@v=3127,onejs_exec_time@v=3,aax_load_time@v=336,aax_load_time_one_tag@v=336,wdgt_load_time@v=3471,wdgt_load_time_MT@v=3471,wdgt_load_time_one_tag@v=3471,wdgt_load_time_invoke@v=344,wdgt_load_time_invoke_one_tag@v=342,wdgt_load_time_invoke_one_tag_MT@v=342"
    val uri11 = "https://www.google.com/ads/measurement/l"
    val uri12 = "https://adservice.google.com/adsid/integrator.js"
    val uri13 = "https://ir-na.amazon-adsystem.com/e/ir"
    val uri14 = "https://fonts.gstatic.com/s/roboto/v18"
    val uri15 = "https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0"
    val uri16 = "https://s0.wp.com"
    val uri17 = "https://pagead2.googlesyndication.com"
    val uri18 = "https://www.googletagservices.com/activeview/js/current/osd_listener.js"
    val uri19 = "https://aax-us-east.amazon-adsystem.com/x"
    val uri20 = "https://adservice.google.com.mt/adsid/integrator.js"
    val uri21 = "https://ssl.google-analytics.com"
    val uri22 = "https://fonts.googleapis.com/css"

	val scn = scenario("TestAutonationTeamSimulation")
		.exec(http("request_0")
			.get("/testautonation-team/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri03 + "/2017/12/cropped-Logo-1-e1512730749267-1.png?w=320&ssl=1"),
            http("request_2")
			.get(uri17 + "/pagead/js/adsbygoogle.js"),
            http("request_3")
			.get(uri21 + "/ga.js")
			.headers(headers_3),
            http("request_4")
			.get(uri14 + "/KFOmCnqEu92Fr1Mu4mxKKTU1Kg.woff2")
			.headers(headers_4),
            http("request_5")
			.get(uri14 + "/KFOlCnqEu92Fr1MmWUlfBBc4AMP6lQ.woff2")
			.headers(headers_4),
            http("request_6")
			.get(uri14 + "/KFOlCnqEu92Fr1MmSU5fBBc4AMP6lQ.woff2")
			.headers(headers_4),
            http("request_7")
			.get(uri05 + "/2018/04/010101_LOGO_Sauce-Labs_Horiz_Red-Grey_RGB.png?w=2064&ssl=1"),
            http("request_8")
			.get(uri03 + "/2018/01/Banner-2.png?resize=2048%2C1109&"),
            http("request_9")
			.get(uri15 + "/fonts/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_4),
            http("request_10")
			.get(uri17 + "/pub-config/r20160913/ca-pub-8772651039416265.js"),
            http("request_11")
			.get(uri06 + "/html/r20181205/r20180604/zrt_lookup.html")
			.headers(headers_11),
            http("request_12")
			.get(uri20 + "?domain=testautonation.com"),
            http("request_13")
			.get(uri17 + "/pagead/js/r20181205/r20180604/show_ads_impl.js"),
            http("request_14")
			.get(uri12 + "?domain=testautonation.com"),
            http("request_15")
			.get(uri17 + "/pagead/js/r20181205/r20180604/show_ads_impl.js"),
            http("request_16")
			.get("/wp-includes/js/wp-emoji-release.min.js?ver=ef7049a9a1597ae4716562232b9d6b1f&nocache=1")
			.headers(headers_16),
            http("request_17")
			.get(uri21 + "/__utm.gif?utmwv=5.7.2&utms=8&utmn=1692463006&utmhn=testautonation.com&utmcs=UTF-8&utmsr=1680x1050&utmvp=1679x529&utmsc=24-bit&utmul=en-mt&utmje=0&utmfl=-&utmdt=The%20TestAutonation%20team%20-%20Testautonation&utmhid=736278879&utmr=0&utmp=%2Ftestautonation-team%2F&utmht=1544889894770&utmac=UA-107362881-1&utmcc=__utma%3D175746727.44639282.1537187924.1544513692.1544888533.14%3B%2B__utmz%3D175746727.1537187924.1.1.utmcsr%3D(direct)%7Cutmccn%3D(direct)%7Cutmcmd%3D(none)%3B&utmjid=&utmu=DAAAAAAAAAAAAAAAAAAAAAAE~"),
            http("request_18")
			.get(uri08 + "?u=0d2d1aa569282a119582f78f2&id=9f8a5f8b6d&u=0d2d1aa569282a119582f78f2&id=9f8a5f8b6d&c=dojo_request_script_callbacks.dojo_request_script0"),
            http("request_19")
			.get(uri19 + "/getad?src=330&c=100&sz=1x1&apiVersion=2.0&pj=%7B%22overwrite%22%3A%22false%22%2C%22tracking_id%22%3A%22testautonatio-20%22%2C%22ad_type%22%3A%22one_tag%22%2C%22marketplace%22%3A%22amazon%22%2C%22enable_geo_redirection%22%3A%22true%22%2C%22enable_auto_tagging%22%3A%22false%22%2C%22region%22%3A%22US%22%2C%22placement%22%3A%22adunit%22%2C%22viewerCountry%22%3A%22MT%22%2C%22textlinks%22%3A%22%22%2C%22debug%22%3A%22false%22%2C%22acap_publisherId%22%3A%22testautonatio-20%22%2C%22slotNum%22%3A0%7D&u=https%3A%2F%2Ftestautonation.com%2Ftestautonation-team%2F&jscb=amzn_assoc_jsonp_callback_adunit_0"),
            http("request_20")
			.get(uri07 + "/1.0/popup.js"),
            http("request_21")
			.get(uri17 + "/pagead/js/r20181205/r20100101/osd.js"),
            http("request_22")
			.get("/jquery.js")
			.headers(headers_16)
			.check(status.is(404)),
            http("request_23")
			.get(uri06 + "/ads?client=ca-pub-8772651039416265&output=html&adk=1812271804&adf=3025194257&lmt=1544889895&pucrd=CgYgACgAOAF4Aw&plat=1%3A32776%2C2%3A16809992%2C8%3A32776%2C9%3A32776%2C16%3A8388608%2C30%3A1081344&guci=1.2.0.0.2.2.0.0&format=0x0&url=https%3A%2F%2Ftestautonation.com%2Ftestautonation-team%2F&ea=0&flash=0&pra=5&wgl=1&adsid=NT&dt=1544889894508&bpp=61&bdt=600&fdt=662&idt=660&shv=r20181205&cbv=r20180604&saldr=aa&abxe=1&nras=1&correlator=7004218409666&frm=20&pv=2&ga_vid=44639282.1537187924&ga_sid=1544888533&ga_hid=736278879&ga_fc=1&iag=0&icsg=4479414616191039&dssz=37&mdo=0&mso=0&u_tz=60&u_his=3&u_java=0&u_h=1050&u_w=1680&u_ah=1027&u_aw=1680&u_cd=24&u_nplug=3&u_nmime=4&adx=0&ady=0&biw=1679&bih=529&scr_x=0&scr_y=0&eid=21060853%2C188690903%2C410075081&oid=3&ref=https%3A%2F%2Ftestautonation.com%2F&rx=0&eae=2&fc=1936&brdim=-1680%2C0%2C-1680%2C0%2C1680%2C23%2C1680%2C1050%2C1679%2C529&vis=1&rsz=%7C%7Cs%7C&abl=NS&ppjl=f&fu=16&bc=15&jar=2018-12-15-15&osw_key=3685059567&ifi=0&uci=0.1kles545vp03&fsb=1&dtd=690")
			.headers(headers_11),
            http("request_24")
			.get(uri19 + "/px/QvpVojOBbe8J59YP1ZyROSgAAAFnsp0ITAEAAAFKAX4Viuo/?assoc_payload=%7B%22totalDocWidth%22%3A1679%2C%22totalDocHeight%22%3A2950%2C%22logType%22%3A%22onetag_pageload%22%2C%22pageTitle%22%3A%22The%20TestAutonation%20team%20-%20Testautonation%22%2C%22numLinks%22%3A0%2C%22numAutoTaggedLinks%22%3A0%2C%22autoTaggingEnabled%22%3Afalse%2C%22geoRedirectEnabled%22%3Atrue%2C%22numLinksATF%22%3A0%2C%22numLinksBTF%22%3A0%2C%22shortLinksInLivePool%22%3A%22%22%2C%22shortLinksInPage%22%3A%22%22%2C%22shortLinksInLivePoolCount%22%3A0%2C%22shortLinksInPageCount%22%3A0%2C%22shortLinksMatchCount%22%3A0%2C%22linkCode%22%3A%22w49%22%2C%22trackingId%22%3A%22testautonatio-20%22%2C%22refUrl%22%3A%22https%3A%2F%2Ftestautonation.com%2Ftestautonation-team%2F%22%7D"),
            http("request_25")
			.get(uri10 + "?marketplace=US&service=AmazonWidgets&method=Widgets_Render_Time&marketplaceId=ATVPDKIKX0DER&requestId=40a6bdc1-4922-44f5-9ac2-d2a1317d3bd0&session=7a29aa21-3ca5-47b7-a234-2613976f4039"),
            http("request_26")
			.get(uri06 + "/ads?client=ca-pub-8772651039416265&output=html&h=90&adk=3130937508&adf=1730821504&w=1200&fwrn=4&fwrnh=100&lmt=1544889895&pucrd=CgYgACgAOAF4Aw&rafmt=1&to=qs&pwprc=6803986100&guci=1.2.0.0.2.2.0.0&format=1200x90&url=https%3A%2F%2Ftestautonation.com%2Ftestautonation-team%2F&flash=0&fwr=0&resp_fmts=3&wgl=1&adsid=NT&dt=1544889894569&bpp=21&bdt=661&fdt=646&idt=599&shv=r20181205&cbv=r20180604&saldr=aa&abxe=1&prev_fmts=0x0&nras=1&correlator=7004218409666&frm=20&pv=1&ga_vid=44639282.1537187924&ga_sid=1544888533&ga_hid=736278879&ga_fc=1&iag=0&icsg=4479414616191039&dssz=38&mdo=0&mso=0&u_tz=60&u_his=3&u_java=0&u_h=1050&u_w=1680&u_ah=1027&u_aw=1680&u_cd=24&u_nplug=3&u_nmime=4&adx=240&ady=278&biw=1679&bih=529&scr_x=0&scr_y=0&eid=21060853%2C188690903%2C410075081&oid=3&ref=https%3A%2F%2Ftestautonation.com%2F&rx=0&eae=0&fc=1936&brdim=-1680%2C0%2C-1680%2C0%2C1680%2C23%2C1680%2C1050%2C1679%2C529&vis=1&rsz=%7C%7CeE%7C&abl=CS&ppjl=f&pfx=0&fu=144&bc=15&jar=2018-12-15-15&osw_key=3298096910&ifi=1&uci=1.o9ne8hatdqtp&fsb=1&xpc=XE49mdXGt9&p=https%3A//testautonation.com&dtd=656")
			.headers(headers_11),
            http("request_27")
			.get(uri01 + "/pagead/js/r20181205/r20110914/client/ext/m_js_controller.js"),
            http("request_28")
			.get(uri01 + "/pagead/js/r20181205/r20110914/abg_lite.js"),
            http("request_29")
			.get(uri01 + "/simgad/5424530185076202891?w=200&h=200"),
            http("request_30")
			.get(uri22 + "?family=Roboto:300,400,500&lang=en"),
            http("request_31")
			.get(uri01 + "/pagead/js/r20181205/r20110914/client/ext/m_qs_click_protection.js"),
            http("request_32")
			.get(uri18 + "?cache=r20110914"),
            http("request_33")
			.get(uri01 + "/pagead/js/r20181205/r20110914/client/ext/m_window_focus_non_hydra.js"),
            http("request_34")
			.get(uri11 + "?ebcid=ALh7CaRCDju9PdbG3BtI0msyPFh3FsYRdUMBxrrIfGvMv_YxG-9awlJc_tc7mBQVCgk_rkgdfWPC"),
            http("request_35")
			.get(uri06 + "/adview?ai=CYT_YJyYVXMv2EMXAb9azvpAJ8ZPR01LmtPPxrwfAjbcBEAEgnu_vamDXs_4EoAH_24rIA8gBAagDAaoExgFP0Fs_1f0UYfW_I829oVReCnxJp83nHqudpZHCHZeqIIaDzy6rFFCMT8kPfJuJnKkToGII4ARbR7TjtHOuFzkOqKCCTeMtyPvBoWtW94ONKp7Cs_-TgDEytFMA2LCR8RInHrwyXbr0iA-8ppu6yLgbdKi929pxS6iQsCFiCwkBbJKnjRvX3RZmrDB23AEIo3yp6peMm2nLYId6y0GGQ_ZGqn2RxDMowttaCAEGiyrefqIJPmwlTvkowufGOcsdJQlQIZctEPPABNWGor3UAZIFBAgEGAGSBQQIBRgEgAeG85wJqAeOzhuoB9XJG6gHqAaoB9nLG6gHz8wbqAemvhvYBwHyBwQQ_N0V0ggJCIDhgHAQARgCgAoB2BMMiBQB&sigh=39sk-a0f4T0&template_id=5001&tpd=AGWhJmuLz3A02RsU4KseJ1bVrk8i6qZNJi45lvsPPSSxcRs14Q")
			.headers(headers_35),
            http("request_36")
			.get(uri14 + "/KFOlCnqEu92Fr1MmEU9fBBc4AMP6lQ.woff2")
			.headers(headers_36),
            http("request_37")
			.get(uri14 + "/KFOmCnqEu92Fr1Mu4mxKKTU1Kg.woff2")
			.headers(headers_36),
            http("request_38")
			.get(uri13 + "?l=w49&t=testautonatio-20&o=1&cb=1544889895154"),
            http("request_39")
			.get(uri06 + "/ads?client=ca-pub-8772651039416265&output=html&h=90&adk=2890694787&adf=1239331397&w=1100&fwrn=4&fwrnh=100&lmt=1544889895&pucrd=CgYgACgAOAF4Aw&rafmt=1&to=qs&pwprc=6803986100&guci=1.2.0.0.2.2.0.0&format=1100x90&url=https%3A%2F%2Ftestautonation.com%2Ftestautonation-team%2F&flash=0&fwr=0&resp_fmts=3&wgl=1&adsid=NT&dt=1544889895586&bpp=62&bdt=1677&fdt=64&idt=-M&shv=r20181205&cbv=r20180604&saldr=aa&abxe=1&prev_fmts=0x0%2C1200x90&nras=1&correlator=7004218409666&frm=20&pv=1&ga_vid=44639282.1537187924&ga_sid=1544888533&ga_hid=736278879&ga_fc=1&iag=0&icsg=4479414616191039&dssz=38&mdo=0&mso=0&u_tz=60&u_his=3&u_java=0&u_h=1050&u_w=1680&u_ah=1027&u_aw=1680&u_cd=24&u_nplug=3&u_nmime=4&adx=290&ady=2346&biw=1679&bih=529&scr_x=0&scr_y=0&eid=21060853%2C188690903%2C410075081&oid=3&ref=https%3A%2F%2Ftestautonation.com%2F&rx=0&eae=0&fc=1936&brdim=-1680%2C0%2C-1680%2C0%2C1680%2C23%2C1680%2C1050%2C1679%2C529&vis=1&rsz=%7C%7CeEbr%7C&abl=CS&ppjl=f&pfx=0&fu=144&bc=15&jar=2018-12-15-15&osw_key=1632800373&ifi=2&uci=2.ftuwja8x8ptw&fsb=1&xpc=AtYZ4z2bZm&p=https%3A//testautonation.com&dtd=73")
			.headers(headers_11),
            http("request_40")
			.get(uri01 + "/pagead/js/r20181205/r20110914/client/ext/m_js_controller.js"),
            http("request_41")
			.get(uri01 + "/simgad/5424530185076202891?w=200&h=200"),
            http("request_42")
			.get(uri01 + "/pagead/js/r20181205/r20110914/abg_lite.js"),
            http("request_43")
			.get(uri22 + "?family=Roboto:300,400,500&lang=en"),
            http("request_44")
			.get(uri01 + "/pagead/js/r20181205/r20110914/client/ext/m_qs_click_protection.js"),
            http("request_45")
			.get(uri18 + "?cache=r20110914"),
            http("request_46")
			.get(uri01 + "/pagead/js/r20181205/r20110914/client/ext/m_window_focus_non_hydra.js"),
            http("request_47")
			.get(uri11 + "?ebcid=ALh7CaQ7x8dytR42BCiE2Lbvl8IP-BWoJ09IElaD3eoc08-tNwkbOswLKb0xI4M-XRMNHPhVMviO"),
            http("request_48")
			.get(uri06 + "/adview?ai=CZJmuJyYVXLzEK8q4b9S8iPgC8ZPR01LmtPPxrwfAjbcBEAEgnu_vamDXs_4EoAH_24rIA8gBAagDAaoExgFP0LGLqrocdfVYdMAF2-kx6h-w0lTbKRRgSN0OAf4tb3oc9C1F-WHxaEoxPxuQkGbyQZrX_BDTl5UWj5N4vg4yY8WiiX4dfn6ktBrGmn0pLOSmw_IvfdtGbXGJCqysWm7bnW9cP0kplvkNBIykBrHv9PiUx0c3LDvZEJRA9NJgDcK50ebNYYNB6QpgaKWzK3tL5tp-NDvCD5gPedydWrv4KJizmR3RL4OIsiDcp9xbFCvWvjchV7GOqe6nG4cWdda4MNhjRhLABNWGor3UAZIFBAgEGAGSBQQIBRgEgAeG85wJqAeOzhuoB9XJG6gHqAaoB9nLG6gHz8wbqAemvhvYBwHyBwQQ_sgT0ggJCIDhgHAQARgCgAoB2BMMiBQB&sigh=Q-NJcVRu6og&template_id=5001&tpd=AGWhJmv_K5ZUmPDyzChaqmym1tw3VPZ1cTfyBW93uifo6H0K1Q")
			.headers(headers_35),
            http("request_49")
			.get(uri14 + "/KFOlCnqEu92Fr1MmEU9fBBc4AMP6lQ.woff2")
			.headers(headers_36),
            http("request_50")
			.get(uri14 + "/KFOmCnqEu92Fr1Mu4mxKKTU1Kg.woff2")
			.headers(headers_36),
            http("request_51")
			.get(uri17 + "/pcs/activeview?xai=AKAOjstzppz07GS_bUnu2OixfTd_nWYQ8g86WwXBQC1anNxKYnjhjjbm3Qw9PlM5TKabbgMifHn3pxZibAQLvgYgieL5kFo2AFFpXXCFAfLYOcwaFP_jCMRkOQ&sai=AMfl-YQodlfto0tHSUZMCmkRzBHOO0OB_tlA0JJuEMAb6MZQwCwmMwEC5pqxZChAFVagML7IbuLRcIOHekiGKYWOL6ecRUT8qkhONNs&sig=Cg0ArKJSzDXaGoqDPJrpEAE&cid=CAASPeRoGZqn5BFsHFwqY8Z8cD2zztqe9MsZREC-Qg_H_MUYKguKowsP43oIs0PAqe30JuRb_t4PFbxOIyf0qQg&adk=3130937508&tt=-1&bs=1679%2C529&mtos=1058,1058,1058,1058,1058&tos=1058,0,0,0,0&p=278,240,368,1440&mkm=1&mcvt=1058&rs=1&ht=0&tfs=29&tls=1087&mc=1&lte=1&bas=0&bac=0&avms=geo&rst=1544889895231&dlt=325&rpt=265&isd=0&msd=0&lm=2&oseid=3&ps=1679%2C2950&ss=1680%2C1050&pt=-1&deb=1-2-3-20-12-35-15-8&tvt=1061&r=v&id=osdim&uc=8&upc=0&tgt=DIV&cl=1&cec=1&clc=1&cac=1&cd=1198x88&itpl=14&v=20181207")))

	setUp(scn.inject(rampUsers(100) during (1 minute))).protocols(httpProtocol)
}