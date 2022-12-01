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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(MainForm));
            this.Mainpanel1 = new System.Windows.Forms.Panel();
            this.panel1 = new System.Windows.Forms.Panel();
            this.Mainlabel1 = new System.Windows.Forms.Label();
            this.Mainpanel2 = new System.Windows.Forms.Panel();
            this.Dashboard = new System.Windows.Forms.Button();
            this.MainpictureBox1 = new System.Windows.Forms.PictureBox();
            this.Mainlabel2 = new System.Windows.Forms.Label();
            this.Mainpanel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.MainpictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // Mainpanel1
            // 
            this.Mainpanel1.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.Mainpanel1.Controls.Add(this.Mainlabel2);
            this.Mainpanel1.Controls.Add(this.MainpictureBox1);
            this.Mainpanel1.Controls.Add(this.Dashboard);
            this.Mainpanel1.Controls.Add(this.panel1);
            this.Mainpanel1.Controls.Add(this.Mainlabel1);
            this.Mainpanel1.Location = new System.Drawing.Point(0, 0);
            this.Mainpanel1.Name = "Mainpanel1";
            this.Mainpanel1.Size = new System.Drawing.Size(177, 753);
            this.Mainpanel1.TabIndex = 0;
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.panel1.Location = new System.Drawing.Point(-3, 82);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(180, 34);
            this.panel1.TabIndex = 1;
            // 
            // Mainlabel1
            // 
            this.Mainlabel1.AutoSize = true;
            this.Mainlabel1.Font = new System.Drawing.Font("Fira Mono", 16.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Mainlabel1.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainlabel1.Location = new System.Drawing.Point(53, 9);
            this.Mainlabel1.Name = "Mainlabel1";
            this.Mainlabel1.Size = new System.Drawing.Size(61, 33);
            this.Mainlabel1.TabIndex = 1;
            this.Mainlabel1.Text = "흥해";
            // 
            // Mainpanel2
            // 
            this.Mainpanel2.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.Mainpanel2.Location = new System.Drawing.Point(177, -1);
            this.Mainpanel2.Name = "Mainpanel2";
            this.Mainpanel2.Size = new System.Drawing.Size(405, 95);
            this.Mainpanel2.TabIndex = 0;
            // 
            // Dashboard
            // 
            this.Dashboard.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.Dashboard.FlatAppearance.BorderSize = 0;
            this.Dashboard.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Dashboard.ForeColor = System.Drawing.SystemColors.AppWorkspace;
            this.Dashboard.Image = ((System.Drawing.Image)(resources.GetObject("Dashboard.Image")));
            this.Dashboard.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Dashboard.Location = new System.Drawing.Point(0, 289);
            this.Dashboard.Name = "Dashboard";
            this.Dashboard.Size = new System.Drawing.Size(177, 60);
            this.Dashboard.TabIndex = 0;
            this.Dashboard.Text = "Mainbutton1";
            this.Dashboard.UseVisualStyleBackColor = false;
            // 
            // MainpictureBox1
            // 
            this.MainpictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("MainpictureBox1.Image")));
            this.MainpictureBox1.Location = new System.Drawing.Point(-28, 115);
            this.MainpictureBox1.Name = "MainpictureBox1";
            this.MainpictureBox1.Size = new System.Drawing.Size(237, 176);
            this.MainpictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.MainpictureBox1.TabIndex = 2;
            this.MainpictureBox1.TabStop = false;
            // 
            // Mainlabel2
            // 
            this.Mainlabel2.AutoSize = true;
            this.Mainlabel2.Font = new System.Drawing.Font("Fira Mono", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Mainlabel2.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.Mainlabel2.Location = new System.Drawing.Point(55, 52);
            this.Mainlabel2.Name = "Mainlabel2";
            this.Mainlabel2.Size = new System.Drawing.Size(55, 21);
            this.Mainlabel2.TabIndex = 3;
            this.Mainlabel2.Text = "흥해라";
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(582, 753);
            this.Controls.Add(this.Mainpanel1);
            this.Controls.Add(this.Mainpanel2);
            this.Name = "MainForm";
            this.Text = "Form1";
            this.Mainpanel1.ResumeLayout(false);
            this.Mainpanel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.MainpictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel Mainpanel1;
        private System.Windows.Forms.Panel Mainpanel2;
        private System.Windows.Forms.Label Mainlabel1;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label Mainlabel2;
        private System.Windows.Forms.PictureBox MainpictureBox1;
        private System.Windows.Forms.Button Dashboard;
    }
}

