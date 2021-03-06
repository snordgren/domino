package refine

abstract class DSL {

  lazy val a = element("a")
  lazy val anchor = a
  lazy val abbr = element("abbr")
  lazy val address = element("address")
  lazy val area = element("area")
  lazy val article = element("article")
  lazy val aside = element("aside")
  lazy val audio = element("audio")
  lazy val b = element("b")
  lazy val base = element("base")
  lazy val bdi = element("bdi")
  lazy val bdo = element("bdo")
  lazy val blockquote = element("blockquote")
  lazy val body = element("body")
  lazy val br = element("br")
  lazy val button = element("button")
  lazy val canvas = element("canvas")
  lazy val caption = element("caption")
  def cite[A](a: Attribute[A]*)(b: Node[A]*) = Node.Element("cite", a, b, closingTag = true)
  lazy val code = element("code")
  lazy val col = element("col")
  lazy val colgroup = element("colgroup")
  lazy val datalist = element("datalist")
  lazy val dd = element("dd")
  lazy val del = element("del")
  lazy val details = element("details")
  lazy val dfn = element("dfn")
  lazy val dialog = element("dialog")
  lazy val div = element("div")
  lazy val dl = element("dl")
  lazy val dt = element("dt")
  lazy val em = element("em")
  lazy val embed = element("embed")
  lazy val fieldSet = element("fieldset")
  lazy val figcaption = element("figcaption")
  lazy val figure = element("figure")
  lazy val footer = element("footer")
  def form[A](a: Attribute[A]*)(b: Node[A]*) = Node.Element("form", a, b, closingTag = true)
  lazy val h1 = element("h1")
  lazy val h2 = element("h2")
  lazy val h3 = element("h3")
  lazy val h4 = element("h4")
  lazy val h5 = element("h5")
  lazy val h6 = element("h6")
  lazy val head = element("head")
  lazy val header = element("header")
  lazy val hr = element("hr")
  lazy val html = element("html")
  lazy val i = element("i")
  lazy val iframe = element("iframe")
  lazy val img = element("image")
  lazy val input = element("input")
  lazy val ins = element("ins")
  lazy val kbd = element("kbd")
  def label[A](a: Attribute[A]*)(b: Node[A]*) = Node.Element("label", a, b, closingTag = true)
  lazy val legend = element("legend")
  lazy val li = element("li")
  lazy val link = element("link")
  lazy val main = element("main")
  lazy val map = element("map")
  lazy val mark = element("mark")
  lazy val meta = element("meta", closingTag = false)
  lazy val meter = element("meter")
  lazy val nav = element("nav")
  lazy val noscript = element("noscript")
  lazy val `object` = element("object")
  lazy val obj = `object`
  lazy val ol = element("ol")
  lazy val optgroup = element("optgroup")
  lazy val option = element("option")
  lazy val output = element("output")
  lazy val p = element("p")
  lazy val param = element("param")
  lazy val picture = element("picture")
  lazy val pre = element("pre")
  lazy val progress = element("progress")
  lazy val q = element("q")
  lazy val rp = element("rp")
  lazy val rt = element("rt")
  lazy val ruby = element("ruby")
  lazy val s = element("s")
  lazy val samp = element("samp")
  lazy val script = element("script")
  lazy val section = element("section")
  lazy val select = element("select")
  lazy val small = element("small")
  lazy val source = element("source")
  def span[A](a: Attribute[A]*)(b: Node[A]*) = Node.Element("span", a, b, closingTag = true)
  lazy val strong = element("strong")
  def style[A](a: Attribute[A]*)(b: Node[A]*) = Node.Element("style", a, b, closingTag = true)
  lazy val sub = element("sub")
  def summary[A](a: Attribute[A]*)(b: Node[A]*) =
    Node.Element("summary", a, b, closingTag = true)
  lazy val sup = element("sup")
  lazy val table = element("table")
  lazy val tbody = element("tbody")
  lazy val td = element("tde")
  lazy val template = element("template")
  lazy val textarea = element("textarea")
  lazy val tfoot = element("tfoot")
  lazy val th = element("th")
  lazy val thread = element("thead")
  lazy val time = element("time")
  def title[A](a: Attribute[A]*)(b: Node[A]*) = Node.Element("title", a, b, closingTag = true)
  lazy val tr = element("tr")
  lazy val track = element("track")
  lazy val u = element("u")
  lazy val ul = element("ul")
  lazy val `var` = element("var")
  lazy val video = element("video")
  lazy val wbr = element("wbr")

