// public class FPS {
// void init();
//         while (true) {
//             long time = System.currentTimeMillis();
//             tick();
//             long now = System.currentTimeMillis();
//             long elapsed = (now - time);
//             long sleepTime = 1000 / getMaxFPS() - elapsed;
//             try {
//                 if (sleepTime > 0) {
//                     Thread.sleep(sleepTime);
//                     //System.out.println("FPS: " + getMaxFPS());
//                 }/* else
//                     System.out.println("FPS: " + 1000 / elapsed);*/
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//         private void tick() {
//         }
//         private int getMaxFPS() {
//             return 0;
//         }
// }

