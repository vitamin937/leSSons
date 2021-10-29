package ru.geek1.lesson8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map extends JPanel {

    public static final int MODE_H_V_A = 0;
    public static final int MODE_H_V_H = 1;

    // 24.1 чтобы заполнить поле
    int[][] field;
    int fieldSizeX;
    int fieldSizeY;
    int winLeght;
    // 25 высота и ширина каждоый ячейки
    int cellheight;
    int cellWidth;

    // 27 если ничего не нарисовано
    boolean isInitialized = false;

    // 10 создаем конструктор и задаем цвет поля
    Map() {
        setBackground(Color.CYAN);
        // 30 создаем слушателя шелчка мышки
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
    }

    // 31 создаем метод который определяем куда щелкнули
    void update(MouseEvent e) {
        // пиксели делим на ширину и высоту
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellheight;

        System.out.println("x: " + cellX + " y: " + cellY);

        // после каждого действия перерисовываем
        repaint();
    }

    // 24 метод для рисования нашего поля в целом
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    // 11 создаем метод который говорит о типе игры, размеры поля, и выиграшная длина
    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength){
        // заглушка
        System.out.println("mode = " + mode +
                " fsX = " + fieldSizeX +
                " fsy = " + fieldSizeY +
                " winlen = " + winLength);
        //25 запоняем поля при старте новой игры
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winLeght = winLength;
        field = new int[fieldSizeY][fieldSizeX];

        isInitialized = true;
        // 28 говорим панели перерисоваться
        repaint();
    }

    // 24.1 метод для рисование
    void render(Graphics g) {
        if(!isInitialized) return;

        int panelWidth = getWidth();
        int panelHeigt = getHeight();
        // узнаем кол-во ечеек
        cellheight = panelHeigt /fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;

        // 26 отрисовываем по Y (горизонтальные полоски)
        for(int i = 0; i < fieldSizeY; i++) {
            int y = i * cellheight;
            g.drawLine(0, y, panelWidth, y);
        }

        // 29 отрисовываем по X (вертикальные полоски)
        for(int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeigt);
        }
    }
}