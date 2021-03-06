package com.example.vizax.with.bean;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by VIZAX on 2016/09/16.
 */

public class Misson implements Parcelable {
    private String code;
    private String msg;
    private data data;

    protected Misson(Parcel in) {
        code = in.readString();
        msg = in.readString();
    }

    public static final Creator<Misson> CREATOR = new Creator<Misson>() {
        @Override
        public Misson createFromParcel(Parcel in) {
            return new Misson(in);
        }

        @Override
        public Misson[] newArray(int size) {
            return new Misson[size];
        }
    };

    public Misson.data getData() {
        return data;
    }

    public void setData(Misson.data data) {
        this.data = data;
    }

    /**
     * Created by VIZAX on 2016/09/16.
     */

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(code);
        dest.writeString(msg);
    }


    /**
     * Created by VIZAX on 2016/09/16.
     */

    public static class data {
        private List<currTasks> currTasks;
        private List<preTasks> preTasks;

        public List<Misson.data.currTasks> getCurrTasks() {
            return currTasks;
        }

        public void setCurrTasks(List<Misson.data.currTasks> currTasks) {
            this.currTasks = currTasks;
        }

        public List<Misson.data.preTasks> getPreTasks() {
            return preTasks;
        }

        public void setPreTasks(List<Misson.data.preTasks> preTasks) {
            this.preTasks = preTasks;
        }

        public static class currTasks  {

            private String content;
            private int taskId;
            private String title;
            private int task_icon_type;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getTaskId() {
                return taskId;
            }

            public void setTaskId(int taskId) {
                this.taskId = taskId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getTask_icon_type() {
                return task_icon_type;
            }

            public void setTask_icon_type(int task_icon_type) {
                this.task_icon_type = task_icon_type;
            }
        }

        /**
         * Created by VIZAX on 2016/09/16.
         */

        public static class preTasks  {

            private String content;
            private int taskId;
            private String title;
            private int task_icon_type;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getTaskId() {
                return taskId;
            }

            public void setTaskId(int taskId) {
                this.taskId = taskId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getTask_icon_type() {
                return task_icon_type;
            }

            public void setTask_icon_type(int task_icon_type) {
                this.task_icon_type = task_icon_type;
            }
        }


    }
}
