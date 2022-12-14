namespace CSharp_teamProject
{
    partial class MainForm
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(MainForm));
            System.Windows.Forms.DataVisualization.Charting.ChartArea chartArea6 = new System.Windows.Forms.DataVisualization.Charting.ChartArea();
            System.Windows.Forms.DataVisualization.Charting.Legend legend6 = new System.Windows.Forms.DataVisualization.Charting.Legend();
            System.Windows.Forms.DataVisualization.Charting.Series series16 = new System.Windows.Forms.DataVisualization.Charting.Series();
            System.Windows.Forms.DataVisualization.Charting.Series series17 = new System.Windows.Forms.DataVisualization.Charting.Series();
            System.Windows.Forms.DataVisualization.Charting.Series series18 = new System.Windows.Forms.DataVisualization.Charting.Series();
            this.Mainpanel1 = new System.Windows.Forms.Panel();
            this.panel_side = new System.Windows.Forms.Panel();
            this.Mainlabel1 = new System.Windows.Forms.Label();
            this.Mainbutton4 = new System.Windows.Forms.Button();
            this.Mainbutton3 = new System.Windows.Forms.Button();
            this.Mainbutton2 = new System.Windows.Forms.Button();
            this.MainColorPanel = new System.Windows.Forms.Panel();
            this.Mainlabel2 = new System.Windows.Forms.Label();
            this.Mainbutton1 = new System.Windows.Forms.Button();
            this.MainpictureBox1 = new System.Windows.Forms.PictureBox();
            this.Mainbutton_x = new System.Windows.Forms.Button();
            this.Mainpanel2 = new System.Windows.Forms.Panel();
            this.main_timer = new System.Windows.Forms.Label();
            this.Mainbutton_share = new System.Windows.Forms.Button();
            this.Mainbutton_setting = new System.Windows.Forms.Button();
            this.Mainbutton_alarm = new System.Windows.Forms.Button();
            this.analysis_pictureBox = new System.Windows.Forms.PictureBox();
            this.chart1 = new System.Windows.Forms.DataVisualization.Charting.Chart();
            this.Commercial_pictureBox = new System.Windows.Forms.PictureBox();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.Mainpanel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.MainpictureBox1)).BeginInit();
            this.Mainpanel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.analysis_pictureBox)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.chart1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Commercial_pictureBox)).BeginInit();
            this.SuspendLayout();
            // 
            // Mainpanel1
            // 
            this.Mainpanel1.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.Mainpanel1.Controls.Add(this.panel_side);
            this.Mainpanel1.Controls.Add(this.Mainlabel1);
            this.Mainpanel1.Controls.Add(this.Mainbutton4);
            this.Mainpanel1.Controls.Add(this.Mainbutton3);
            this.Mainpanel1.Controls.Add(this.Mainbutton2);
            this.Mainpanel1.Controls.Add(this.MainColorPanel);
            this.Mainpanel1.Controls.Add(this.Mainlabel2);
            this.Mainpanel1.Controls.Add(this.Mainbutton1);
            this.Mainpanel1.Controls.Add(this.MainpictureBox1);
            this.Mainpanel1.Location = new System.Drawing.Point(1, 0);
            this.Mainpanel1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainpanel1.Name = "Mainpanel1";
            this.Mainpanel1.Size = new System.Drawing.Size(155, 562);
            this.Mainpanel1.TabIndex = 1;
            // 
            // panel_side
            // 
            this.panel_side.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(192)))), ((int)(((byte)(255)))));
            this.panel_side.Location = new System.Drawing.Point(0, 158);
            this.panel_side.Name = "panel_side";
            this.panel_side.Size = new System.Drawing.Size(19, 100);
            this.panel_side.TabIndex = 20;
            // 
            // Mainlabel1
            // 
            this.Mainlabel1.AutoSize = true;
            this.Mainlabel1.Font = new System.Drawing.Font("Microsoft Sans Serif", 16.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Mainlabel1.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainlabel1.Location = new System.Drawing.Point(45, 90);
            this.Mainlabel1.Name = "Mainlabel1";
            this.Mainlabel1.Size = new System.Drawing.Size(46, 26);
            this.Mainlabel1.TabIndex = 1;
            this.Mainlabel1.Text = "흥해";
            // 
            // Mainbutton4
            // 
            this.Mainbutton4.BackColor = System.Drawing.Color.AliceBlue;
            this.Mainbutton4.FlatAppearance.BorderSize = 0;
            this.Mainbutton4.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton4.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.Mainbutton4.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton4.Image")));
            this.Mainbutton4.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Mainbutton4.Location = new System.Drawing.Point(20, 458);
            this.Mainbutton4.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton4.Name = "Mainbutton4";
            this.Mainbutton4.Size = new System.Drawing.Size(135, 100);
            this.Mainbutton4.TabIndex = 6;
            this.Mainbutton4.Text = "Admin";
            this.Mainbutton4.UseVisualStyleBackColor = false;
            this.Mainbutton4.Click += new System.EventHandler(this.Mainbutton4_Click);
            // 
            // Mainbutton3
            // 
            this.Mainbutton3.BackColor = System.Drawing.Color.AliceBlue;
            this.Mainbutton3.FlatAppearance.BorderSize = 0;
            this.Mainbutton3.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton3.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.Mainbutton3.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton3.Image")));
            this.Mainbutton3.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Mainbutton3.Location = new System.Drawing.Point(20, 358);
            this.Mainbutton3.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton3.Name = "Mainbutton3";
            this.Mainbutton3.Size = new System.Drawing.Size(135, 100);
            this.Mainbutton3.TabIndex = 5;
            this.Mainbutton3.Text = "Weather";
            this.Mainbutton3.UseVisualStyleBackColor = false;
            this.Mainbutton3.Click += new System.EventHandler(this.Mainbutton3_Click);
            // 
            // Mainbutton2
            // 
            this.Mainbutton2.BackColor = System.Drawing.Color.AliceBlue;
            this.Mainbutton2.FlatAppearance.BorderSize = 0;
            this.Mainbutton2.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton2.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.Mainbutton2.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton2.Image")));
            this.Mainbutton2.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Mainbutton2.Location = new System.Drawing.Point(20, 258);
            this.Mainbutton2.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton2.Name = "Mainbutton2";
            this.Mainbutton2.Size = new System.Drawing.Size(135, 100);
            this.Mainbutton2.TabIndex = 4;
            this.Mainbutton2.Text = "Hotel";
            this.Mainbutton2.UseVisualStyleBackColor = false;
            this.Mainbutton2.Click += new System.EventHandler(this.Mainbutton2_Click);
            // 
            // MainColorPanel
            // 
            this.MainColorPanel.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.MainColorPanel.Location = new System.Drawing.Point(0, 140);
            this.MainColorPanel.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.MainColorPanel.Name = "MainColorPanel";
            this.MainColorPanel.Size = new System.Drawing.Size(155, 18);
            this.MainColorPanel.TabIndex = 1;
            // 
            // Mainlabel2
            // 
            this.Mainlabel2.AutoSize = true;
            this.Mainlabel2.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Mainlabel2.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainlabel2.Location = new System.Drawing.Point(86, 117);
            this.Mainlabel2.Name = "Mainlabel2";
            this.Mainlabel2.Size = new System.Drawing.Size(44, 17);
            this.Mainlabel2.TabIndex = 3;
            this.Mainlabel2.Text = "흥해라";
            // 
            // Mainbutton1
            // 
            this.Mainbutton1.BackColor = System.Drawing.Color.AliceBlue;
            this.Mainbutton1.FlatAppearance.BorderSize = 0;
            this.Mainbutton1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton1.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.Mainbutton1.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton1.Image")));
            this.Mainbutton1.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Mainbutton1.Location = new System.Drawing.Point(20, 158);
            this.Mainbutton1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton1.Name = "Mainbutton1";
            this.Mainbutton1.Size = new System.Drawing.Size(135, 100);
            this.Mainbutton1.TabIndex = 0;
            this.Mainbutton1.Text = "Main";
            this.Mainbutton1.UseVisualStyleBackColor = false;
            this.Mainbutton1.Click += new System.EventHandler(this.Mainbutton1_Click);
            // 
            // MainpictureBox1
            // 
            this.MainpictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("MainpictureBox1.Image")));
            this.MainpictureBox1.Location = new System.Drawing.Point(-32, 0);
            this.MainpictureBox1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.MainpictureBox1.Name = "MainpictureBox1";
            this.MainpictureBox1.Size = new System.Drawing.Size(222, 141);
            this.MainpictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.MainpictureBox1.TabIndex = 2;
            this.MainpictureBox1.TabStop = false;
            // 
            // Mainbutton_x
            // 
            this.Mainbutton_x.FlatAppearance.BorderSize = 0;
            this.Mainbutton_x.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton_x.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton_x.Image")));
            this.Mainbutton_x.Location = new System.Drawing.Point(845, 0);
            this.Mainbutton_x.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton_x.Name = "Mainbutton_x";
            this.Mainbutton_x.Size = new System.Drawing.Size(33, 27);
            this.Mainbutton_x.TabIndex = 1;
            this.Mainbutton_x.UseVisualStyleBackColor = true;
            this.Mainbutton_x.Click += new System.EventHandler(this.Mainbutton_x_Click);
            // 
            // Mainpanel2
            // 
            this.Mainpanel2.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.Mainpanel2.Controls.Add(this.Mainbutton_share);
            this.Mainpanel2.Controls.Add(this.Mainbutton_setting);
            this.Mainpanel2.Controls.Add(this.Mainbutton_alarm);
            this.Mainpanel2.Controls.Add(this.Mainbutton_x);
            this.Mainpanel2.Location = new System.Drawing.Point(156, 0);
            this.Mainpanel2.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainpanel2.Name = "Mainpanel2";
            this.Mainpanel2.Size = new System.Drawing.Size(878, 35);
            this.Mainpanel2.TabIndex = 2;
            // 
            // main_timer
            // 
            this.main_timer.AutoSize = true;
            this.main_timer.Location = new System.Drawing.Point(911, 540);
            this.main_timer.Name = "main_timer";
            this.main_timer.Size = new System.Drawing.Size(33, 12);
            this.main_timer.TabIndex = 19;
            this.main_timer.Text = "timer";
            // 
            // Mainbutton_share
            // 
            this.Mainbutton_share.FlatAppearance.BorderSize = 0;
            this.Mainbutton_share.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton_share.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton_share.Image")));
            this.Mainbutton_share.Location = new System.Drawing.Point(730, 0);
            this.Mainbutton_share.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton_share.Name = "Mainbutton_share";
            this.Mainbutton_share.Size = new System.Drawing.Size(33, 27);
            this.Mainbutton_share.TabIndex = 4;
            this.Mainbutton_share.UseVisualStyleBackColor = true;
            this.Mainbutton_share.Click += new System.EventHandler(this.Mainbutton_share_Click);
            // 
            // Mainbutton_setting
            // 
            this.Mainbutton_setting.FlatAppearance.BorderSize = 0;
            this.Mainbutton_setting.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton_setting.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton_setting.Image")));
            this.Mainbutton_setting.Location = new System.Drawing.Point(768, 0);
            this.Mainbutton_setting.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton_setting.Name = "Mainbutton_setting";
            this.Mainbutton_setting.Size = new System.Drawing.Size(33, 27);
            this.Mainbutton_setting.TabIndex = 3;
            this.Mainbutton_setting.UseVisualStyleBackColor = true;
            // 
            // Mainbutton_alarm
            // 
            this.Mainbutton_alarm.FlatAppearance.BorderSize = 0;
            this.Mainbutton_alarm.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton_alarm.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton_alarm.Image")));
            this.Mainbutton_alarm.Location = new System.Drawing.Point(807, 0);
            this.Mainbutton_alarm.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton_alarm.Name = "Mainbutton_alarm";
            this.Mainbutton_alarm.Size = new System.Drawing.Size(33, 27);
            this.Mainbutton_alarm.TabIndex = 2;
            this.Mainbutton_alarm.UseVisualStyleBackColor = true;
            // 
            // analysis_pictureBox
            // 
            this.analysis_pictureBox.Image = ((System.Drawing.Image)(resources.GetObject("analysis_pictureBox.Image")));
            this.analysis_pictureBox.Location = new System.Drawing.Point(560, 32);
            this.analysis_pictureBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.analysis_pictureBox.Name = "analysis_pictureBox";
            this.analysis_pictureBox.Size = new System.Drawing.Size(474, 318);
            this.analysis_pictureBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.CenterImage;
            this.analysis_pictureBox.TabIndex = 17;
            this.analysis_pictureBox.TabStop = false;
            // 
            // chart1
            // 
            chartArea6.Name = "ChartArea1";
            this.chart1.ChartAreas.Add(chartArea6);
            legend6.Name = "Legend1";
            this.chart1.Legends.Add(legend6);
            this.chart1.Location = new System.Drawing.Point(156, 32);
            this.chart1.Name = "chart1";
            series16.ChartArea = "ChartArea1";
            series16.Legend = "Legend1";
            series16.Name = "여성";
            series17.ChartArea = "ChartArea1";
            series17.Legend = "Legend1";
            series17.Name = "남성";
            series18.BorderWidth = 5;
            series18.ChartArea = "ChartArea1";
            series18.ChartType = System.Windows.Forms.DataVisualization.Charting.SeriesChartType.Line;
            series18.Legend = "Legend1";
            series18.Name = "추세선";
            this.chart1.Series.Add(series16);
            this.chart1.Series.Add(series17);
            this.chart1.Series.Add(series18);
            this.chart1.Size = new System.Drawing.Size(519, 318);
            this.chart1.TabIndex = 18;
            this.chart1.Text = "chart1";
            // 
            // Commercial_pictureBox
            // 
            this.Commercial_pictureBox.Image = ((System.Drawing.Image)(resources.GetObject("Commercial_pictureBox.Image")));
            this.Commercial_pictureBox.Location = new System.Drawing.Point(593, 358);
            this.Commercial_pictureBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Commercial_pictureBox.Name = "Commercial_pictureBox";
            this.Commercial_pictureBox.Size = new System.Drawing.Size(242, 194);
            this.Commercial_pictureBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.Commercial_pictureBox.TabIndex = 16;
            this.Commercial_pictureBox.TabStop = false;
            // 
            // timer1
            // 
            this.timer1.Enabled = true;
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1034, 561);
            this.Controls.Add(this.main_timer);
            this.Controls.Add(this.chart1);
            this.Controls.Add(this.analysis_pictureBox);
            this.Controls.Add(this.Commercial_pictureBox);
            this.Controls.Add(this.Mainpanel2);
            this.Controls.Add(this.Mainpanel1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Name = "MainForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.MainForm_KeyDown);
            this.Mainpanel1.ResumeLayout(false);
            this.Mainpanel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.MainpictureBox1)).EndInit();
            this.Mainpanel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.analysis_pictureBox)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.chart1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.Commercial_pictureBox)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Panel Mainpanel1;
        private System.Windows.Forms.Button Mainbutton4;
        private System.Windows.Forms.Button Mainbutton3;
        private System.Windows.Forms.Button Mainbutton2;
        private System.Windows.Forms.Label Mainlabel2;
        private System.Windows.Forms.PictureBox MainpictureBox1;
        private System.Windows.Forms.Button Mainbutton1;
        private System.Windows.Forms.Panel MainColorPanel;
        private System.Windows.Forms.Label Mainlabel1;
        private System.Windows.Forms.Button Mainbutton_x;
        private System.Windows.Forms.Panel Mainpanel2;
        private System.Windows.Forms.PictureBox analysis_pictureBox;
        private System.Windows.Forms.Button Mainbutton_alarm;
        private System.Windows.Forms.Button Mainbutton_share;
        private System.Windows.Forms.Button Mainbutton_setting;
        private System.Windows.Forms.Panel panel_side;
        private System.Windows.Forms.DataVisualization.Charting.Chart chart1;
        private System.Windows.Forms.PictureBox Commercial_pictureBox;
        private System.Windows.Forms.Label main_timer;
        private System.Windows.Forms.Timer timer1;
    }
}

