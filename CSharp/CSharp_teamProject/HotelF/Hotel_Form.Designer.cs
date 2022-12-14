namespace CSharp_teamProject
{
    partial class Hotel_Form
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.hotel_webBrowser1 = new System.Windows.Forms.WebBrowser();
            this.hotel_dataGridView1 = new System.Windows.Forms.DataGridView();
            this.hotel_checkBox9 = new System.Windows.Forms.CheckBox();
            this.hotel_checkBox8 = new System.Windows.Forms.CheckBox();
            this.hotel_checkBox7 = new System.Windows.Forms.CheckBox();
            this.hotel_checkBox6 = new System.Windows.Forms.CheckBox();
            this.hotel_checkBox5 = new System.Windows.Forms.CheckBox();
            this.hotel_checkBox4 = new System.Windows.Forms.CheckBox();
            this.hotel_checkBox3 = new System.Windows.Forms.CheckBox();
            this.hotel_checkBox2 = new System.Windows.Forms.CheckBox();
            this.hotel_checkBox1 = new System.Windows.Forms.CheckBox();
            this.hotel_label1 = new System.Windows.Forms.Label();
            this.hotel_button1 = new System.Windows.Forms.Button();
            this.hotel_textBox1 = new System.Windows.Forms.TextBox();
            this.hotel_button2 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.hotel_dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // hotel_webBrowser1
            // 
            this.hotel_webBrowser1.Location = new System.Drawing.Point(397, 121);
            this.hotel_webBrowser1.MinimumSize = new System.Drawing.Size(20, 20);
            this.hotel_webBrowser1.Name = "hotel_webBrowser1";
            this.hotel_webBrowser1.Size = new System.Drawing.Size(564, 472);
            this.hotel_webBrowser1.TabIndex = 28;
            this.hotel_webBrowser1.Url = new System.Uri("https://leeyonghui1.github.io/MapHosting/", System.UriKind.Absolute);
            // 
            // hotel_dataGridView1
            // 
            this.hotel_dataGridView1.AllowUserToAddRows = false;
            this.hotel_dataGridView1.AllowUserToDeleteRows = false;
            this.hotel_dataGridView1.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.hotel_dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.hotel_dataGridView1.Location = new System.Drawing.Point(14, 121);
            this.hotel_dataGridView1.Name = "hotel_dataGridView1";
            this.hotel_dataGridView1.ReadOnly = true;
            this.hotel_dataGridView1.RowTemplate.Height = 23;
            this.hotel_dataGridView1.Size = new System.Drawing.Size(368, 462);
            this.hotel_dataGridView1.TabIndex = 27;
            this.hotel_dataGridView1.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.hotel_dataGridView1_CellClick);
            // 
            // hotel_checkBox9
            // 
            this.hotel_checkBox9.AutoSize = true;
            this.hotel_checkBox9.Location = new System.Drawing.Point(621, 90);
            this.hotel_checkBox9.Name = "hotel_checkBox9";
            this.hotel_checkBox9.Size = new System.Drawing.Size(60, 16);
            this.hotel_checkBox9.TabIndex = 26;
            this.hotel_checkBox9.Text = "충청도";
            this.hotel_checkBox9.UseVisualStyleBackColor = true;
            this.hotel_checkBox9.CheckedChanged += new System.EventHandler(this.hotel_checkBox9_CheckedChanged);
            // 
            // hotel_checkBox8
            // 
            this.hotel_checkBox8.AutoSize = true;
            this.hotel_checkBox8.Location = new System.Drawing.Point(541, 90);
            this.hotel_checkBox8.Name = "hotel_checkBox8";
            this.hotel_checkBox8.Size = new System.Drawing.Size(60, 16);
            this.hotel_checkBox8.TabIndex = 25;
            this.hotel_checkBox8.Text = "경상도";
            this.hotel_checkBox8.UseVisualStyleBackColor = true;
            this.hotel_checkBox8.CheckedChanged += new System.EventHandler(this.hotel_checkBox8_CheckedChanged);
            // 
            // hotel_checkBox7
            // 
            this.hotel_checkBox7.AutoSize = true;
            this.hotel_checkBox7.Location = new System.Drawing.Point(461, 90);
            this.hotel_checkBox7.Name = "hotel_checkBox7";
            this.hotel_checkBox7.Size = new System.Drawing.Size(60, 16);
            this.hotel_checkBox7.TabIndex = 24;
            this.hotel_checkBox7.Text = "전라도";
            this.hotel_checkBox7.UseVisualStyleBackColor = true;
            this.hotel_checkBox7.CheckedChanged += new System.EventHandler(this.hotel_checkBox7_CheckedChanged);
            // 
            // hotel_checkBox6
            // 
            this.hotel_checkBox6.AutoSize = true;
            this.hotel_checkBox6.Location = new System.Drawing.Point(381, 90);
            this.hotel_checkBox6.Name = "hotel_checkBox6";
            this.hotel_checkBox6.Size = new System.Drawing.Size(60, 16);
            this.hotel_checkBox6.TabIndex = 23;
            this.hotel_checkBox6.Text = "강원도";
            this.hotel_checkBox6.UseVisualStyleBackColor = true;
            this.hotel_checkBox6.CheckedChanged += new System.EventHandler(this.hotel_checkBox6_CheckedChanged);
            // 
            // hotel_checkBox5
            // 
            this.hotel_checkBox5.AutoSize = true;
            this.hotel_checkBox5.Location = new System.Drawing.Point(301, 90);
            this.hotel_checkBox5.Name = "hotel_checkBox5";
            this.hotel_checkBox5.Size = new System.Drawing.Size(60, 16);
            this.hotel_checkBox5.TabIndex = 22;
            this.hotel_checkBox5.Text = "경기도";
            this.hotel_checkBox5.UseVisualStyleBackColor = true;
            this.hotel_checkBox5.CheckedChanged += new System.EventHandler(this.hotel_checkBox5_CheckedChanged);
            // 
            // hotel_checkBox4
            // 
            this.hotel_checkBox4.AutoSize = true;
            this.hotel_checkBox4.Location = new System.Drawing.Point(233, 90);
            this.hotel_checkBox4.Name = "hotel_checkBox4";
            this.hotel_checkBox4.Size = new System.Drawing.Size(48, 16);
            this.hotel_checkBox4.TabIndex = 21;
            this.hotel_checkBox4.Text = "대구";
            this.hotel_checkBox4.UseVisualStyleBackColor = true;
            this.hotel_checkBox4.CheckedChanged += new System.EventHandler(this.hotel_checkBox4_CheckedChanged);
            // 
            // hotel_checkBox3
            // 
            this.hotel_checkBox3.AutoSize = true;
            this.hotel_checkBox3.Location = new System.Drawing.Point(165, 90);
            this.hotel_checkBox3.Name = "hotel_checkBox3";
            this.hotel_checkBox3.Size = new System.Drawing.Size(48, 16);
            this.hotel_checkBox3.TabIndex = 20;
            this.hotel_checkBox3.Text = "부산";
            this.hotel_checkBox3.UseVisualStyleBackColor = true;
            this.hotel_checkBox3.CheckedChanged += new System.EventHandler(this.hotel_checkBox3_CheckedChanged);
            // 
            // hotel_checkBox2
            // 
            this.hotel_checkBox2.AutoSize = true;
            this.hotel_checkBox2.Location = new System.Drawing.Point(97, 90);
            this.hotel_checkBox2.Name = "hotel_checkBox2";
            this.hotel_checkBox2.Size = new System.Drawing.Size(48, 16);
            this.hotel_checkBox2.TabIndex = 19;
            this.hotel_checkBox2.Text = "제주";
            this.hotel_checkBox2.UseVisualStyleBackColor = true;
            this.hotel_checkBox2.CheckedChanged += new System.EventHandler(this.hotel_checkBox2_CheckedChanged);
            // 
            // hotel_checkBox1
            // 
            this.hotel_checkBox1.AutoSize = true;
            this.hotel_checkBox1.Location = new System.Drawing.Point(29, 90);
            this.hotel_checkBox1.Name = "hotel_checkBox1";
            this.hotel_checkBox1.Size = new System.Drawing.Size(48, 16);
            this.hotel_checkBox1.TabIndex = 18;
            this.hotel_checkBox1.Text = "서울";
            this.hotel_checkBox1.UseVisualStyleBackColor = true;
            this.hotel_checkBox1.CheckedChanged += new System.EventHandler(this.hotel_checkBox1_CheckedChanged);
            // 
            // hotel_label1
            // 
            this.hotel_label1.AutoSize = true;
            this.hotel_label1.Location = new System.Drawing.Point(27, 50);
            this.hotel_label1.Name = "hotel_label1";
            this.hotel_label1.Size = new System.Drawing.Size(41, 12);
            this.hotel_label1.TabIndex = 17;
            this.hotel_label1.Text = "호텔명";
            // 
            // hotel_button1
            // 
            this.hotel_button1.Location = new System.Drawing.Point(247, 45);
            this.hotel_button1.Name = "hotel_button1";
            this.hotel_button1.Size = new System.Drawing.Size(75, 23);
            this.hotel_button1.TabIndex = 15;
            this.hotel_button1.Text = "검색";
            this.hotel_button1.UseVisualStyleBackColor = true;
            this.hotel_button1.Click += new System.EventHandler(this.hotel_button1_Click);
            // 
            // hotel_textBox1
            // 
            this.hotel_textBox1.Location = new System.Drawing.Point(84, 47);
            this.hotel_textBox1.Name = "hotel_textBox1";
            this.hotel_textBox1.Size = new System.Drawing.Size(146, 21);
            this.hotel_textBox1.TabIndex = 16;
            // 
            // hotel_button2
            // 
            this.hotel_button2.Location = new System.Drawing.Point(766, 39);
            this.hotel_button2.Name = "hotel_button2";
            this.hotel_button2.Size = new System.Drawing.Size(75, 23);
            this.hotel_button2.TabIndex = 29;
            this.hotel_button2.Text = "예약하기";
            this.hotel_button2.UseVisualStyleBackColor = true;
            this.hotel_button2.Click += new System.EventHandler(this.hotel_button2_Click);
            // 
            // Hotel_Form
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(984, 661);
            this.Controls.Add(this.hotel_button2);
            this.Controls.Add(this.hotel_webBrowser1);
            this.Controls.Add(this.hotel_dataGridView1);
            this.Controls.Add(this.hotel_checkBox9);
            this.Controls.Add(this.hotel_checkBox8);
            this.Controls.Add(this.hotel_checkBox7);
            this.Controls.Add(this.hotel_checkBox6);
            this.Controls.Add(this.hotel_checkBox5);
            this.Controls.Add(this.hotel_checkBox4);
            this.Controls.Add(this.hotel_checkBox3);
            this.Controls.Add(this.hotel_checkBox2);
            this.Controls.Add(this.hotel_checkBox1);
            this.Controls.Add(this.hotel_label1);
            this.Controls.Add(this.hotel_textBox1);
            this.Controls.Add(this.hotel_button1);
            this.Name = "Hotel_Form";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Hotel";
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.Hotel_Form_KeyDown);
            ((System.ComponentModel.ISupportInitialize)(this.hotel_dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.WebBrowser hotel_webBrowser1;
        private System.Windows.Forms.DataGridView hotel_dataGridView1;
        private System.Windows.Forms.CheckBox hotel_checkBox9;
        private System.Windows.Forms.CheckBox hotel_checkBox8;
        private System.Windows.Forms.CheckBox hotel_checkBox7;
        private System.Windows.Forms.CheckBox hotel_checkBox6;
        private System.Windows.Forms.CheckBox hotel_checkBox5;
        private System.Windows.Forms.CheckBox hotel_checkBox4;
        private System.Windows.Forms.CheckBox hotel_checkBox3;
        private System.Windows.Forms.CheckBox hotel_checkBox2;
        private System.Windows.Forms.CheckBox hotel_checkBox1;
        private System.Windows.Forms.Label hotel_label1;
        private System.Windows.Forms.Button hotel_button1;
        private System.Windows.Forms.TextBox hotel_textBox1;
        private System.Windows.Forms.Button hotel_button2;
    }
}