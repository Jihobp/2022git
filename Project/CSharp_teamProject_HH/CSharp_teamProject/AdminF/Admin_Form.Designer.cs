namespace CSharp_teamProject
{
    partial class Admin_Form
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
            this.components = new System.ComponentModel.Container();
            this.data_box = new System.Windows.Forms.GroupBox();
            this.Hotel_dataGridView1 = new System.Windows.Forms.DataGridView();
            this.admin_datagridview = new System.Windows.Forms.DataGridView();
            this.user_phoneNum_label = new System.Windows.Forms.Label();
            this.user_name_label = new System.Windows.Forms.Label();
            this.user_passWord_label = new System.Windows.Forms.Label();
            this.user_id_label = new System.Windows.Forms.Label();
            this.user_name_box = new System.Windows.Forms.TextBox();
            this.user_phoneNum_box = new System.Windows.Forms.TextBox();
            this.user_passWord_box = new System.Windows.Forms.TextBox();
            this.user_create_button = new System.Windows.Forms.Button();
            this.log_box = new System.Windows.Forms.ListBox();
            this.user_id_box = new System.Windows.Forms.TextBox();
            this.user_box = new System.Windows.Forms.GroupBox();
            this.user_update_button = new System.Windows.Forms.Button();
            this.user_delete_button = new System.Windows.Forms.Button();
            this.user_email_label = new System.Windows.Forms.Label();
            this.user_email_box = new System.Windows.Forms.TextBox();
            this.user_search_button = new System.Windows.Forms.Button();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.hotel_search_button = new System.Windows.Forms.Button();
            this.hotel_name_box = new System.Windows.Forms.TextBox();
            this.hotel_create_button = new System.Windows.Forms.Button();
            this.hotel_tell_box = new System.Windows.Forms.TextBox();
            this.hotel_addr_box = new System.Windows.Forms.TextBox();
            this.hotel_post_box = new System.Windows.Forms.TextBox();
            this.hotel_name_label = new System.Windows.Forms.Label();
            this.hotel_tell_label = new System.Windows.Forms.Label();
            this.hotel_post_label = new System.Windows.Forms.Label();
            this.hotel_addr_label = new System.Windows.Forms.Label();
            this.hotel_lat_box = new System.Windows.Forms.TextBox();
            this.hotel_coordinateX_label = new System.Windows.Forms.Label();
            this.hotel_update_button = new System.Windows.Forms.Button();
            this.hotel_lng_box = new System.Windows.Forms.TextBox();
            this.hotel_coordinateY_label = new System.Windows.Forms.Label();
            this.hotel_roomNumber_box = new System.Windows.Forms.TextBox();
            this.hotel_roomNumber_label = new System.Windows.Forms.Label();
            this.hotel_delete_button = new System.Windows.Forms.Button();
            this.hotel_box = new System.Windows.Forms.GroupBox();
            this.data_box.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.Hotel_dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.admin_datagridview)).BeginInit();
            this.user_box.SuspendLayout();
            this.hotel_box.SuspendLayout();
            this.SuspendLayout();
            // 
            // data_box
            // 
            this.data_box.Controls.Add(this.Hotel_dataGridView1);
            this.data_box.Controls.Add(this.admin_datagridview);
            this.data_box.Location = new System.Drawing.Point(7, 248);
            this.data_box.Name = "data_box";
            this.data_box.Size = new System.Drawing.Size(984, 273);
            this.data_box.TabIndex = 23;
            this.data_box.TabStop = false;
            this.data_box.Text = "정보";
            // 
            // Hotel_dataGridView1
            // 
            this.Hotel_dataGridView1.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.Hotel_dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.Hotel_dataGridView1.Location = new System.Drawing.Point(7, 28);
            this.Hotel_dataGridView1.Name = "Hotel_dataGridView1";
            this.Hotel_dataGridView1.RowHeadersWidth = 51;
            this.Hotel_dataGridView1.RowTemplate.Height = 23;
            this.Hotel_dataGridView1.Size = new System.Drawing.Size(990, 248);
            this.Hotel_dataGridView1.TabIndex = 3;
            this.Hotel_dataGridView1.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.Hotel_dataGridView1_CellClick);
            // 
            // admin_datagridview
            // 
            this.admin_datagridview.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.admin_datagridview.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.admin_datagridview.Location = new System.Drawing.Point(7, 28);
            this.admin_datagridview.Name = "admin_datagridview";
            this.admin_datagridview.RowHeadersWidth = 51;
            this.admin_datagridview.RowTemplate.Height = 23;
            this.admin_datagridview.Size = new System.Drawing.Size(974, 248);
            this.admin_datagridview.TabIndex = 2;
            this.admin_datagridview.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.admin_datagridview_CellClick);
            // 
            // user_phoneNum_label
            // 
            this.user_phoneNum_label.AutoSize = true;
            this.user_phoneNum_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.user_phoneNum_label.Location = new System.Drawing.Point(31, 114);
            this.user_phoneNum_label.Name = "user_phoneNum_label";
            this.user_phoneNum_label.Size = new System.Drawing.Size(69, 20);
            this.user_phoneNum_label.TabIndex = 12;
            this.user_phoneNum_label.Text = "전화번호";
            // 
            // user_name_label
            // 
            this.user_name_label.AutoSize = true;
            this.user_name_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.user_name_label.Location = new System.Drawing.Point(31, 85);
            this.user_name_label.Name = "user_name_label";
            this.user_name_label.Size = new System.Drawing.Size(39, 20);
            this.user_name_label.TabIndex = 11;
            this.user_name_label.Text = "이름";
            // 
            // user_passWord_label
            // 
            this.user_passWord_label.AutoSize = true;
            this.user_passWord_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.user_passWord_label.Location = new System.Drawing.Point(31, 56);
            this.user_passWord_label.Name = "user_passWord_label";
            this.user_passWord_label.Size = new System.Drawing.Size(69, 20);
            this.user_passWord_label.TabIndex = 10;
            this.user_passWord_label.Text = "비밀번호";
            // 
            // user_id_label
            // 
            this.user_id_label.AutoSize = true;
            this.user_id_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.user_id_label.Location = new System.Drawing.Point(31, 27);
            this.user_id_label.Name = "user_id_label";
            this.user_id_label.Size = new System.Drawing.Size(54, 20);
            this.user_id_label.TabIndex = 9;
            this.user_id_label.Text = "아이디";
            // 
            // user_name_box
            // 
            this.user_name_box.Location = new System.Drawing.Point(119, 81);
            this.user_name_box.Name = "user_name_box";
            this.user_name_box.Size = new System.Drawing.Size(251, 27);
            this.user_name_box.TabIndex = 4;
            // 
            // user_phoneNum_box
            // 
            this.user_phoneNum_box.Location = new System.Drawing.Point(119, 110);
            this.user_phoneNum_box.Name = "user_phoneNum_box";
            this.user_phoneNum_box.Size = new System.Drawing.Size(251, 27);
            this.user_phoneNum_box.TabIndex = 5;
            // 
            // user_passWord_box
            // 
            this.user_passWord_box.Location = new System.Drawing.Point(119, 52);
            this.user_passWord_box.Name = "user_passWord_box";
            this.user_passWord_box.Size = new System.Drawing.Size(251, 27);
            this.user_passWord_box.TabIndex = 3;
            // 
            // user_create_button
            // 
            this.user_create_button.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.user_create_button.Font = new System.Drawing.Font("맑은 고딕", 7.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.user_create_button.Location = new System.Drawing.Point(398, 51);
            this.user_create_button.Name = "user_create_button";
            this.user_create_button.Size = new System.Drawing.Size(70, 23);
            this.user_create_button.TabIndex = 8;
            this.user_create_button.Text = "추가";
            this.user_create_button.UseVisualStyleBackColor = false;
            this.user_create_button.Click += new System.EventHandler(this.user_create_button_Click);
            // 
            // log_box
            // 
            this.log_box.FormattingEnabled = true;
            this.log_box.ItemHeight = 20;
            this.log_box.Location = new System.Drawing.Point(7, 524);
            this.log_box.Name = "log_box";
            this.log_box.Size = new System.Drawing.Size(984, 124);
            this.log_box.TabIndex = 21;
            // 
            // user_id_box
            // 
            this.user_id_box.Location = new System.Drawing.Point(119, 23);
            this.user_id_box.Name = "user_id_box";
            this.user_id_box.Size = new System.Drawing.Size(251, 27);
            this.user_id_box.TabIndex = 2;
            // 
            // user_box
            // 
            this.user_box.Controls.Add(this.user_update_button);
            this.user_box.Controls.Add(this.user_delete_button);
            this.user_box.Controls.Add(this.user_email_label);
            this.user_box.Controls.Add(this.user_email_box);
            this.user_box.Controls.Add(this.user_phoneNum_label);
            this.user_box.Controls.Add(this.user_name_label);
            this.user_box.Controls.Add(this.user_passWord_label);
            this.user_box.Controls.Add(this.user_id_label);
            this.user_box.Controls.Add(this.user_name_box);
            this.user_box.Controls.Add(this.user_phoneNum_box);
            this.user_box.Controls.Add(this.user_passWord_box);
            this.user_box.Controls.Add(this.user_create_button);
            this.user_box.Controls.Add(this.user_id_box);
            this.user_box.Controls.Add(this.user_search_button);
            this.user_box.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.user_box.Location = new System.Drawing.Point(7, 12);
            this.user_box.Name = "user_box";
            this.user_box.Size = new System.Drawing.Size(482, 230);
            this.user_box.TabIndex = 22;
            this.user_box.TabStop = false;
            this.user_box.Text = "회원";
            // 
            // user_update_button
            // 
            this.user_update_button.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.user_update_button.Font = new System.Drawing.Font("맑은 고딕", 7.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.user_update_button.Location = new System.Drawing.Point(398, 80);
            this.user_update_button.Name = "user_update_button";
            this.user_update_button.Size = new System.Drawing.Size(70, 23);
            this.user_update_button.TabIndex = 9;
            this.user_update_button.Text = "수정";
            this.user_update_button.UseVisualStyleBackColor = false;
            this.user_update_button.Click += new System.EventHandler(this.user_update_button_Click);
            // 
            // user_delete_button
            // 
            this.user_delete_button.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.user_delete_button.Font = new System.Drawing.Font("맑은 고딕", 7.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.user_delete_button.Location = new System.Drawing.Point(398, 109);
            this.user_delete_button.Name = "user_delete_button";
            this.user_delete_button.Size = new System.Drawing.Size(70, 23);
            this.user_delete_button.TabIndex = 10;
            this.user_delete_button.Text = "삭제";
            this.user_delete_button.UseVisualStyleBackColor = false;
            this.user_delete_button.Click += new System.EventHandler(this.user_delete_button_Click);
            // 
            // user_email_label
            // 
            this.user_email_label.AutoSize = true;
            this.user_email_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.user_email_label.Location = new System.Drawing.Point(31, 143);
            this.user_email_label.Name = "user_email_label";
            this.user_email_label.Size = new System.Drawing.Size(54, 20);
            this.user_email_label.TabIndex = 14;
            this.user_email_label.Text = "이메일";
            // 
            // user_email_box
            // 
            this.user_email_box.Location = new System.Drawing.Point(119, 140);
            this.user_email_box.Name = "user_email_box";
            this.user_email_box.Size = new System.Drawing.Size(251, 27);
            this.user_email_box.TabIndex = 6;
            // 
            // user_search_button
            // 
            this.user_search_button.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.user_search_button.Font = new System.Drawing.Font("맑은 고딕", 7.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.user_search_button.Location = new System.Drawing.Point(398, 22);
            this.user_search_button.Name = "user_search_button";
            this.user_search_button.Size = new System.Drawing.Size(70, 23);
            this.user_search_button.TabIndex = 7;
            this.user_search_button.Text = "조회";
            this.user_search_button.UseVisualStyleBackColor = false;
            this.user_search_button.Click += new System.EventHandler(this.user_search_button_Click);
            // 
            // timer1
            // 
            this.timer1.Enabled = true;
            this.timer1.Interval = 1000;
            // 
            // hotel_search_button
            // 
            this.hotel_search_button.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.hotel_search_button.Font = new System.Drawing.Font("맑은 고딕", 7.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.hotel_search_button.Location = new System.Drawing.Point(387, 20);
            this.hotel_search_button.Name = "hotel_search_button";
            this.hotel_search_button.Size = new System.Drawing.Size(73, 23);
            this.hotel_search_button.TabIndex = 18;
            this.hotel_search_button.Text = "조회";
            this.hotel_search_button.UseVisualStyleBackColor = false;
            this.hotel_search_button.Click += new System.EventHandler(this.hotel_search_button_Click);
            // 
            // hotel_name_box
            // 
            this.hotel_name_box.Location = new System.Drawing.Point(104, 21);
            this.hotel_name_box.Name = "hotel_name_box";
            this.hotel_name_box.Size = new System.Drawing.Size(258, 27);
            this.hotel_name_box.TabIndex = 11;
            // 
            // hotel_create_button
            // 
            this.hotel_create_button.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.hotel_create_button.Font = new System.Drawing.Font("맑은 고딕", 7.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.hotel_create_button.Location = new System.Drawing.Point(387, 48);
            this.hotel_create_button.Name = "hotel_create_button";
            this.hotel_create_button.Size = new System.Drawing.Size(73, 23);
            this.hotel_create_button.TabIndex = 19;
            this.hotel_create_button.Text = "추가";
            this.hotel_create_button.UseVisualStyleBackColor = false;
            this.hotel_create_button.Click += new System.EventHandler(this.hotel_create_button_Click);
            // 
            // hotel_tell_box
            // 
            this.hotel_tell_box.Location = new System.Drawing.Point(104, 49);
            this.hotel_tell_box.Name = "hotel_tell_box";
            this.hotel_tell_box.Size = new System.Drawing.Size(258, 27);
            this.hotel_tell_box.TabIndex = 12;
            // 
            // hotel_addr_box
            // 
            this.hotel_addr_box.Location = new System.Drawing.Point(104, 105);
            this.hotel_addr_box.Name = "hotel_addr_box";
            this.hotel_addr_box.Size = new System.Drawing.Size(258, 27);
            this.hotel_addr_box.TabIndex = 14;
            // 
            // hotel_post_box
            // 
            this.hotel_post_box.Location = new System.Drawing.Point(104, 77);
            this.hotel_post_box.Name = "hotel_post_box";
            this.hotel_post_box.Size = new System.Drawing.Size(258, 27);
            this.hotel_post_box.TabIndex = 13;
            // 
            // hotel_name_label
            // 
            this.hotel_name_label.AutoSize = true;
            this.hotel_name_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.hotel_name_label.Location = new System.Drawing.Point(18, 26);
            this.hotel_name_label.Name = "hotel_name_label";
            this.hotel_name_label.Size = new System.Drawing.Size(54, 20);
            this.hotel_name_label.TabIndex = 9;
            this.hotel_name_label.Text = "호텔명";
            // 
            // hotel_tell_label
            // 
            this.hotel_tell_label.AutoSize = true;
            this.hotel_tell_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.hotel_tell_label.Location = new System.Drawing.Point(18, 54);
            this.hotel_tell_label.Name = "hotel_tell_label";
            this.hotel_tell_label.Size = new System.Drawing.Size(69, 20);
            this.hotel_tell_label.TabIndex = 10;
            this.hotel_tell_label.Text = "전화번호";
            // 
            // hotel_post_label
            // 
            this.hotel_post_label.AutoSize = true;
            this.hotel_post_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.hotel_post_label.Location = new System.Drawing.Point(18, 83);
            this.hotel_post_label.Name = "hotel_post_label";
            this.hotel_post_label.Size = new System.Drawing.Size(69, 20);
            this.hotel_post_label.TabIndex = 11;
            this.hotel_post_label.Text = "우편번호";
            // 
            // hotel_addr_label
            // 
            this.hotel_addr_label.AutoSize = true;
            this.hotel_addr_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.hotel_addr_label.Location = new System.Drawing.Point(18, 111);
            this.hotel_addr_label.Name = "hotel_addr_label";
            this.hotel_addr_label.Size = new System.Drawing.Size(39, 20);
            this.hotel_addr_label.TabIndex = 12;
            this.hotel_addr_label.Text = "주소";
            // 
            // hotel_lat_box
            // 
            this.hotel_lat_box.Location = new System.Drawing.Point(104, 161);
            this.hotel_lat_box.Name = "hotel_lat_box";
            this.hotel_lat_box.Size = new System.Drawing.Size(258, 27);
            this.hotel_lat_box.TabIndex = 15;
            // 
            // hotel_coordinateX_label
            // 
            this.hotel_coordinateX_label.AutoSize = true;
            this.hotel_coordinateX_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.hotel_coordinateX_label.Location = new System.Drawing.Point(20, 167);
            this.hotel_coordinateX_label.Name = "hotel_coordinateX_label";
            this.hotel_coordinateX_label.Size = new System.Drawing.Size(26, 20);
            this.hotel_coordinateX_label.TabIndex = 14;
            this.hotel_coordinateX_label.Text = "lat";
            // 
            // hotel_update_button
            // 
            this.hotel_update_button.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.hotel_update_button.Font = new System.Drawing.Font("맑은 고딕", 7.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.hotel_update_button.Location = new System.Drawing.Point(387, 77);
            this.hotel_update_button.Name = "hotel_update_button";
            this.hotel_update_button.Size = new System.Drawing.Size(73, 23);
            this.hotel_update_button.TabIndex = 20;
            this.hotel_update_button.Text = "수정";
            this.hotel_update_button.UseVisualStyleBackColor = false;
            this.hotel_update_button.Click += new System.EventHandler(this.hotel_update_button_Click);
            // 
            // hotel_lng_box
            // 
            this.hotel_lng_box.Location = new System.Drawing.Point(104, 189);
            this.hotel_lng_box.Name = "hotel_lng_box";
            this.hotel_lng_box.Size = new System.Drawing.Size(258, 27);
            this.hotel_lng_box.TabIndex = 16;
            // 
            // hotel_coordinateY_label
            // 
            this.hotel_coordinateY_label.AutoSize = true;
            this.hotel_coordinateY_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.hotel_coordinateY_label.Location = new System.Drawing.Point(20, 195);
            this.hotel_coordinateY_label.Name = "hotel_coordinateY_label";
            this.hotel_coordinateY_label.Size = new System.Drawing.Size(31, 20);
            this.hotel_coordinateY_label.TabIndex = 17;
            this.hotel_coordinateY_label.Text = "lng";
            // 
            // hotel_roomNumber_box
            // 
            this.hotel_roomNumber_box.Location = new System.Drawing.Point(104, 133);
            this.hotel_roomNumber_box.Name = "hotel_roomNumber_box";
            this.hotel_roomNumber_box.Size = new System.Drawing.Size(258, 27);
            this.hotel_roomNumber_box.TabIndex = 17;
            // 
            // hotel_roomNumber_label
            // 
            this.hotel_roomNumber_label.AutoSize = true;
            this.hotel_roomNumber_label.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.hotel_roomNumber_label.Location = new System.Drawing.Point(18, 140);
            this.hotel_roomNumber_label.Name = "hotel_roomNumber_label";
            this.hotel_roomNumber_label.Size = new System.Drawing.Size(54, 20);
            this.hotel_roomNumber_label.TabIndex = 19;
            this.hotel_roomNumber_label.Text = "객실수";
            // 
            // hotel_delete_button
            // 
            this.hotel_delete_button.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.hotel_delete_button.Font = new System.Drawing.Font("맑은 고딕", 7.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.hotel_delete_button.Location = new System.Drawing.Point(387, 105);
            this.hotel_delete_button.Name = "hotel_delete_button";
            this.hotel_delete_button.Size = new System.Drawing.Size(73, 23);
            this.hotel_delete_button.TabIndex = 21;
            this.hotel_delete_button.Text = "삭제";
            this.hotel_delete_button.UseVisualStyleBackColor = false;
            this.hotel_delete_button.Click += new System.EventHandler(this.hotel_delete_button_Click);
            // 
            // hotel_box
            // 
            this.hotel_box.Controls.Add(this.hotel_delete_button);
            this.hotel_box.Controls.Add(this.hotel_roomNumber_label);
            this.hotel_box.Controls.Add(this.hotel_roomNumber_box);
            this.hotel_box.Controls.Add(this.hotel_coordinateY_label);
            this.hotel_box.Controls.Add(this.hotel_lng_box);
            this.hotel_box.Controls.Add(this.hotel_update_button);
            this.hotel_box.Controls.Add(this.hotel_coordinateX_label);
            this.hotel_box.Controls.Add(this.hotel_lat_box);
            this.hotel_box.Controls.Add(this.hotel_addr_label);
            this.hotel_box.Controls.Add(this.hotel_post_label);
            this.hotel_box.Controls.Add(this.hotel_tell_label);
            this.hotel_box.Controls.Add(this.hotel_name_label);
            this.hotel_box.Controls.Add(this.hotel_post_box);
            this.hotel_box.Controls.Add(this.hotel_addr_box);
            this.hotel_box.Controls.Add(this.hotel_tell_box);
            this.hotel_box.Controls.Add(this.hotel_create_button);
            this.hotel_box.Controls.Add(this.hotel_name_box);
            this.hotel_box.Controls.Add(this.hotel_search_button);
            this.hotel_box.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.hotel_box.Location = new System.Drawing.Point(503, 12);
            this.hotel_box.Name = "hotel_box";
            this.hotel_box.Size = new System.Drawing.Size(488, 230);
            this.hotel_box.TabIndex = 25;
            this.hotel_box.TabStop = false;
            this.hotel_box.Text = "호텔";
            // 
            // Admin_Form
            // 
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.None;
            this.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.ClientSize = new System.Drawing.Size(998, 662);
            this.Controls.Add(this.hotel_box);
            this.Controls.Add(this.data_box);
            this.Controls.Add(this.log_box);
            this.Controls.Add(this.user_box);
            this.Font = new System.Drawing.Font("맑은 고딕", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Name = "Admin_Form";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Admin_Form";
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.Admin_Form_KeyDown);
            this.data_box.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.Hotel_dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.admin_datagridview)).EndInit();
            this.user_box.ResumeLayout(false);
            this.user_box.PerformLayout();
            this.hotel_box.ResumeLayout(false);
            this.hotel_box.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.GroupBox data_box;
        private System.Windows.Forms.DataGridView admin_datagridview;
        private System.Windows.Forms.Label user_phoneNum_label;
        private System.Windows.Forms.Label user_name_label;
        private System.Windows.Forms.Label user_passWord_label;
        private System.Windows.Forms.Label user_id_label;
        private System.Windows.Forms.TextBox user_name_box;
        private System.Windows.Forms.TextBox user_phoneNum_box;
        private System.Windows.Forms.TextBox user_passWord_box;
        private System.Windows.Forms.Button user_create_button;
        private System.Windows.Forms.ListBox log_box;
        private System.Windows.Forms.TextBox user_id_box;
        private System.Windows.Forms.GroupBox user_box;
        private System.Windows.Forms.Button user_delete_button;
        private System.Windows.Forms.Label user_email_label;
        private System.Windows.Forms.TextBox user_email_box;
        private System.Windows.Forms.Button user_search_button;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.Button user_update_button;
        private System.Windows.Forms.Button hotel_search_button;
        private System.Windows.Forms.TextBox hotel_name_box;
        private System.Windows.Forms.Button hotel_create_button;
        private System.Windows.Forms.TextBox hotel_tell_box;
        private System.Windows.Forms.TextBox hotel_addr_box;
        private System.Windows.Forms.TextBox hotel_post_box;
        private System.Windows.Forms.Label hotel_name_label;
        private System.Windows.Forms.Label hotel_tell_label;
        private System.Windows.Forms.Label hotel_post_label;
        private System.Windows.Forms.Label hotel_addr_label;
        private System.Windows.Forms.TextBox hotel_lat_box;
        private System.Windows.Forms.Label hotel_coordinateX_label;
        private System.Windows.Forms.Button hotel_update_button;
        private System.Windows.Forms.TextBox hotel_lng_box;
        private System.Windows.Forms.Label hotel_coordinateY_label;
        private System.Windows.Forms.TextBox hotel_roomNumber_box;
        private System.Windows.Forms.Label hotel_roomNumber_label;
        private System.Windows.Forms.Button hotel_delete_button;
        private System.Windows.Forms.GroupBox hotel_box;
        private System.Windows.Forms.DataGridView Hotel_dataGridView1;
    }
}