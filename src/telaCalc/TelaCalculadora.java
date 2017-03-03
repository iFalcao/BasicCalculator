package telaCalc;

import java.awt.event.*;
import java.awt.Toolkit;

public class TelaCalculadora extends javax.swing.JFrame {

    double primeiroNumero;
    double segundoNumero;
    double resultado;
    String operacao;

    public TelaCalculadora() {
        initComponents();
       
        inicia();
    }

    private void inicia() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calculadora.png")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JLabel();
        botao7 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botaoSubtracao = new javax.swing.JButton();
        botaoMultiplica = new javax.swing.JButton();
        botaoSoma = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoApaga = new javax.swing.JButton();
        botaoVirgula = new javax.swing.JButton();
        botaoDivide = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botaoAlterador = new javax.swing.JButton();
        telaHistorico = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 300));
        setResizable(false);

        tela.setBackground(new java.awt.Color(255, 255, 255));
        tela.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tela.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tela.setOpaque(true);
        tela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telaKeyPressed(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao7.setText("7");
        botao7.setBorder(null);
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });
        botao7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao7KeyPressed(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao9.setText("9");
        botao9.setBorder(null);
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });
        botao9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao9KeyPressed(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao8.setText("8");
        botao8.setBorder(null);
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });
        botao8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao8KeyPressed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao4.setText("4");
        botao4.setBorder(null);
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });
        botao4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao4KeyPressed(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao6.setText("6");
        botao6.setBorder(null);
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });
        botao6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao6KeyPressed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao5.setText("5");
        botao5.setBorder(null);
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });
        botao5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                botao5KeyTyped(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao2.setText("2");
        botao2.setBorder(null);
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });
        botao2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao2KeyPressed(evt);
            }
        });

        botao1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao1.setText("1");
        botao1.setBorder(null);
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        botao1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao1KeyPressed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao3.setText("3");
        botao3.setBorder(null);
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });
        botao3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao3KeyPressed(evt);
            }
        });

        botaoSubtracao.setBackground(new java.awt.Color(255, 102, 0));
        botaoSubtracao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        botaoSubtracao.setText("-");
        botaoSubtracao.setBorder(null);
        botaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubtracaoActionPerformed(evt);
            }
        });
        botaoSubtracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoSubtracaoKeyPressed(evt);
            }
        });

        botaoMultiplica.setBackground(new java.awt.Color(255, 102, 0));
        botaoMultiplica.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoMultiplica.setForeground(new java.awt.Color(255, 255, 255));
        botaoMultiplica.setText("x");
        botaoMultiplica.setBorder(null);
        botaoMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicaActionPerformed(evt);
            }
        });
        botaoMultiplica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoMultiplicaKeyPressed(evt);
            }
        });

        botaoSoma.setBackground(new java.awt.Color(255, 102, 0));
        botaoSoma.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoSoma.setForeground(new java.awt.Color(255, 255, 255));
        botaoSoma.setText("+");
        botaoSoma.setBorder(null);
        botaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSomaActionPerformed(evt);
            }
        });
        botaoSoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoSomaKeyPressed(evt);
            }
        });

        botao0.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botao0.setText("0");
        botao0.setBorder(null);
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });
        botao0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao0KeyPressed(evt);
            }
        });

        botaoApaga.setBackground(new java.awt.Color(255, 102, 0));
        botaoApaga.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoApaga.setForeground(new java.awt.Color(255, 255, 255));
        botaoApaga.setText("C");
        botaoApaga.setBorder(null);
        botaoApaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagaActionPerformed(evt);
            }
        });
        botaoApaga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoApagaKeyPressed(evt);
            }
        });

        botaoVirgula.setBackground(new java.awt.Color(255, 102, 0));
        botaoVirgula.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoVirgula.setForeground(new java.awt.Color(255, 255, 255));
        botaoVirgula.setText(",");
        botaoVirgula.setBorder(null);
        botaoVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVirgulaActionPerformed(evt);
            }
        });
        botaoVirgula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoVirgulaKeyPressed(evt);
            }
        });

        botaoDivide.setBackground(new java.awt.Color(255, 102, 0));
        botaoDivide.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoDivide.setForeground(new java.awt.Color(255, 255, 255));
        botaoDivide.setText("/");
        botaoDivide.setBorder(null);
        botaoDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivideActionPerformed(evt);
            }
        });
        botaoDivide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoDivideKeyPressed(evt);
            }
        });

        botaoIgual.setBackground(new java.awt.Color(255, 102, 0));
        botaoIgual.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoIgual.setForeground(new java.awt.Color(255, 255, 255));
        botaoIgual.setText("=");
        botaoIgual.setBorder(null);
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });
        botaoIgual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoIgualKeyPressed(evt);
            }
        });

        botaoAlterador.setBackground(new java.awt.Color(255, 102, 0));
        botaoAlterador.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoAlterador.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlterador.setText("+/-");
        botaoAlterador.setBorder(null);
        botaoAlterador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlteradorActionPerformed(evt);
            }
        });
        botaoAlterador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoAlteradorKeyPressed(evt);
            }
        });

        telaHistorico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telaHistorico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telaHistorico.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        telaHistorico.setOpaque(true);

        jLabel1.setText("<html>\n&copy; Developed by Ícaro Falcão.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(botaoMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAlterador, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoApaga, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(telaHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAlterador, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoApaga, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Funcionamento do teclado para todos os botões
    private void apertaTecla (java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode()==KeyEvent.VK_0 || evt.getKeyCode()==KeyEvent.VK_NUMPAD0) {
            botao0.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_1 || evt.getKeyCode()==KeyEvent.VK_NUMPAD1) {
            botao1.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_2 || evt.getKeyCode()==KeyEvent.VK_NUMPAD2) {
            botao2.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_3 || evt.getKeyCode()==KeyEvent.VK_NUMPAD3) {
            botao3.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_4 || evt.getKeyCode()==KeyEvent.VK_NUMPAD4) {
            botao4.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_5 || evt.getKeyCode()==KeyEvent.VK_NUMPAD5) {
            botao5.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_6 || evt.getKeyCode()==KeyEvent.VK_NUMPAD6) {
            botao6.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_7 || evt.getKeyCode()==KeyEvent.VK_NUMPAD7) {
            botao7.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_8 || evt.getKeyCode()==KeyEvent.VK_NUMPAD8) {
            botao8.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_9 || evt.getKeyCode()==KeyEvent.VK_NUMPAD9) {
            botao9.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_MINUS || evt.getKeyCode()==KeyEvent.VK_SUBTRACT) {
            botaoSubtracao.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getKeyCode()==KeyEvent.VK_DELETE ) {
            botaoApaga.doClick();
        }
        else if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            botaoIgual.doClick();
        }
        else if (evt.getKeyCode() == KeyEvent.VK_PERIOD || evt.getKeyCode() == KeyEvent.VK_COMMA) {
            botaoVirgula.doClick();
        }
        else if (evt.getKeyCode() == KeyEvent.VK_PLUS) {
            botaoSoma.doClick();
        }
        else if (evt.getKeyCode() == KeyEvent.VK_DIVIDE || evt.getKeyCode() == KeyEvent.VK_SLASH || evt.getKeyCode() == KeyEvent.VK_BACK_SLASH) {
            botaoDivide.doClick();
        }
        else if (evt.getKeyCode() == KeyEvent.VK_X || evt.getKeyCode() == KeyEvent.VK_MULTIPLY || evt.getKeyCode() == KeyEvent.VK_ASTERISK) {
            botaoMultiplica.doClick();
        }
    }

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        String texto = tela.getText() + botao7.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        String texto = tela.getText() + botao9.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        String texto = tela.getText() + botao8.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        String texto = tela.getText() + botao4.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        String texto = tela.getText() + botao6.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        String texto = tela.getText() + botao5.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        String texto = tela.getText() + botao2.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        String texto = tela.getText() + botao1.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        String texto = tela.getText() + botao3.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao3ActionPerformed

    private void botaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtracaoActionPerformed
        if (tela.getText() == "") {
            tela.setText("-");
        } else {
            primeiroNumero = Double.parseDouble(tela.getText().replace(',', '.'));
            operacao = "-";
            tela.setText("");
            String historico = String.valueOf(primeiroNumero) + " -";
            telaHistorico.setText(historico);
        }
    }//GEN-LAST:event_botaoSubtracaoActionPerformed

    private void botaoMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicaActionPerformed
        primeiroNumero = Double.parseDouble(tela.getText().replace(',', '.'));
        operacao = "x";
        tela.setText("");
        String historico = String.valueOf(primeiroNumero) + " x";
        telaHistorico.setText(historico);
    }//GEN-LAST:event_botaoMultiplicaActionPerformed

    private void botaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSomaActionPerformed
        if (tela.getText() == "") {
            tela.setText("+");
        } else {
            primeiroNumero = Double.parseDouble(tela.getText().replace(',', '.'));
            operacao = "+";
            tela.setText("");
            String historico = String.valueOf(primeiroNumero) + " +";
            telaHistorico.setText(historico);
        }
    }//GEN-LAST:event_botaoSomaActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        String texto = tela.getText() + botao0.getText();
        tela.setText(texto);
    }//GEN-LAST:event_botao0ActionPerformed

    private void botaoApagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagaActionPerformed
        tela.setText("");
        telaHistorico.setText("");
        primeiroNumero = 0;
        segundoNumero = 0;
    }//GEN-LAST:event_botaoApagaActionPerformed

    private void botaoVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVirgulaActionPerformed
        String texto = tela.getText() + ",";
        tela.setText(texto);
    }//GEN-LAST:event_botaoVirgulaActionPerformed

    private void botaoDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivideActionPerformed
        primeiroNumero = Double.parseDouble(tela.getText().replace(',', '.'));
        operacao = "/";
        tela.setText("");
        String historico = String.valueOf(primeiroNumero) + " /";
        telaHistorico.setText(historico);
    }//GEN-LAST:event_botaoDivideActionPerformed

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        segundoNumero = Double.parseDouble(tela.getText().replace(',', '.'));

        if (operacao.equals("-")) {
            resultado = primeiroNumero - segundoNumero;
        } else if (operacao.equals("x")) {
            resultado = primeiroNumero * segundoNumero;
        } else if (operacao.equals("+")) {
            resultado = primeiroNumero + segundoNumero;
        } else if (operacao.equals("/")) {
            resultado = primeiroNumero / segundoNumero;
        }

        primeiroNumero = resultado;

        if (resultado > Math.floor(resultado)) {
            String resposta = String.format("%.2f", resultado);
            tela.setText(resposta);
        } else {
            String resposta = String.format("%.0f", resultado);
            tela.setText(resposta);
        }
        telaHistorico.setText("");
    }//GEN-LAST:event_botaoIgualActionPerformed

    private void botaoAlteradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlteradorActionPerformed
        double atual = Double.parseDouble(tela.getText().replace(',', '.'));
        atual *= -1;
        tela.setText(String.valueOf(atual).replace('.', ','));
    }//GEN-LAST:event_botaoAlteradorActionPerformed

    private void telaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telaKeyPressed
        
    }//GEN-LAST:event_telaKeyPressed

    private void botao5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao5KeyTyped

    }//GEN-LAST:event_botao5KeyTyped

    private void botao5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao5KeyPressed
        apertaTecla(evt);
    }//GEN-LAST:event_botao5KeyPressed

    private void botao7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao7KeyPressed
        apertaTecla(evt);     
    }//GEN-LAST:event_botao7KeyPressed

    private void botao8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao8KeyPressed
        apertaTecla(evt);    
    }//GEN-LAST:event_botao8KeyPressed

    private void botao9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao9KeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botao9KeyPressed

    private void botao4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao4KeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botao4KeyPressed

    private void botao6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao6KeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botao6KeyPressed

    private void botao1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao1KeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botao1KeyPressed

    private void botao2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao2KeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botao2KeyPressed

    private void botao3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao3KeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botao3KeyPressed

    private void botao0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao0KeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botao0KeyPressed

    private void botaoVirgulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoVirgulaKeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botaoVirgulaKeyPressed

    private void botaoIgualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoIgualKeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botaoIgualKeyPressed

    private void botaoSomaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoSomaKeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botaoSomaKeyPressed

    private void botaoSubtracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoSubtracaoKeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botaoSubtracaoKeyPressed

    private void botaoMultiplicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoMultiplicaKeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botaoMultiplicaKeyPressed

    private void botaoDivideKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoDivideKeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botaoDivideKeyPressed

    private void botaoAlteradorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoAlteradorKeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botaoAlteradorKeyPressed

    private void botaoApagaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoApagaKeyPressed
        apertaTecla(evt); 
    }//GEN-LAST:event_botaoApagaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoAlterador;
    private javax.swing.JButton botaoApaga;
    private javax.swing.JButton botaoDivide;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMultiplica;
    private javax.swing.JButton botaoSoma;
    private javax.swing.JButton botaoSubtracao;
    private javax.swing.JButton botaoVirgula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tela;
    private javax.swing.JLabel telaHistorico;
    // End of variables declaration//GEN-END:variables
}
