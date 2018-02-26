package domino.dom

case class EventAttributeFactory[A, B](newAttribute: A => B) {
  def apply(f: A): B =
    newAttribute(f)
}

object events {
  val onAbort = EventAttributeFactory(OnAbort)
  val onActivate = EventAttributeFactory(OnActivate)
  val onBeforeCut = EventAttributeFactory(OnBeforeCut)
  val onBeforeActivate = EventAttributeFactory(OnBeforeActivate)
  val onBeforeDeactivate = EventAttributeFactory(OnBeforeDeactivate)
  val onBeforeCopy = EventAttributeFactory(OnBeforeCopy)
  val onBeforePaste = EventAttributeFactory(OnBeforePaste)
  val onBlur = EventAttributeFactory(OnBlur)
  val onCanPlay = EventAttributeFactory(OnCanPlay)
  val onCanPlayThrough = EventAttributeFactory(OnCanPlayThrough)
  val onChange = EventAttributeFactory(OnChange)
  val onClick = EventAttributeFactory(OnClick)
  val onContextMenu = EventAttributeFactory(OnContextMenu)
  val onCueChange = EventAttributeFactory(OnCueChange)
  val onDeactivate = EventAttributeFactory(OnDeactivate)
  val onDoubleClick = EventAttributeFactory(OnDoubleClick)
  val onDrag = EventAttributeFactory(OnDrag)
  val onDragEnd = EventAttributeFactory(OnDragEnd)
  val onDragEnter = EventAttributeFactory(OnDragEnter)
  val onDragLeave = EventAttributeFactory(OnDragLeave)
  val onDragOver = EventAttributeFactory(OnDragOver)
  val onDragStart = EventAttributeFactory(OnDragStart)
  val onDrop = EventAttributeFactory(OnDrop)
  val onEmptied = EventAttributeFactory(OnEmptied)
  val onEnded = EventAttributeFactory(OnEnded)
  val onFocus = EventAttributeFactory(OnFocus)
  val onFocusIn = EventAttributeFactory(OnFocusIn)
  val onFocusOut = EventAttributeFactory(OnFocusOut)
  val onHelp = EventAttributeFactory(OnHelp)
  val onInput = EventAttributeFactory(OnInput)
  val onKeyDown = EventAttributeFactory(OnKeyDown)
  val onKeyPress = EventAttributeFactory(OnKeyPress)
  val onKeyUp = EventAttributeFactory(OnKeyUp)
  val onLoad = EventAttributeFactory(OnLoad)
  val onLoadedData = EventAttributeFactory(OnLoadedData)
  val onLoadedMetadata = EventAttributeFactory(OnLoadedMetadata)
  val onLoadStart = EventAttributeFactory(OnLoadStart)
  val onMouseDown = EventAttributeFactory(OnMouseDown)
  val onMouseEnter = EventAttributeFactory(OnMouseEnter)
  val onMouseLeave = EventAttributeFactory(OnMouseLeave)
  val onMouseMove = EventAttributeFactory(OnMouseMove)
  val onMouseOut = EventAttributeFactory(OnMouseOut)
  val onMouseOver = EventAttributeFactory(OnMouseOver)
  val onMouseUp = EventAttributeFactory(OnMouseUp)
  val onMouseWheel = EventAttributeFactory(OnMouseWheel)
  val onPause = EventAttributeFactory(OnPause)
  val onPlay = EventAttributeFactory(OnPlay)
  val onPlaying = EventAttributeFactory(OnPlaying)
  val onProgress = EventAttributeFactory(OnProgress)
  val onRateChange = EventAttributeFactory(OnRateChange)
  val onReadyStateChange = EventAttributeFactory(OnReadyStateChange)
  val onReset = EventAttributeFactory(OnReset)
  val onScroll = EventAttributeFactory(OnScroll)
  val onSeeked = EventAttributeFactory(OnSeeked)
  val onSeeking = EventAttributeFactory(OnSeeking)
  val onSelectStart = EventAttributeFactory(OnSelectStart)
  val onSelect = EventAttributeFactory(OnSelect)
  val onStalled = EventAttributeFactory(OnStalled)
  val onSubmit = EventAttributeFactory(OnSubmit)
  val onSuspend = EventAttributeFactory(OnSuspend)
  val onTimeUpdate = EventAttributeFactory(OnTimeUpdate)
  val onVolumeChange = EventAttributeFactory(OnVolumeChange)
  val onWaiting = EventAttributeFactory(OnWaiting)
}
