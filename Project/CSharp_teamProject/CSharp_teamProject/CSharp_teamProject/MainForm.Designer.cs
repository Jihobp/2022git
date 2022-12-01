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
            this.MainPanel1 = new System.Windows.Forms.Panel();
            this.MainPanel2 = new System.Windows.Forms.Panel();
            this.MainLabelTitle = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.MainPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // MainPanel1
            // 
            this.MainPanel1.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.MainPanel1.Controls.Add(this.panel1);
            this.MainPanel1.Controls.Add(this.MainLabelTitle);
            this.MainPanel1.Location = new System.Drawing.Point(0, 0);
            this.MainPanel1.Name = "MainPanel1";
            this.MainPanel1.Size = new System.Drawing.Size(177, 646);
            this.MainPanel1.TabIndex = 0;
            // 
            // MainPanel2
            // 
            this.MainPanel2.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.MainPanel2.Location = new System.Drawing.Point(177, -1);
            this.MainPanel2.Name = "MainPanel2";
            this.MainPanel2.Size = new System.Drawing.Size(933, 95);
            this.MainPanel2.TabIndex = 0;
            // 
            // MainLabelTitle
            // 
            this.MainLabelTitle.AutoSize = true;
            this.MainLabelTitle.Font = new System.Drawing.Font("Fira Mono", 16.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.MainLabelTitle.ForeColor = System.Drawing.SystemColors.ActiveCaption;
            this.MainLabelTitle.Location = new System.Drawing.Point(52, 9);
            this.MainLabelTitle.Name = "MainLabelTitle";
            this.MainLabelTitle.Size = new System.Drawing.Size(58, 32);
            this.MainLabelTitle.TabIndex = 1;
            this.MainLabelTitle.Text = "흥해";
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.panel1.Location = new System.Drawing.Point(3, 57);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(174, 34);
            this.panel1.TabIndex = 1;
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1111, 646);
            this.Controls.Add(this.MainPanel1);
            this.Controls.Add(this.MainPanel2);
            this.Name = "MainForm";
            this.Text = "Form1";
            this.MainPanel1.ResumeLayout(false);
            this.MainPanel1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel MainPanel1;
        private System.Windows.Forms.Panel MainPanel2;
        private System.Windows.Forms.Label MainLabelTitle;
        private System.Windows.Forms.Panel panel1;
    }
}

