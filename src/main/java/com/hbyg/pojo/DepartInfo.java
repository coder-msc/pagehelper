package com.hbyg.pojo;

public class DepartInfo {
    private Integer depId;

    private String depName;

    private String depDesc;

    private String depState;

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    public String getDepDesc() {
        return depDesc;
    }

    public void setDepDesc(String depDesc) {
        this.depDesc = depDesc == null ? null : depDesc.trim();
    }

    public String getDepState() {
        return depState;
    }

    public void setDepState(String depState) {
        this.depState = depState == null ? null : depState.trim();
    }

	@Override
	public String toString() {
		return "DepartInfo [depId=" + depId + ", depName=" + depName + ", depDesc=" + depDesc + ", depState=" + depState
				+ "]";
	}
    
}