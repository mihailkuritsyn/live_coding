package youtube.jenkow_concurrency.happens_before;

public class FrameExchanger {

  public long framesStoredCount = 0;
  public long framesTakenCount = 0;

  private volatile boolean hasNewFrame = false;
//  private boolean hasNewFrame = false;

  private Frame frame = null;

  // called by Frame producing thread
  public void storeFrame(Frame frame) {
    this.frame = frame;
    this.framesStoredCount++;
    this.hasNewFrame = true;
  }

  // called by Frame drawing thread
  public Frame takeFrame() {
    while (!hasNewFrame) {
      //busy wait until new frame arrives
    }

    Frame newFrame = this.frame;
    this.framesTakenCount++;
    this.hasNewFrame = false;
    return newFrame;
  }

}