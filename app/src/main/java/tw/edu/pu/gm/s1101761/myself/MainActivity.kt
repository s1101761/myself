package tw.edu.pu.gm.s1101761.myself

import android.graphics.Color
import android.graphics.Rect
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.GestureDetector.OnGestureListener
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity(), OnGestureListener, OnTouchListener {

    lateinit var txv: TextView
    lateinit var gDetector: GestureDetector
    var count:Int = 0
    var count1:Int = 0
    var word:String = ""
    lateinit var img1: ImageView
    lateinit var img2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.setTextColor(Color.parseColor("#eeee00"))
        txv.setBackgroundColor(Color.BLUE)
        txv.setTypeface(
            Typeface.createFromAsset(assets,
                "font/HanyiSentyFingerPainting.ttf"))
        txv.getBackground().setAlpha(50)  //0~255透明度值
        gDetector = GestureDetector(this, this)

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        /*
        if (txv.text == "手勢辨別"){
            txv.text = "靜宜之美"
        }
        else{
            txv.text = "手勢辨別"
        }
         */
        gDetector.onTouchEvent(event)
        return true
    }

    override fun onDown(p0: MotionEvent): Boolean {

        return true
    }

    override fun onShowPress(p0: MotionEvent) {

    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {

        return true
    }

    override fun onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Float, distanceY: Float): Boolean {
        //txv.text = "拖曳"
        if (distanceY >= 0){

        }
        else{

        }
        return true
    }

    override fun onLongPress(p0: MotionEvent) {
        txv.text = "長按"
    }

    override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
        //txv.text = "快滑"
        if (e1.x <= e2.x){
            txv.text = word
            count++
            count1++
            if(count1==1) {
                word = "我叫顏偉森，目前就讀靜宜大學資訊管理學系二年級"
            }
            if(count1==2) {
                word = "家住高雄市，我的家庭共有五個人，我的母親是一名會計師\n" +
                        "父親是送貨員，我從小就喜歡跟老師頂嘴\n" +
                        "這或許是那時候的我為了吸引注意力而做的蠢事吧!!"
            }
            if(count1==3) {
                word = "我從國中開始就不知道為甚麼不愛講話，個性也變得很內向，\n" +
                        "到了高中我的內向越來越嚴重，我甚至不敢和店員說話\n" +
                        "也因為如此我從高中開始都沒交過女朋友"
            }
            if(count1==4) {
                word = "我是個熱愛排球不久的一位青少年，但也20歲了，面臨老化的危機\n" +
                        "我在上大學之前是一個不敢主動跟別人說話的人\n" +
                        "是一個很內向的人，但我加入系排後，認識了一堆人，也讓我在球\n" +
                        "場上結識了許多強大的對手，我的隊友教會了我如何表達自己想法\n" +
                        "讓我感受到隊友的支持，排球真的很好玩。"
            }
            if(count1==5) {
                word = "因為我是個內向的人，所以我很少參加多人的活動，只想一個人呆著\n" +
                        "理所當然的是我在大學之前朋友都很少，不敢主動開口說話，這造\n" +
                        "就了我有想法時都不開口，導致沒人理解我。"
            }
            if(count1==6) {
                word = "我是一個對許多事物充滿好奇心的孩子，在遇到許多新的事物時，我\n" +
                        "都會想要去解開裡頭的答案。在每一次的活動或報告時，我都會在裡\n" +
                        "頭吸收到經驗。像是電腦課要拍影片的作業，我學會去安排劇情的大\n" +
                        "鋼以及看透對成員們的專長。"
            }
            if(count1==7) {
                word = "我會運用邏輯思考的能力來探討問題和解決問題，雖然有時候會把問\n" +
                        "題想得越來越複雜，但我覺得透過思考得到答案比等待答案更有意義\n" +
                        "那怕會遇到挫折我都不會放棄。因為我知道只有嘗試過了才會有所\n" +
                        "成長，一昧的膽怯只會令自己停滯不前。"
            }
            if(count1==8) {
                word = "有時心裡都在想說，為甚麼要接觸到我這個年紀不應該接觸到的事物\n" +
                        "難道不能給我一場意外，讓我忘記所有人和事，這樣我就不用每天煩東煩西的"
            }
            if(count1==9) {
                word = "目前的我不但沒有找到想要做的事，還被感情給騷擾了我的生活\n" +
                        "每天困擾著要跟他聊什麼，只為了讓他理我，並在這段時間內佔有他"
            }
            if(count1==10) {
                word = "現在的我，越來越不像以前的我，離朋友也越來越遠了\n" +
                        "有時想說回到以前那個沒有煩惱的時間多好，至少可以不被別人干擾\n" +
                        "每天都被壓得自己滿身疲憊才甘願，但還是沒有結果，終究是自己咎由自取"
            }
            if(count1==11) {
                word = "謝謝大家的觀看!!"
                count1=0
            }
            if(count>5) {
                count = 0
            }
        }
        else{
            txv.text = "謝謝大家的觀看!!"
        }
        var res:Int = getResources().getIdentifier("pu" + count.toString(),
            "drawable", getPackageName())
        findViewById<LinearLayout>(R.id.bg).setBackgroundResource(res)
        return true
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (v==img1){
            txv.text = "精靈1"
        }
        else{
            txv.text = "精靈2"
        }
        if (event?.action == MotionEvent.ACTION_MOVE){
            v?.x = event.rawX - v!!.width/2
            v?.y = event.rawY - v!!.height/2
        }

        var r1: Rect = Rect(img1.x.toInt(), img1.y.toInt(),
            img1.x.toInt() + img1.width, img1.y.toInt() + img1.height)
        var r2: Rect = Rect(img2.x.toInt(), img2.y.toInt(),
            img2.x.toInt() + img2.width, img2.y.toInt() + img2.height)

        if(r1.intersect(r2)) {
            txv.text = "碰撞"
        }

        return true

    }

}