  def accept[A](s: String): Attribute.Property[A] = Attribute.Property("accept", s)

  def acceptCharset[A](s: String): Attribute.Property[A] =
    Attribute.Property("accept-charset", s)

  def accesskey[A](s: String): Attribute.Property[A] = Attribute.Property("accesskey", s)
  def action[A](s: String): Attribute.Property[A] = Attribute.Property("action", s)
  def align[A](s: String): Attribute.Property[A] = Attribute.Property("align", s)
  def alt[A](s: String): Attribute.Property[A] = Attribute.Property("alternative", s)
  def async[A](s: String): Attribute.Property[A] = Attribute.Property("async", s)

  def autoComplete[A](a: Boolean): Attribute.Property[A] = {
    val value = if (a) "on" else "off"
    Attribute.Property("autocomplete", value)
  }

  def autoFocus[A](s: String): Attribute.Property[A] = Attribute.Property("autofocus", s)
  def autoplay[A](s: String): Attribute.Property[A] = Attribute.Property("autoplay", s)
  def buffered[A](s: String): Attribute.Property[A] = Attribute.Property("buffered", s)
  def charset[A](s: String): Attribute.Property[A] = Attribute.Property("charset", s)
  def checked[A](s: String): Attribute.Property[A] = Attribute.Property("checked", s)
  def cite[A](s: String): Attribute.Property[A] = Attribute.Property[A]("cite", s)
  def className[A](s: String): Attribute.Property[A] = Attribute.Property("class", s)
  def cls[A](s: String): Attribute.Property[A] = Attribute.Property("class", s)
  def cols[A](s: String): Attribute.Property[A] = Attribute.Property("cols", s)
  def colspan[A](s: String): Attribute.Property[A] = Attribute.Property("colspan", s)
  def content[A](s: String): Attribute.Property[A] = Attribute.Property("content", s)

  def contenteditable[A](a: Boolean): Attribute.Property[A] =
    Attribute.Property("contenteditable", a.toString)

