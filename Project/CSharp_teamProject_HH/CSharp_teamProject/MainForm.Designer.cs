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
            System.Windows.Forms.DataVisualization.Charting.ChartArea chartArea20 = new System.Windows.Forms.DataVisualization.Charting.ChartArea();
            System.Windows.Forms.DataVisualization.Charting.Legend legend20 = new System.Windows.Forms.DataVisualization.Charting.Legend();
            System.Windows.Forms.DataVisualization.Charting.Series series58 = new System.Windows.Forms.DataVisualization.Charting.Series();
            System.Windows.Forms.DataVisualization.Charting.Series series59 = new System.Windows.Forms.DataVisualization.Charting.Series();
            System.Windows.Forms.DataVisualization.Charting.Series series60 = new System.Windows.Forms.DataVisualization.Charting.Series();
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
            this.Mainbutton_share = new System.Windows.Forms.Button();
            this.Mainbutton_setting = new System.Windows.Forms.Button();
            this.Mainbutton_alarm = new System.Windows.Forms.Button();
            this.main_timer = new System.Windows.Forms.Label();
            this.analysis_pictureBox = new System.Windows.Forms.PictureBox();
            this.Main_chart1 = new System.Windows.Forms.DataVisualization.Charting.Chart();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.Commercial_pictureBox = new System.Windows.Forms.PictureBox();
            this.Mainpanel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.MainpictureBox1)).BeginInit();
            this.Mainpanel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.analysis_pictureBox)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Main_chart1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
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
            this.Mainpanel1.Size = new System.Drawing.Size(177, 702);
            this.Mainpanel1.TabIndex = 1;
            // 
            // panel_side
            // 
            this.panel_side.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(192)))), ((int)(((byte)(255)))));
            this.panel_side.Location = new System.Drawing.Point(-1, 196);
            this.panel_side.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.panel_side.Name = "panel_side";
            this.panel_side.Size = new System.Drawing.Size(24, 125);
            this.panel_side.TabIndex = 20;
            // 
            // Mainlabel1
            // 
            this.Mainlabel1.AutoSize = true;
            this.Mainlabel1.Font = new System.Drawing.Font("Yu Gothic Medium", 16.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Mainlabel1.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainlabel1.Location = new System.Drawing.Point(58, 111);
            this.Mainlabel1.Name = "Mainlabel1";
            this.Mainlabel1.Size = new System.Drawing.Size(67, 36);
            this.Mainlabel1.TabIndex = 1;
            this.Mainlabel1.Text = "흥해";
            // 
            // Mainbutton4
            // 
            this.Mainbutton4.BackColor = System.Drawing.Color.AliceBlue;
            this.Mainbutton4.FlatAppearance.BorderSize = 0;
            this.Mainbutton4.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton4.Font = new System.Drawing.Font("Fira Mono Medium", 12F);
            this.Mainbutton4.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainbutton4.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton4.Image")));
            this.Mainbutton4.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Mainbutton4.Location = new System.Drawing.Point(23, 572);
            this.Mainbutton4.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton4.Name = "Mainbutton4";
            this.Mainbutton4.Size = new System.Drawing.Size(154, 125);
            this.Mainbutton4.TabIndex = 6;
            this.Mainbutton4.Text = " Admin";
            this.Mainbutton4.UseVisualStyleBackColor = false;
            this.Mainbutton4.Click += new System.EventHandler(this.Mainbutton4_Click);
            // 
            // Mainbutton3
            // 
            this.Mainbutton3.BackColor = System.Drawing.Color.AliceBlue;
            this.Mainbutton3.FlatAppearance.BorderSize = 0;
            this.Mainbutton3.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton3.Font = new System.Drawing.Font("Fira Mono Medium", 12F);
            this.Mainbutton3.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainbutton3.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton3.Image")));
            this.Mainbutton3.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Mainbutton3.Location = new System.Drawing.Point(23, 448);
            this.Mainbutton3.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton3.Name = "Mainbutton3";
            this.Mainbutton3.Size = new System.Drawing.Size(154, 125);
            this.Mainbutton3.TabIndex = 5;
            this.Mainbutton3.Text = "   Weather";
            this.Mainbutton3.UseVisualStyleBackColor = false;
            this.Mainbutton3.Click += new System.EventHandler(this.Mainbutton3_Click);
            // 
            // Mainbutton2
            // 
            this.Mainbutton2.BackColor = System.Drawing.Color.AliceBlue;
            this.Mainbutton2.FlatAppearance.BorderSize = 0;
            this.Mainbutton2.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton2.Font = new System.Drawing.Font("Fira Mono Medium", 12F);
            this.Mainbutton2.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainbutton2.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton2.Image")));
            this.Mainbutton2.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Mainbutton2.Location = new System.Drawing.Point(23, 322);
            this.Mainbutton2.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton2.Name = "Mainbutton2";
            this.Mainbutton2.Size = new System.Drawing.Size(154, 125);
            this.Mainbutton2.TabIndex = 4;
            this.Mainbutton2.Text = "  Hotel";
            this.Mainbutton2.UseVisualStyleBackColor = false;
            this.Mainbutton2.Click += new System.EventHandler(this.Mainbutton2_Click);
            // 
            // MainColorPanel
            // 
            this.MainColorPanel.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.MainColorPanel.Location = new System.Drawing.Point(-1, 175);
            this.MainColorPanel.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.MainColorPanel.Name = "MainColorPanel";
            this.MainColorPanel.Size = new System.Drawing.Size(178, 22);
            this.MainColorPanel.TabIndex = 1;
            // 
            // Mainlabel2
            // 
            this.Mainlabel2.AutoSize = true;
            this.Mainlabel2.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Mainlabel2.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainlabel2.Location = new System.Drawing.Point(49, 147);
            this.Mainlabel2.Name = "Mainlabel2";
            this.Mainlabel2.Size = new System.Drawing.Size(85, 20);
            this.Mainlabel2.TabIndex = 3;
            this.Mainlabel2.Text = "Heunghae";
            // 
            // Mainbutton1
            // 
            this.Mainbutton1.BackColor = System.Drawing.Color.AliceBlue;
            this.Mainbutton1.FlatAppearance.BorderSize = 0;
            this.Mainbutton1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton1.Font = new System.Drawing.Font("Fira Mono Medium", 12F);
            this.Mainbutton1.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainbutton1.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton1.Image")));
            this.Mainbutton1.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Mainbutton1.Location = new System.Drawing.Point(23, 198);
            this.Mainbutton1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton1.Name = "Mainbutton1";
            this.Mainbutton1.Size = new System.Drawing.Size(154, 125);
            this.Mainbutton1.TabIndex = 0;
            this.Mainbutton1.Text = " Main";
            this.Mainbutton1.UseVisualStyleBackColor = false;
            this.Mainbutton1.Click += new System.EventHandler(this.Mainbutton1_Click);
            // 
            // MainpictureBox1
            // 
            this.MainpictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("MainpictureBox1.Image")));
            this.MainpictureBox1.Location = new System.Drawing.Point(-37, 0);
            this.MainpictureBox1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.MainpictureBox1.Name = "MainpictureBox1";
            this.MainpictureBox1.Size = new System.Drawing.Size(257, 176);
            this.MainpictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.MainpictureBox1.TabIndex = 2;
            this.MainpictureBox1.TabStop = false;
            // 
            // Mainbutton_x
            // 
            this.Mainbutton_x.FlatAppearance.BorderSize = 0;
            this.Mainbutton_x.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton_x.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton_x.Image")));
            this.Mainbutton_x.Location = new System.Drawing.Point(964, 1);
            this.Mainbutton_x.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton_x.Name = "Mainbutton_x";
            this.Mainbutton_x.Size = new System.Drawing.Size(38, 34);
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
            this.Mainpanel2.Location = new System.Drawing.Point(178, 0);
            this.Mainpanel2.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainpanel2.Name = "Mainpanel2";
            this.Mainpanel2.Size = new System.Drawing.Size(1003, 44);
            this.Mainpanel2.TabIndex = 2;
            // 
            // Mainbutton_share
            // 
            this.Mainbutton_share.FlatAppearance.BorderSize = 0;
            this.Mainbutton_share.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton_share.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton_share.Image")));
            this.Mainbutton_share.Location = new System.Drawing.Point(874, -1);
            this.Mainbutton_share.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton_share.Name = "Mainbutton_share";
            this.Mainbutton_share.Size = new System.Drawing.Size(48, 36);
            this.Mainbutton_share.TabIndex = 4;
            this.Mainbutton_share.UseVisualStyleBackColor = true;
            this.Mainbutton_share.Click += new System.EventHandler(this.Mainbutton_share_Click);
            // 
            // Mainbutton_setting
            // 
            this.Mainbutton_setting.FlatAppearance.BorderSize = 0;
            this.Mainbutton_setting.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton_setting.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton_setting.Image")));
            this.Mainbutton_setting.Location = new System.Drawing.Point(833, 1);
            this.Mainbutton_setting.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton_setting.Name = "Mainbutton_setting";
            this.Mainbutton_setting.Size = new System.Drawing.Size(38, 34);
            this.Mainbutton_setting.TabIndex = 3;
            this.Mainbutton_setting.UseVisualStyleBackColor = true;
            // 
            // Mainbutton_alarm
            // 
            this.Mainbutton_alarm.FlatAppearance.BorderSize = 0;
            this.Mainbutton_alarm.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Mainbutton_alarm.Image = ((System.Drawing.Image)(resources.GetObject("Mainbutton_alarm.Image")));
            this.Mainbutton_alarm.Location = new System.Drawing.Point(923, 0);
            this.Mainbutton_alarm.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Mainbutton_alarm.Name = "Mainbutton_alarm";
            this.Mainbutton_alarm.Size = new System.Drawing.Size(38, 34);
            this.Mainbutton_alarm.TabIndex = 2;
            this.Mainbutton_alarm.UseVisualStyleBackColor = true;
            // 
            // main_timer
            // 
            this.main_timer.AutoSize = true;
            this.main_timer.BackColor = System.Drawing.Color.Transparent;
            this.main_timer.Font = new System.Drawing.Font("Fira Mono Medium", 10.2F);
            this.main_timer.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.main_timer.Location = new System.Drawing.Point(684, 668);
            this.main_timer.Name = "main_timer";
            this.main_timer.Size = new System.Drawing.Size(60, 21);
            this.main_timer.TabIndex = 19;
            this.main_timer.Text = "timer";
            // 
            // analysis_pictureBox
            // 
            this.analysis_pictureBox.Image = ((System.Drawing.Image)(resources.GetObject("analysis_pictureBox.Image")));
            this.analysis_pictureBox.Location = new System.Drawing.Point(692, 39);
            this.analysis_pictureBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.analysis_pictureBox.Name = "analysis_pictureBox";
            this.analysis_pictureBox.Size = new System.Drawing.Size(489, 353);
            this.analysis_pictureBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.analysis_pictureBox.TabIndex = 17;
            this.analysis_pictureBox.TabStop = false;
            // 
            // Main_chart1
            // 
            chartArea20.Name = "ChartArea1";
            this.Main_chart1.ChartAreas.Add(chartArea20);
            legend20.Name = "Legend1";
            this.Main_chart1.Legends.Add(legend20);
            this.Main_chart1.Location = new System.Drawing.Point(178, 26);
            this.Main_chart1.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Main_chart1.Name = "Main_chart1";
            this.Main_chart1.Palette = System.Windows.Forms.DataVisualization.Charting.ChartColorPalette.Pastel;
            series58.ChartArea = "ChartArea1";
            series58.Legend = "Legend1";
            series58.Name = "여성";
            series59.ChartArea = "ChartArea1";
            series59.Legend = "Legend1";
            series59.Name = "남성";
            series60.BorderWidth = 5;
            series60.ChartArea = "ChartArea1";
            series60.ChartType = System.Windows.Forms.DataVisualization.Charting.SeriesChartType.Line;
            series60.Legend = "Legend1";
            series60.Name = "추세선";
            this.Main_chart1.Series.Add(series58);
            this.Main_chart1.Series.Add(series59);
            this.Main_chart1.Series.Add(series60);
            this.Main_chart1.Size = new System.Drawing.Size(545, 385);
            this.Main_chart1.TabIndex = 18;
            this.Main_chart1.Text = "chart1";
            // 
            // timer1
            // 
            this.timer1.Enabled = true;
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(838, 405);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(368, 328);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 20;
            this.pictureBox1.TabStop = false;
            // 
            // Commercial_pictureBox
            // 
            this.Commercial_pictureBox.Image = ((System.Drawing.Image)(resources.GetObject("Commercial_pictureBox.Image")));
            this.Commercial_pictureBox.Location = new System.Drawing.Point(178, 360);
            this.Commercial_pictureBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Commercial_pictureBox.Name = "Commercial_pictureBox";
            this.Commercial_pictureBox.Size = new System.Drawing.Size(699, 340);
            this.Commercial_pictureBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.Commercial_pictureBox.TabIndex = 16;
            this.Commercial_pictureBox.TabStop = false;
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.ClientSize = new System.Drawing.Size(1182, 698);
            this.Controls.Add(this.main_timer);
            this.Controls.Add(this.analysis_pictureBox);
            this.Controls.Add(this.Main_chart1);
            this.Controls.Add(this.Commercial_pictureBox);
            this.Controls.Add(this.Mainpanel2);
            this.Controls.Add(this.Mainpanel1);
            this.Controls.Add(this.pictureBox1);
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
            ((System.ComponentModel.ISupportInitialize)(this.Main_chart1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
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
        private System.Windows.Forms.DataVisualization.Charting.Chart Main_chart1;
        private System.Windows.Forms.Label main_timer;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.PictureBox Commercial_pictureBox;
    }
}

