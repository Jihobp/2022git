namespace HelloMyCSharp06_06
{
    partial class Form1
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
            this.button1 = new System.Windows.Forms.Button();
            this.textBox_a1 = new System.Windows.Forms.TextBox();
            this.textBox_b1 = new System.Windows.Forms.TextBox();
            this.textBox_a2 = new System.Windows.Forms.TextBox();
            this.textBox_b2 = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(165, 309);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(448, 23);
            this.button1.TabIndex = 0;
            this.button1.Text = "Swap";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // textBox_a1
            // 
            this.textBox_a1.Location = new System.Drawing.Point(165, 166);
            this.textBox_a1.Name = "textBox_a1";
            this.textBox_a1.Size = new System.Drawing.Size(100, 21);
            this.textBox_a1.TabIndex = 1;
            // 
            // textBox_b1
            // 
            this.textBox_b1.Location = new System.Drawing.Point(165, 237);
            this.textBox_b1.Name = "textBox_b1";
            this.textBox_b1.Size = new System.Drawing.Size(100, 21);
            this.textBox_b1.TabIndex = 2;
            // 
            // textBox_a2
            // 
            this.textBox_a2.Location = new System.Drawing.Point(495, 166);
            this.textBox_a2.Name = "textBox_a2";
            this.textBox_a2.Size = new System.Drawing.Size(100, 21);
            this.textBox_a2.TabIndex = 3;
            // 
            // textBox_b2
            // 
            this.textBox_b2.Location = new System.Drawing.Point(503, 237);
            this.textBox_b2.Name = "textBox_b2";
            this.textBox_b2.Size = new System.Drawing.Size(100, 21);
            this.textBox_b2.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(76, 169);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(57, 12);
            this.label1.TabIndex = 5;
            this.label1.Text = "첫번째 수";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(76, 246);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(57, 12);
            this.label2.TabIndex = 6;
            this.label2.Text = "두번째 수";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(404, 169);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(85, 12);
            this.label3.TabIndex = 7;
            this.label3.Text = "바뀐 첫번째 수";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(404, 240);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(85, 12);
            this.label4.TabIndex = 8;
            this.label4.Text = "바뀐 두번째 수";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBox_b2);
            this.Controls.Add(this.textBox_a2);
            this.Controls.Add(this.textBox_b1);
            this.Controls.Add(this.textBox_a1);
            this.Controls.Add(this.button1);
            this.Name = "Form1";
            this.Text = "Swap";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox textBox_a1;
        private System.Windows.Forms.TextBox textBox_b1;
        private System.Windows.Forms.TextBox textBox_a2;
        private System.Windows.Forms.TextBox textBox_b2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
    }
}

