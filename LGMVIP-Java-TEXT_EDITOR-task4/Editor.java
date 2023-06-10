import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.FileSystems;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jdk.jfr.consumer.EventStream;

/**
 *
 * @author abhishek Gupta
 */
public class Editor extends javax.swing.JFrame {

    private String filepath=null;
    
    public Editor() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu8 = new javax.swing.JMenu();
        dfile = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mNew = new javax.swing.JMenuItem();
        mOpen = new javax.swing.JMenuItem();
        mSave = new javax.swing.JMenuItem();
        mSaveas = new javax.swing.JMenuItem();
        mExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mCut = new javax.swing.JMenuItem();
        mCopy = new javax.swing.JMenuItem();
        mPaste = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mSelectall = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        arial = new javax.swing.JMenuItem();
        cal = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        sz1 = new javax.swing.JMenuItem();
        sz2 = new javax.swing.JMenuItem();
        sz3 = new javax.swing.JMenuItem();
        sz4 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        col1 = new javax.swing.JMenuItem();
        col2 = new javax.swing.JMenuItem();
        col3 = new javax.swing.JMenuItem();
        col4 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        bol = new javax.swing.JMenuItem();
        ita = new javax.swing.JMenuItem();
        pla = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        bg1 = new javax.swing.JMenuItem();
        bg2 = new javax.swing.JMenuItem();
        bg3 = new javax.swing.JMenuItem();
        bg4 = new javax.swing.JMenuItem();
        bg5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Editor 2.0");

