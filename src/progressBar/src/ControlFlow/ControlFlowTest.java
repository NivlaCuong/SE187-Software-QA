//package progressBar.src.ControlFlow;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class ControlFlowTest {
//  public JComponent makeUI() {
//    JProgressBar progress = new JProgressBar();
//    // use JProgressBar#setUI(...) method
//    progress.setUI(new ControlFlow.ControlFlowUI());
//    progress.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
//    progress.setStringPainted(true);
//    progress.setFont(progress.getFont().deriveFont(24f));
//    progress.setForeground(Color.RED);
//
//    (new Timer(50, e -> {
//      int iv = Math.min(100, progress.getValue() + 1);
//      progress.setValue(iv);
//    })).start();
//
//    JPanel p = new JPanel();
//    p.add(progress);
//    return p;
//  }
//
//  public static void main(String... args) {
//    EventQueue.invokeLater(() -> {
//      JFrame f = new JFrame();
//      f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//      f.getContentPane().add(new ControlFlowTest().makeUI());
////      f.setSize(320, 240);
//      f.setSize(500,500);
//      f.setLocationRelativeTo(null);
//      f.setVisible(true);
//    });
//  }
//}