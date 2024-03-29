package ui.homeAndBrowse;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Home1 extends JFrame {
	private JTextField txtSearch;
	private JButton btnHome, btnExit, btnLogin;

	public Home1() {
		super("Swing Music");
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(1280, 720);

		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(232, 232, 232), 2));
		panel1.setBackground(new Color(248, 248, 248));
		panel1.setBounds(0, 0, 270, 690);
		getContentPane().add(panel1);
		panel1.setLayout(null);

		JLabel lblMusicLogo = new JLabel(" Music");
		lblMusicLogo.setIcon(new ImageIcon(Home1.class.getResource("/Images/musicLogo3BlackVer.png")));
		lblMusicLogo.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 30));
		lblMusicLogo.setBounds(22, 10, 158, 64);
		panel1.add(lblMusicLogo);

		txtSearch = new JTextField();
		txtSearch.setBorder(new LineBorder(new Color(232, 232, 232), 2, true));
		txtSearch.setBounds(23, 84, 223, 34);
		panel1.add(txtSearch);
		txtSearch.setColumns(10);

		btnHome = new JButton("  Home");
		btnHome.setContentAreaFilled(false);
		btnHome.setBorderPainted(false);
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 20));
		btnHome.setIcon(new ImageIcon(Home1.class.getResource("/Images/homelogo.png")));
		btnHome.setBounds(22, 136, 223, 34);
		panel1.add(btnHome);

		btnExit = new JButton("  Exit");
		btnExit.setIcon(new ImageIcon(Home2.class.getResource("/Images/exit.png")));
		btnExit.setHorizontalAlignment(SwingConstants.LEFT);
		btnExit.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 20));
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.setBounds(22, 180, 223, 34);
		panel1.add(btnExit);

		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(232, 232, 232), 2));
		panel2.setBackground(new Color(255, 255, 255));
		panel2.setBounds(259, 0, 1017, 77);
		getContentPane().add(panel2);
		panel2.setLayout(null);

		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(255, 255, 255));
		panel3.setBounds(270, 76, 1006, 610);
		getContentPane().add(panel3);
		panel3.setLayout(null);

		JLabel lblMent1 = new JLabel("음악이 필요할 땐, 스윙뮤직.");
		lblMent1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMent1.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 50));
		lblMent1.setBounds(196, 61, 546, 262);
		panel3.add(lblMent1);

		JLabel lblMent2 = new JLabel("지금 바로 로그인 후 즐겨보세요.");
		lblMent2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMent2.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 20));
		lblMent2.setBounds(321, 238, 295, 50);
		panel3.add(lblMent2);

		btnLogin = new JButton("시작하기");
		btnLogin.setBounds(402, 291, 135, 43);
		panel3.add(btnLogin);
		btnLogin.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnLogin.setBorderPainted(false);
		btnLogin.setOpaque(true);
		btnLogin.setContentAreaFilled(true);
		btnLogin.setBackground(new Color(254, 85, 85));
		btnLogin.setFont(new Font("AppleSDGothicNeoB00", Font.PLAIN, 20));
		btnLogin.setForeground(new Color(255, 255, 255));

		JLabel lblMent3 = new JLabel("로그인 전 좌측 상단에서 음악을 검색해보실 수 있습니다.");
		lblMent3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMent3.setForeground(new Color(128, 128, 128));
		lblMent3.setFont(new Font("AppleSDGothicNeoM00", Font.PLAIN, 15));
		lblMent3.setBounds(291, 366, 355, 50);
		panel3.add(lblMent3);

		// 로그아웃 상태에서 로그인 버튼 마우스 클릭
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login().setVisible(true);
			}
		});

		setVisible(true);

		// 로그아웃 상태에서 홈버튼 마우스 클릭
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Home1();
			}
		});

		// 로그아웃 상태에서 서치 텍스트필드에 내용 입력 후 엔터 시 처리
		txtSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Search1();
			}
		});

		// 로그아웃 상태에서 종료 버튼 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Home1();
	}
}