        txt.setColumns(20);
        txt.setLineWrap(true);
        txt.setRows(5);
        txt.setTabSize(3);
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txt);

        jMenu1.setText("File");

        mNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mNew.setText("New");
        mNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction(evt);
            }
        });
        jMenu1.add(mNew);

        mOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mOpen.setText("Open...");
        mOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction(evt);
            }
        });
        jMenu1.add(mOpen);

        mSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSave.setText("Save");
        mSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction(evt);
            }
        });
        jMenu1.add(mSave);

        mSaveas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSaveas.setText("Save As,,,");
        mSaveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction(evt);
            }
        });
        jMenu1.add(mSaveas);

        mExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mExit.setText("Exit");
        mExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction(evt);
            }
        });
        jMenu1.add(mExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mCut.setText("Cut");
        mCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction(evt);
            }
        });
        jMenu2.add(mCut);

        mCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mCopy.setText("Copy");
        mCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction(evt);
            }
        });
        jMenu2.add(mCopy);

        mPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mPaste.setText("Paste");
        mPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction(evt);
            }
        });
        jMenu2.add(mPaste);
        jMenu2.add(jSeparator1);

        mSelectall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSelectall.setText("Select All");
        mSelectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction(evt);
            }
        });
        jMenu2.add(mSelectall);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Font");

        jMenu5.setText("Font Type");

        arial.setText("Arial");
        arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction2(evt);
            }
        });
        jMenu5.add(arial);

        cal.setText("Calibri");
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction2(evt);
            }
        });
        jMenu5.add(cal);

        jMenu3.add(jMenu5);

        jMenu6.setText("Font Size");

        sz1.setText("8");
        sz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction3(evt);
            }
        });
        jMenu6.add(sz1);

        sz2.setText("12");
        sz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction3(evt);
            }
        });
        jMenu6.add(sz2);

        sz3.setText("15");
        sz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction3(evt);
            }
        });
        jMenu6.add(sz3);

        sz4.setText("18");
        sz4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction3(evt);
            }
        });
        jMenu6.add(sz4);

        jMenu3.add(jMenu6);

        jMenu7.setText("Font Color");

        col1.setText("Black");
        col1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction4(evt);
            }
        });
        jMenu7.add(col1);

        col2.setText("Red");
        col2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction4(evt);
            }
        });
        jMenu7.add(col2);

        col3.setText("Green");
        col3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction4(evt);
            }
        });
        jMenu7.add(col3);

        col4.setText("White");
        col4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction4(evt);
            }
        });
        jMenu7.add(col4);

        jMenu3.add(jMenu7);

        jMenu9.setText("Text Type");

        bol.setText("Bold");
        bol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction5(evt);
            }
        });
        jMenu9.add(bol);

        ita.setText("Italic");
        ita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction5(evt);
            }
        });
        jMenu9.add(ita);

        pla.setText("Plain");
        pla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction5(evt);
            }
        });
        jMenu9.add(pla);

        jMenu3.add(jMenu9);

        jMenu10.setText("Background Color");

        bg1.setText("White");
        bg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction6(evt);
            }
        });
        jMenu10.add(bg1);

        bg2.setText("Black");
        bg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction6(evt);
            }
        });
        jMenu10.add(bg2);

        bg3.setText("Orange");
        bg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction6(evt);
            }
        });
        jMenu10.add(bg3);

        bg4.setText("Pink");
        bg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction6(evt);
            }
        });
        jMenu10.add(bg4);

        bg5.setText("Blue");
        bg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAction6(evt);
            }
        });
        jMenu10.add(bg5);

        jMenu3.add(jMenu10);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");

        jMenuItem10.setText("About");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuAction2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAction2
        
        Object s=evt.getSource();
        if(s==arial)
            txt.setFont(new Font("Arial", txt.getFont().getStyle(), txt.getFont().getSize() ));
        else if(s==cal)
            txt.setFont(new Font("Calibri", txt.getFont().getStyle(),txt.getFont().getSize() ));
    }//GEN-LAST:event_menuAction2

    private void menuAction3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAction3
        
        Object s=evt.getSource();
        
        if(s==sz1)
            txt.setFont(new Font(txt.getFont().getName(), txt.getFont().getStyle(), 8));
        else if(s==sz2)
            txt.setFont(new Font(txt.getFont().getName(), txt.getFont().getStyle(), 12));
        else if(s==sz3)
            txt.setFont(new Font(txt.getFont().getName(), txt.getFont().getStyle(), 15));
        else if(s==sz4)
            txt.setFont(new Font(txt.getFont().getName(), txt.getFont().getStyle(), 18));
    }//GEN-LAST:event_menuAction3

    private void menuAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAction
              
        Object s=evt.getSource();
        
        //FILE MENU
        if(s==mNew)
            newFile();
        else if(s==mOpen)
            openFile();
        else if(s==mSave)
            saveFile();
        else if(s==mSaveas)
            saveFileAs();
        else if(s==mExit)
            System.exit(0);
        
        //EDIT MENU
        else if(s==mCut)
            txt.cut();
        else if(s==mCopy)
            txt.copy();
        else if(s==mPaste)
            txt.paste();
        else if(s==mSelectall)
            txt.selectAll();
    }//GEN-LAST:event_menuAction

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Version 2.0\nCreated by Abhishek Das", "About", 0);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void menuAction4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAction4
        
        Object s=evt.getSource();
        
        if(s==col1)
        {
            txt.setForeground(Color.BLACK);
            txt.setCaretColor(Color.BLACK);
        }
        else if(s==col2)
        {
            txt.setForeground(Color.RED);
            txt.setCaretColor(Color.RED);
        } 
        else if(s==col3)
        {
            txt.setForeground(Color.GREEN);
            txt.setCaretColor(Color.GREEN);  
        }
        else if(s==col4)
        {
            txt.setForeground(Color.WHITE);
            txt.setCaretColor(Color.WHITE);
        }       
    }//GEN-LAST:event_menuAction4

    private void menuAction5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAction5
        
         Object s=evt.getSource();
        
        if(s==bol)
            txt.setFont(new Font(txt.getFont().getName(), Font.BOLD, txt.getFont().getSize()));
        else if(s==ita)
            txt.setFont(new Font(txt.getFont().getName(), Font.ITALIC, txt.getFont().getSize()));
        else if(s==pla)
            txt.setFont(new Font(txt.getFont().getName(), Font.PLAIN, txt.getFont().getSize()));
        
    }//GEN-LAST:event_menuAction5

    private void menuAction6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAction6
        
        Object s=evt.getSource();
        
        if(s==bg1)
            txt.setBackground(Color.WHITE);
        else if(s==bg2)
            txt.setBackground(Color.BLACK);
        else if(s==bg3)
            txt.setBackground(Color.ORANGE);
        else if(s==bg4)
            txt.setBackground(Color.PINK);
        else if(s==bg5)
            txt.setBackground(Color.BLUE);
    }//GEN-LAST:event_menuAction6
    
    //FLAGSHIP FEATURE (User dont need to press tab multiple times)-When the user presses enter I want the cursor to move
    //to a new line, but if they are currently indented by two tabs, then the cursor should stay indented two tabs
    private void txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) 
        {
            try 
            {  
                int caretPosition = txt.getCaretPosition();
                int lineStart = txt.getLineStartOffset(txt.getLineOfOffset(caretPosition));
                
                int indent = getIndentationLevel(txt.getText().substring(lineStart, caretPosition));
                String indentStr = getIndentString(indent);
           
                txt.getDocument().insertString(caretPosition, "\n" + indentStr, null);
                
                evt.consume();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }   
        }
    }//GEN-LAST:event_txtKeyPressed
    private int getIndentationLevel(String text) 
    {
        int level = 0;
        int i = 0;
        while (i < text.length() && (text.charAt(i) == ' ' || text.charAt(i) == '\t')) {
            if (text.charAt(i) == ' ') {
                level++;
            } else {
                level += 10;
            }
            i++;
        }
        return level;
    }
    private String getIndentString(int indent) 
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }
    
    private void newFile()
    {
        if(!txt.getText().isEmpty())
        {
            int r=JOptionPane.showConfirmDialog(this,"Save Current Document?","Question",JOptionPane.YES_NO_OPTION);
            if(r==JOptionPane.YES_OPTION)
                saveFile();
        }
        txt.setText("");
        filepath=null;
    }
    private void openFile()
    {
        if(dfile.showOpenDialog(this)!=JFileChooser.APPROVE_OPTION)
            return;
        newFile();
        try {
            open(dfile.getSelectedFile().getPath());
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    private void open(String file)throws Exception
    {
        BufferedReader in=new BufferedReader(new FileReader(file));
        String sep=System.getProperty("line.separator");
        while(in.ready())
            txt.append(in.readLine()+sep);
        in.close();
        filepath=file;
    }
    private void saveFile()
    {
        if(filepath==null)
        {
            saveFileAs();
            return;
        }
        try{
            BufferedWriter out=new BufferedWriter(new FileWriter(filepath));
            out.write(txt.getText());
            out.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }        
    }
    private void saveFileAs()
    {
        if(dfile.showSaveDialog(this)!=JFileChooser.APPROVE_OPTION)
            return;
        filepath=dfile.getSelectedFile().getPath();
        saveFile();   
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arial;
    private javax.swing.JMenuItem bg1;
    private javax.swing.JMenuItem bg2;
    private javax.swing.JMenuItem bg3;
    private javax.swing.JMenuItem bg4;
    private javax.swing.JMenuItem bg5;
    private javax.swing.JMenuItem bol;
    private javax.swing.JMenuItem cal;
    private javax.swing.JMenuItem col1;
    private javax.swing.JMenuItem col2;
    private javax.swing.JMenuItem col3;
    private javax.swing.JMenuItem col4;
    private javax.swing.JFileChooser dfile;
    private javax.swing.JMenuItem ita;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mCopy;
    private javax.swing.JMenuItem mCut;
    private javax.swing.JMenuItem mExit;
    private javax.swing.JMenuItem mNew;
    private javax.swing.JMenuItem mOpen;
    private javax.swing.JMenuItem mPaste;
    private javax.swing.JMenuItem mSave;
    private javax.swing.JMenuItem mSaveas;
    private javax.swing.JMenuItem mSelectall;
    private javax.swing.JMenuItem pla;
    private javax.swing.JMenuItem sz1;
    private javax.swing.JMenuItem sz2;
    private javax.swing.JMenuItem sz3;
    private javax.swing.JMenuItem sz4;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}