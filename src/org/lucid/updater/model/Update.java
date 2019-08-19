/*
 * Copyright (C) 2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lucid.updater.model;

import java.io.File;

public class Update extends UpdateBase implements UpdateInfo {

    private UpdateStatus status = UpdateStatus.UNKNOWN;
    private int persistentStatus = UpdateStatus.Persistent.UNKNOWN;
    private File file;
    private int progress;
    private long eta;
    private long speed;
    private int installProgress;
    private boolean availableOnline;
    private boolean isFinalizing;

    public Update() {
    }

    public Update(UpdateBaseInfo update) {
        super(update);
    }

    public Update(UpdateInfo update) {
        super(update);
        status = update.getStatus();
        persistentStatus = update.getPersistentStatus();
        file = update.getFile();
        progress = update.getProgress();
        eta = update.getEta();
        speed = update.getSpeed();
        installProgress = update.getInstallProgress();
        availableOnline = update.getAvailableOnline();
        isFinalizing = update.getFinalizing();
    }

    @Override
    public UpdateStatus getStatus() {
        return status;
    }

    public void setStatus(UpdateStatus status) {
        this.status = status;
    }

    @Override
    public int getPersistentStatus() {
        return persistentStatus;
    }

    public void setPersistentStatus(int status) {
        persistentStatus = status;
    }

    @Override
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    @Override
    public long getEta() {
        return eta;
    }

    public void setEta(long eta) {
        this.eta = eta;
    }

    @Override
    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    @Override
    public int getInstallProgress() {
        return installProgress;
    }

    public void setInstallProgress(int progress) {
        installProgress = progress;
    }

    @Override
    public boolean getAvailableOnline() {
        return availableOnline;
    }

    public void setAvailableOnline(boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

    @Override
    public boolean getFinalizing() {
        return isFinalizing;
    }

    public void setFinalizing(boolean finalizing) {
        isFinalizing = finalizing;
    }
}