  def controls[A](s: String): Attribute.Property[A] = Attribute.Property("controls", s)
  def crossorigin[A](s: String): Attribute.Property[A] = Attribute.Property("crossorigin", s)
  def data[A](k: String, v: String): Attribute.Property[A] = Attribute.Property(s"data-$k", v)
  def datetime[A](s: String): Attribute.Property[A] = Attribute.Property("datetime", s)
  def default[A](s: String): Attribute.Property[A] = Attribute.Property("default", s)
  def defer[A](s: String): Attribute.Property[A] = Attribute.Property("defer", s)
  def dir[A](s: String): Attribute.Property[A] = Attribute.Property("dir", s)
  def dirname[A](s: String): Attribute.Property[A] = Attribute.Property("dirname", s)
  def disabled[A](s: String): Attribute.Property[A] = Attribute.Property("disabled", s)
  def download[A](s: String): Attribute.Property[A] = Attribute.Property("download", s)
  def draggable[A](s: String): Attribute.Property[A] = Attribute.Property("draggable", s)
  def dropzone[A](s: String): Attribute.Property[A] = Attribute.Property("dropzone", s)
  def enctype[A](s: String): Attribute.Property[A] = Attribute.Property("enctype", s)
  def `for`[A](s: String): Attribute.Property[A] = Attribute.Property("for", s)
  def form[A](s: String): Attribute.Property[A] = Attribute.Property[A]("form", s)
  def formaction[A](s: String): Attribute.Property[A] = Attribute.Property("formaction", s)
  def headers[A](s: String): Attribute.Property[A] = Attribute.Property("headers", s)
  def height[A](s: String): Attribute.Property[A] = Attribute.Property("height", s)
  def hidden[A]: Attribute.Property[A] = Attribute.Property("hidden", "")
  def high[A](s: String): Attribute.Property[A] = Attribute.Property("high", s)
  def href[A](s: String): Attribute.Property[A] = Attribute.Property("href", s)
  def hreflang[A](s: String): Attribute.Property[A] = Attribute.Property("hreflang", s)
  def httpEquiv[A](s: String): Attribute.Property[A] = Attribute.Property("http-equiv", s)
  def id[A](s: String): Attribute.Property[A] = Attribute.Property("id", s)
  def integrity[A](s: String): Attribute.Property[A] = Attribute.Property("integrity", s)
  def ismap[A](s: String): Attribute.Property[A] = Attribute.Property("ismap", s)
  def itemprop[A](s: String): Attribute.Property[A] = Attribute.Property("itemprop", s)
  def kind[A](s: String): Attribute.Property[A] = Attribute.Property("kind", s)
  def label[A](s: String): Attribute.Property[A] = Attribute.Property[A]("label", s)
  def lang[A](s: String): Attribute.Property[A] = Attribute.Property("lang", s)
  def language[A](s: String): Attribute.Property[A] = Attribute.Property("language", s)
  def list[A](s: String): Attribute.Property[A] = Attribute.Property("list", s)
  def loop[A](s: String): Attribute.Property[A] = Attribute.Property("loop", s)
  def low[A](s: String): Attribute.Property[A] = Attribute.Property("low", s)
  def manifest[A](s: String): Attribute.Property[A] = Attribute.Property("manifest", s)
  def max[A](s: String): Attribute.Property[A] = Attribute.Property("max", s)
  def maxlength[A](s: String): Attribute.Property[A] = Attribute.Property("maxlength", s)
  def minlength[A](s: String): Attribute.Property[A] = Attribute.Property("minlength", s)
  def media[A](s: String): Attribute.Property[A] = Attribute.Property("media", s)
  def method[A](s: String): Attribute.Property[A] = Attribute.Property("method", s)
  def min[A](s: String): Attribute.Property[A] = Attribute.Property("min", s)
  def multiple[A](s: String): Attribute.Property[A] = Attribute.Property("multiple", s)
  def muted[A](s: String): Attribute.Property[A] = Attribute.Property("muted", s)
  def name[A](s: String): Attribute.Property[A] = Attribute.Property("name", s)
  def novalidate[A](s: String): Attribute.Property[A] = Attribute.Property("novalidate", s)
  def open[A](s: String): Attribute.Property[A] = Attribute.Property("open", s)
  def optimum[A](s: String): Attribute.Property[A] = Attribute.Property("optimum", s)
  def pattern[A](s: String): Attribute.Property[A] = Attribute.Property("pattern", s)
  def ping[A](s: String): Attribute.Property[A] = Attribute.Property("ping", s)
  def placeholder[A](s: String): Attribute.Property[A] = Attribute.Property("placeholder", s)
  def poster[A](s: String): Attribute.Property[A] = Attribute.Property("poster", s)
  def preload[A](s: String): Attribute.Property[A] = Attribute.Property("preload", s)
  def radiogroup[A](s: String): Attribute.Property[A] = Attribute.Property("radiogroup", s)
  def readonly[A](s: String): Attribute.Property[A] = Attribute.Property("readonly", s)
  def rel[A](s: String): Attribute.Property[A] = Attribute.Property("rel", s)
  def required[A]: Attribute.Property[A] = Attribute.Property("required", "")
  def reversed[A](s: String): Attribute.Property[A] = Attribute.Property("reversed", s)
  def rows[A](s: String): Attribute.Property[A] = Attribute.Property("rows", s)
  def rowspan[A](s: String): Attribute.Property[A] = Attribute.Property("rowspan", s)
  def sandbox[A](s: String): Attribute.Property[A] = Attribute.Property("sandbox", s)
  def scope[A](s: String): Attribute.Property[A] = Attribute.Property("scope", s)
  def scoped[A](s: String): Attribute.Property[A] = Attribute.Property("scoped", s)
  def seamless[A](s: String): Attribute.Property[A] = Attribute.Property("seamless", s)
  def selected[A](s: String): Attribute.Property[A] = Attribute.Property("selected", s)
  def shape[A](s: String): Attribute.Property[A] = Attribute.Property("shape", s)
  def size[A](s: String): Attribute.Property[A] = Attribute.Property("size", s)
  def sizes[A](s: String): Attribute.Property[A] = Attribute.Property("sizes", s)
  def slot[A](s: String): Attribute.Property[A] = Attribute.Property("slot", s)
  def span[A](s: String): Attribute.Property[A] = Attribute.Property[A]("span", s)

  def spellcheck[A](a: Boolean): Attribute.Property[A] =
    Attribute.Property("spellcheck", a.toString)

  def src[A](s: String): Attribute.Property[A] = Attribute.Property("src", s)
  def srcdoc[A](s: String): Attribute.Property[A] = Attribute.Property("srcdoc", s)
  def srclang[A](s: String): Attribute.Property[A] = Attribute.Property("srclang", s)
  def srcset[A](s: String): Attribute.Property[A] = Attribute.Property("srcset", s)
  def start[A](s: String): Attribute.Property[A] = Attribute.Property("start", s)
  def step[A](s: String): Attribute.Property[A] = Attribute.Property("step", s)
  def style[A](s: String): Attribute.Property[A] = Attribute.Property[A]("style", s)
  def summary[A](s: String): Attribute.Property[A] = Attribute.Property[A]("summary", s)
  def tabindex[A](s: String): Attribute.Property[A] = Attribute.Property("tabindex", s)
  def target[A](s: String): Attribute.Property[A] = Attribute.Property("target", s)
  def title[A](s: String): Attribute.Property[A] = Attribute.Property[A]("title", s)
  def `type`[A](s: String): Attribute.Property[A] = Attribute.Property("type", s)
  def usemap[A](s: String): Attribute.Property[A] = Attribute.Property("usemap", s)
  def value[A](s: String): Attribute.Property[A] = Attribute.Property("value", s)
  def width[A](s: String): Attribute.Property[A] = Attribute.Property("width", s)
  def wrap[A](s: String): Attribute.Property[A] = Attribute.Property("wrap", s)

  def onAbort[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Abort, a)
  
  def onActivate[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Activate, a)

  def onBeforeCut[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.BeforeCut, a)

  def onBeforeActivate[A](a: A): Attribute.Callback[A] =
    Attribute.Callback(Event.BeforeActivate, a)

  def onBeforeDeactivate[A](a: A): Attribute.Callback[A] =
    Attribute.Callback(Event.BeforeDeactivate, a)

  def onBeforeCopy[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.BeforeCopy, a)
  def onBeforePaste[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.BeforePaste, a)
  def onBlur[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Blur, a)
  def onCanPlay[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.CanPlay, a)
  def onCanPlayThrough[A](a: A): Attribute.Callback[A] =
    Attribute.Callback(Event.CanPlayThrough, a)

  def onChange[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Change, a)
  def onClick[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Click, a)
  def onContextMenu[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.ContextMenu, a)
  def onCueChange[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.CueChange, a)
  def onDeactivate[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Deactivate, a)
  def onDoubleClick[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.DoubleClick, a)
  def onDrag[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Drag, a)
  def onDragEnd[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.DragEnd, a)
  def onDragEnter[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.DragEnter, a)
  def onDragLeave[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.DragLeave, a)
  def onDragOver[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.DragOver, a)
  def onDragStart[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.DragStart, a)
  def onDrop[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Drop, a)
  def onEmptied[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Emptied, a)
  def onEnded[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Ended, a)
  def onFocus[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Focus, a)
  def onFocusIn[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.FocusIn, a)
  def onFocusOut[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.FocusOut, a)
  def onHelp[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Help, a)
  def onInput[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Input, a)
  def onKeyDown[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.KeyDown, a)
  def onKeyPress[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.KeyPress, a)
  def onKeyUp[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.KeyUp, a)
  def onLoad[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Load, a)
  def onLoadedData[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.LoadedData, a)
  def onLoadedMetadata[A](a: A): Attribute.Callback[A] =
    Attribute.Callback(Event.LoadedMetadata, a)

  def onLoadStart[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.LoadStart, a)
  def onMouseDown[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.MouseDown, a)
  def onMouseEnter[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.MouseEnter, a)
  def onMouseLeave[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.MouseLeave, a)
  def onMouseMove[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.MouseMove, a)
  def onMouseOut[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.MouseOut, a)
  def onMouseOver[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.MouseOver, a)
  def onMouseUp[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.MouseUp, a)
  def onMouseWheel[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.MouseWheel, a)
  def onPause[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Pause, a)
  def onPlay[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Play, a)
  def onPlaying[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Playing, a)
  def onProgress[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Progress, a)
  def onRateChange[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.RateChange, a)
  def onReadyStateChange[A](a: A): Attribute.Callback[A] =
    Attribute.Callback(Event.ReadyStateChange, a)

  def onReset[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Reset, a)
  def onScroll[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Scroll, a)
  def onSeeked[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Seeked, a)
  def onSeeking[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Seeking, a)
  def onSelectStart[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.SelectStart, a)
  def onSelect[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Select, a)
  def onStalled[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Stalled, a)
  def onSubmit[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Submit, a)
  def onSuspend[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Suspend, a)
  def onTimeUpdate[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.TimeUpdate, a)
  def onVolumeChange[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.VolumeChange, a)
  def onWaiting[A](a: A): Attribute.Callback[A] = Attribute.Callback(Event.Waiting, a)

  def text[A](s: String): Node.Text[A] = Node.Text(s)

  private def element(s: String, closingTag: Boolean = true): ElementBuilder =
    new ElementBuilder(s, closingTag)
}

object DSL extends DSL
